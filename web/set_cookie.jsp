<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/9 0009
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>设置 Cookie 实例</title>
</head>
<body>
<form action="/set_cookie" method="post">
    站点名称：<input type="text" name="name" placeholder="请输入站点名称"/><br/>
    站点URL：<input type="text" name="url" placeholder="请输入站点 URL"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
