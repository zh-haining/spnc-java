package com.spnc;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloServlet implements Servlet{
    //该函数只会被调用一次 
    public void init(ServletConfig config) throws ServletException{ 
        System.out.println("HelloServlet init ...");
    }
    
    //得到 ServletConfig 对象 
    public ServletConfig getServletConfig(){ 
        return null; 
    }
    //该函数是服务函数,我们的业务逻辑代码就是写在这里 //该函数每次都会被调用 
    public void service(ServletRequest req, ServletResponse res) throws ServletException, java.io.IOException{
        String msg = "HelloServlet is doing Sth." + new java.util.Date();
        System.out.println(msg);
        res.getWriter().println(msg);
    }
    //该函数时得到 servlet 配置信息 
    public java.lang.String getServletInfo(){ 
        return null; 
    }
    //销毁该 servlet,从内存中清除,该函数被调用一次 
    public void destroy(){ 
        System.out.println("HelloServlet is destroying");
    }

}