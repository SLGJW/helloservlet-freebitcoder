package cn.slgjw.javaweb.servlet.helloservlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServletV30", urlPatterns = "/HelloServletV30")
public class HelloServletV30 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        // 得到PrintWriter对象。
        PrintWriter out = resp.getWriter();
        // 向客户端发送字符数据。
        out.println("Hello Servlet ver3.0!");
        out.close();
    }
}