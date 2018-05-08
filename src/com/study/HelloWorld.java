package com.study;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        message = "init(): Hello World. 执行必须的初始化工作";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应内容类型
        resp.setContentType("text/html");

        //实际的逻辑
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("servlet 实例被销毁了");
    }
}
