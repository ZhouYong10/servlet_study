<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/9 0009
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>读取所有参数列表</title>
</head>
<body>
<form action="/servlet_readparams" method="post">
    <input type="checkbox" name="maths" checked="checked">数学<br/>
    <input type="checkbox" name="maths" checked="checked">数学<br/>
    <input type="checkbox" name="maths" checked="checked">数学<br/>
    <input type="checkbox" name="physics">物理<br/>
    <input type="checkbox" name="chemistry" checked="checked"/>化学<br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
