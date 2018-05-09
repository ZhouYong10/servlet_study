<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/9 0009
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>使用复选框提交数据</title>
</head>
<body>
<form action="/servlet_checkbox" method="post">
    <input type="checkbox" name="runoob" value="菜鸟教程">菜鸟教程<br/>
    <input type="checkbox" name="google" value="谷歌">谷歌<br/>
    <input type="checkbox" name="taobao" value="淘宝">淘宝<br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
