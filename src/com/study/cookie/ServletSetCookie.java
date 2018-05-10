package com.study.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class ServletSetCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie name = new Cookie("name", URLEncoder.encode(request.getParameter("name"), "ISO8859-1"));
        Cookie url = new Cookie("url", request.getParameter("url"));

        name.setMaxAge(60 * 60 * 24);
        url.setMaxAge(60 * 60 * 24);

        response.addCookie(name);
        response.addCookie(url);

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();

        String title = "设置 Cookie 实例";
        String docType = "<!DOCTYPE html>\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "<li><b>站点名称：</b>" +
                new String(request.getParameter("name").getBytes("iso8859-1"), "utf-8") + "</li>\n" +
                "<li><b>站点 URL：</b>" + request.getParameter("url") + "</li>\n" +
                "</ul>\n" +
                "<p>设置 Cookie 完成</p>" +
                "<a href=\"/read_cookie\">显示 Cookie</a>" +
                "</body></html>");
    }
}
