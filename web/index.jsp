<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/8 0008
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
  <head>
    <title>Servlet 学习</title>
  </head>
  <body>
  <h2>Servlet 学习</h2>
  <a href="/helloworld" target="_blank">Hello World</a><br/><br/>
  <a href="/helloform?name=百度百科&url=http://www.baidubaike.com" target="_blank">简单提交数据</a><br/><br/>
  <a href="./form_to_helloform.jsp" target="_blank">表单提交简单数据</a><br/><br/>
  <a href="./checkbox.jsp" target="_blank">获取复选框数据</a><br/><br/>
  <a href="./read_params.jsp" target="_blank">获取所有表单数据</a><br/><br/>
  <a href="/display_header" target="_blank">显示请求头信息以及请求相关信息</a><br/><br/>
  </body>
</html>
