package com.study;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ServletDisplayHead extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String title = "HTTP Header 请求实例";
        String docType = "<!DOCTYPE html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
                "<tr bgcolor=\"#949494\">\n" +
                "<th>Header 名称</th><th>Header 值</th>\n" +
                "</tr>\n");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            out.println("<tr><td>" + headerName + "</td>\n");
            String headerValue = request.getHeader(headerName);
            out.println("<td>" + headerValue + "</td></tr>\n");
        }
        out.println("</table>\n");

        out.println("<table width=\"100%\" border=\"1\" align=\"center\">\n" +
                "<tr bgcolor=\"#949494\">\n" +
                "<th>方法名</th><th>返回值</th></tr>\n" +
                "<tr><td>getAuthType</td><td>" + request.getAuthType() + "</td></tr>\n"+
                "<tr><td>getCharacterEncoding</td><td>" + request.getCharacterEncoding() + "</td></tr>\n"+
                "<tr><td>getContentType</td><td>" + request.getContentType() + "</td></tr>\n"+
                "<tr><td>getContextPath</td><td>" + request.getContextPath() + "</td></tr>\n"+
                "<tr><td>getMethod</td><td>" + request.getMethod() + "</td></tr>\n"+
                "<tr><td>getPathInfo</td><td>" + request.getPathInfo() + "</td></tr>\n"+
                "<tr><td>getProtocol</td><td>" + request.getProtocol() + "</td></tr>\n"+
                "<tr><td>getQueryString</td><td>" + request.getQueryString() + "</td></tr>\n"+
                "<tr><td>getRemoteAddr</td><td>" + request.getRemoteAddr() + "</td></tr>\n"+
                "<tr><td>getRemoteHost</td><td>" + request.getRemoteHost() + "</td></tr>\n"+
                "<tr><td>getRemoteUser</td><td>" + request.getRemoteUser() + "</td></tr>\n"+
                "<tr><td>getRemotePort</td><td>" + request.getRemotePort() + "</td></tr>\n"+
                "<tr><td>getRequestURI</td><td>" + request.getRequestURI() + "</td></tr>\n"+
                "<tr><td>getRequestURL</td><td>" + request.getRequestURL() + "</td></tr>\n"+
                "<tr><td>getRequestedSessionId</td><td>" + request.getRequestedSessionId() + "</td></tr>\n"+
                "<tr><td>getServletPath</td><td>" + request.getServletPath() + "</td></tr>\n"+
                "<tr><td>getServerName</td><td>" + request.getServerName() + "</td></tr>\n"+
                "<tr><td>getServerPort</td><td>" + request.getServerPort() + "</td></tr>\n"+
                "<tr><td>isSecure</td><td>" + request.isSecure() + "</td></tr>\n"+
                "<tr><td>getContentLength</td><td>" + request.getContentLength() + "</td></tr>\n");

        out.println("</table></body></html>");
    }
}
