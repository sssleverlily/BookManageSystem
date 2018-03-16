<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/23
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@   page   import= "main.* "%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<form action="/clearbookservlet.do" method="post" >
<head>
    <style type="text/css">
        body {background-image:url("/pic/3.jpg");}
        h1 {text-align: center}
        h1 {color:saddlebrown}
        h2 {text-align: center}
        h2 {color:saddlebrown}
        </style>
    <h1>欢迎来到清空图书界面</h1>
</head>
<body>
<h2>图书正在清空中....</h2>
<h2>
清空成功~
    <a href="welcome.jsp">返回菜单</a><br/>
</h2>
</body>
</form>
</html>
