package com.study.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

public class ServletReadCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        String title = "获取 Cookie 实例";
        String docType = "<!DOCTYPE html>\n";

        PrintWriter out = response.getWriter();
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h2 align\"center\">" + title + "</h2>\n");
        if (cookies != null) {
            out.println("<h2>Cookie 的名称和值</h2>\n");
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                if (cookie.getName().compareTo("name") == 0) {
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    out.println("已删除的 cookie：" + cookie.getName() + "<br/>\n");
                }
                out.println("名称：" + URLDecoder.decode(cookie.getName(), "utf-8") + ", ");
                out.println("值：" + URLDecoder.decode(cookie.getValue(), "utf-8") + "<br/>\n");
            }
        } else {
            out.println("<h2>No Cookie fonds</h2>\n");
        }
        out.println("</body></html>\n");
    }
}
