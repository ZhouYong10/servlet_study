package com.study;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "ServletReadParams")
public class ServletReadParams extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        String title = "读取所有表单数据实例";
        String docType = "<!DOCTYPE html public \"-//w3c//dtd html 4.0" +
                "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
                "<tr bgcolor=\"#949494\">\n" +
                "<th>参数名称</th><th>参数值</th>\n" +
                "</tr>\n");
        Enumeration<String> paramNames = request.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = paramNames.nextElement();
            out.println("<tr><td>" + paramName + "</td>\n");
            String[] paramValues = request.getParameterValues(paramName);
            if (paramValues.length == 1) {
                String value = paramValues[0];
                if (value.length() == 0) {
                    out.println("<td><i>没有值</i></td>\n");
                } else {
                    out.println("<td>" + value + "</td>\n");
                }
            } else {
                out.println("<td><ul>\n");
                for (int i = 0; i < paramValues.length; i++) {
                    out.println("<li>" + paramValues[i] + "</li>\n");
                }
                out.println("</ul></td>\n");
            }
            out.println("</tr>\n");
        }
        out.println("</table></body></html>");
    }
}
