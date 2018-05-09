package com.study;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ServletCheckbox extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        String title = "读取复选框数据";
        String docType = "<!DOCTYPE html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "<li><b>菜鸟教程名称：</b>" + holdCharset(request.getParameter("runoob")) + "</li>\n" +
                "<li><b>google名称：</b>" + holdCharset(request.getParameter("google")) + "</li>\n" +
                "<li><b>淘宝名称：</b>" + holdCharset(request.getParameter("taobao")) + "</li>\n" +
                "</ul>\n" +
                "</body></html");
    }

    private String holdCharset(String s) throws UnsupportedEncodingException {
        return new String(s.getBytes("ISO8859-1"), "utf-8");
    }
}
