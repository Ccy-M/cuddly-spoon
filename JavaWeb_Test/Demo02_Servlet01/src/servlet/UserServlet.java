package servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
/*
* servlet开发流程
* 1.创建JavaWeb项目 同时将tomcat添加为当前项目的依赖
* 2.重写service方法 service(HttpServletRequest,HttpServletResponse)
* 3.在service方法中 定义业务处理代码
*4.在web.xml中配置servlet请求时对应的请求映射路径
*
*
* 1.servlet-opi.jar 导入问题
*.Content-Type响应头的问题
*
*
* */

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
                            throws ServletException, IOException
    {
    //1.从request 对象中获取请求中的任何信息（username 参数）
        String username = req.getParameter("username");//获取请求参数
    //2 处理业务代码
        String info = "YES";
        if(username.equals("cy")){
            info = "NO";
        }

        //3 将要相应的数据放入req对象中
       PrintWriter WRITER = resp.getWriter();
        WRITER.write(info);

    }
}