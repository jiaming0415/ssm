package com.zking.ssm.user.controller;

import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.user.model.Userfile;
import com.zking.ssm.user.service.IUserfileService;
import org.apache.commons.io.FileUtils;
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

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

@Controller
@RequestMapping("/userfile")
public class UserfileController {

    private final String DEFAULT_PATH="/uploads2";

    @Autowired
    IUserfileService iUserfileService;


    @RequestMapping("/query")
    @ResponseBody
    @CrossOrigin
    public  List<Userfile> query(long applierId){
        List<Userfile> userfiles = iUserfileService.selectOne(applierId);
        return userfiles;
    }

    @RequestMapping("/upload")
    @ResponseBody
    @CrossOrigin
    public Map<String, Object> upload(MultipartFile file,HttpServletRequest request){
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
            //e.printStackTrace();
        }
        return null;
    }
    @RequestMapping("/selectAll")
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> selectAll(Userfile userfile, HttpServletRequest request){
        Map<String,Object>map = new HashMap<>();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Map> realauths =iUserfileService.selectPager(userfile,pageBean);
        map.put("list",realauths);
        map.put("total",pageBean.getTotal());

        return map;
    }


    @RequestMapping("/update")
    @ResponseBody
    @CrossOrigin
    public int update(Userfile realauth){
        realauth.setAudittime(new Date());
        int i = iUserfileService.updateByPrimaryKeySelective(realauth);
        return i;
    }

    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public int insert(Userfile realauth){
        int i = iUserfileService.insertSelective(realauth);
        return i;
    }








}
