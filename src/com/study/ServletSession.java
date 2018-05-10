package com.study;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServletSession extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //如果不存在session会话，则创建一个session对象
        HttpSession session = request.getSession();
        System.out.println(session + "============================");

        //获取session创建时间
        Date createTime = new Date(session.getCreationTime());

        //获取该网页的最后一次访问时间
        Date lastAccessedTime = new Date(session.getLastAccessedTime());

        //设置日期输出格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String title = "Servlet Session 实例";
        Integer visitCount = new Integer(0);
        String visitCountKey = new String("visitCount");
        String userIDKey = new String("userID");
        String userID = new String("Runoob");

        //检查网页上是否有新的访问者
        if (session.isNew()) {
            session.setAttribute(userIDKey, userID);
            session.setAttribute(visitCountKey, visitCount);
        } else {
            if (session.getAttribute(visitCountKey) == null && session.getAttribute(userIDKey) == null) {
                session.setAttribute(visitCountKey, visitCount);
                session.setAttribute(userIDKey, userID);
            }
            visitCount = (Integer) session.getAttribute(visitCountKey);
            visitCount = visitCount + 1;
            userID = (String) session.getAttribute(userIDKey);
        }
        session.setAttribute(visitCountKey, visitCount);

        //设置响应内容
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String docType = "<!DOCTYPE html>\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<h2 align=\"center\">Session信息</h2>\n" +
                "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
                "<tr bgcolor=\"#949494\">\n" +
                "<th>Session信息</th><th>Session值</th>\n" +
                "</tr>\n" +
                "<tr><td>id</td><td>" + session.getId() + "</td></tr>\n" +
                "<tr><td>创建时间</td><td>" + dateFormat.format(session.getCreationTime()) + "</td></tr>\n" +
                "<tr><td>最后访问时间</td><td>" + dateFormat.format(session.getLastAccessedTime()) + "</td></tr>\n" +
                "<tr><td>用户</td><td>" + userID + "</td></tr>\n" +
                "<tr><td>访问统计</td><td>" + visitCount + "</td></tr>\n" +
                "</table></body></html>");
    }
}
