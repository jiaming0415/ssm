package com.zking.ssm.check.controller;

import com.zking.ssm.base.util.HttpUtils;
import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.check.model.Realauth;
import com.zking.ssm.check.service.IRealauthService;
import com.zking.ssm.user.model.Userinfo;
import com.zking.ssm.user.service.IUserinfoService;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/realauth")
public class RealauthController {
    private final String DEFAULT_PATH="/uploads";

    @Autowired
    IRealauthService iRealauthService ;
//    @Autowired
//    IUserinfoService userinfoService ;


    @RequestMapping(value="/authentication",produces="application/json;charset=utf-8")
    @ResponseBody
    @CrossOrigin
    public String RealAuthentication(Realauth realauth){

        String host = "https://naidcard.market.alicloudapi.com";
        String path = "/nidCard";
        String method = "GET";
        String appcode = "4a4ebff79bce42a29f1b50d3ede2c4e5";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        // headers.put("content-type","application/json;charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("idCard", realauth.getIdnumber());
        querys.put("name", realauth.getRealname());
        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //System.out.println(EntityUtils.toString(response.getEntity(),"UTF-8"));
            return EntityUtils.toString(response.getEntity(),"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/add")
    @ResponseBody
    @CrossOrigin
    public int add(Realauth realauth){
        //realauth.setState((byte)1);
        int insert=0;
        try {
            System.out.println(realauth);
            insert = iRealauthService.insertSelective(realauth);
            System.out.println(insert);
//            if(insert>0){            //实名认证成功
//                //给userinfo值
//                Userinfo userinfo=new Userinfo();
//                userinfo.setId(realauth.getApplierId());
//                userinfo.setRealname(realauth.getRealname());
//                userinfo.setIdnumber(realauth.getIdnumber());
//                userinfoService.updateByPrimaryKeySelective(userinfo);
//            }
            System.out.println(insert);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return insert;

    }



    @RequestMapping("/query")
    @ResponseBody
    @CrossOrigin
    public Realauth query(int applierId){
        Realauth realauth = iRealauthService.selectByapplierId((long)applierId);

        return realauth;
    }


    @RequestMapping("/selectAll")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> selectAll(Realauth realauth, HttpServletRequest request){
        Map<String,Object>map = new HashMap<>();
      PageBean pageBean=new PageBean();
      pageBean.setRequest(request);
      List<Map> realauths = iRealauthService.selectPager(realauth,pageBean);
      map.put("list",realauths);
      map.put("total",pageBean.getTotal());

      return map;
    }


    @RequestMapping("/update")
    @ResponseBody
    @CrossOrigin
    public int update(Realauth realauth){
//        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
//        Date d= new Date();
//        String str = sdf.format(d);
        int i = 0;
        try {
            realauth.setAudittime(new Date());
            i = iRealauthService.updateByPrimaryKeySelective(realauth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
    @RequestMapping("/deleteByUserid")
    @ResponseBody
    @CrossOrigin
    public int deleteByUserid(Realauth realauth){
        int i = iRealauthService.deleteByUserid(realauth.getApplierId());
        return i;
    }

    @RequestMapping("/upload")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> upload(HttpServletRequest request,MultipartFile file){
        Map<String,Object> map=new HashMap<>();
        System.out.println(file.getContentType());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")));
        String fileName = UUID.randomUUID().toString().replace("-","")+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //上传文件
        String relativePath = DEFAULT_PATH+ File.separator+fileName;
        String realPath = request.getServletContext().getRealPath(relativePath);
        System.out.println(relativePath);
        System.out.println(realPath);
        try {
            file.transferTo(new File(realPath));
        }catch (Exception e){
            e.printStackTrace();
        }
        map.put("fileName",fileName);
        return map;
    }

    @RequestMapping(value="/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request, @RequestParam String realname){
        try {

            String relativePath = DEFAULT_PATH+ File.separator+realname;
            String realPath = request.getServletContext().getRealPath(relativePath);


            //下载关键代码
            File file=new File(realPath);
            HttpHeaders headers = new HttpHeaders();//http头信息
            String downloadFileName = new String(realname.getBytes("UTF-8"),"iso-8859-1");//设置编码
            System.out.println("downloadFileName:"+downloadFileName);
            headers.setContentDispositionFormData("attachment", downloadFileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            //MediaType:互联网媒介类型  contentType：具体请求中的媒体类型信息
            return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
