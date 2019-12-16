package com.zking.ssm.book.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.zking.ssm.base.util.PageBean;
import com.zking.ssm.book.model.Book;
import com.zking.ssm.book.model.BookType;
import com.zking.ssm.book.service.IBookService;
import com.zking.ssm.book.util.AlipayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @ModelAttribute
    public void init(Model model){
        Book book=new Book();
        model.addAttribute("book",book);

        //提前初始化相应数据--书本类型
        List<BookType> lst=new ArrayList<>();
        lst.add(new BookType(1,"玄幻"));
        lst.add(new BookType(2,"神话"));
        lst.add(new BookType(3,"修仙"));

        model.addAttribute("btype",lst);
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "book/bookAdd";
    };

    /*
    *
    * 去支付页面
    * */
    @RequestMapping("/toBuy")
    public String toBuy(Book book, HttpSession session){
        System.out.println(book);
        session.setAttribute("book",book);

        return "book/bookBuy";
    };

    /*
    *
    * */
    @RequestMapping("/doBuy")
    public Object doBuy(Book book,HttpServletRequest request,HttpServletResponse response){

        response.setContentType("text/html;charset=utf-8");

        // 提交过来的新消息
        String title="商品";
        Float price=999f;
        int num=1;
        Float sum=price*num;
        String ms="订单";
        SimpleDateFormat ss=new SimpleDateFormat("yyyyMMddHHmmss");
        String ddh=ss.format(Calendar.getInstance().getTime());

        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,
                AlipayConfig.app_id,
                AlipayConfig.merchant_private_key,
                "json", AlipayConfig.charset,
                AlipayConfig.alipay_public_key,
                AlipayConfig.sign_type);

        //获得初始化的AlipayClient
        AlipayClient alipayClient1 = new DefaultAlipayClient(AlipayConfig.gatewayUrl,
                AlipayConfig.app_id,
                AlipayConfig.merchant_private_key,
                "json", AlipayConfig.charset,
                AlipayConfig.alipay_public_key,
                AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        System.out.println(AlipayConfig.notify_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = ddh;
        //付款金额，必填
        String total_amount =sum+"";
        //订单名称，必填
        String subject =title;
        //商品描述，可空
        String body = ms;

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");


        //请求
        String result="";
        try {
            result = alipayClient1.pageExecute(alipayRequest).getBody();
            System.out.println(result);
        } catch (AlipayApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //输出
		/*PrintWriter out=response.getWriter();
		out.print(result);*/
        System.out.println(result);
        try {
            response.getWriter().print(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    };

    @RequestMapping("/successBuy")
    public  String successBuy(HttpServletRequest request){
        System.out.println(request);
        Map<String, String[]> map = request.getParameterMap();
        for (String key : map.keySet()) {
            System.out.println("key= "+ key);
            String[] strings = map.get(key);
            System.out.println(" and value= ");
            for (String string : strings) {
                System.out.println(string+",");
            }
        }
        return "book/successBuy";
    };




  @RequestMapping("/toList")
    public String toListx(){
        return "book/bookList";
    };

    @RequestMapping("/addBook")
    public String addBook(Book book){
        bookService.insert(book);
        return "redirect:queryBookPager";
    };

    @RequestMapping("/queryBookPager")
    public ModelAndView queryBookPager(HttpServletRequest request,
                                       Book book){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Book> books=bookService.queryBookPager(book,pageBean);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("book/bookList");
        mv.addObject("books",books);
        mv.addObject("pageBean",pageBean);
        return mv;
    };
}
