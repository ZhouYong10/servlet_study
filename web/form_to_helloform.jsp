<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/9 0009
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>使用表单提交数据</title>
</head>
<body>
<form action="/helloform" method="post">
    <input type="text" name="name" placeholder="请输入站点名"><br/>
    <input type="url" name="url" placeholder="请输入站点地址"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
