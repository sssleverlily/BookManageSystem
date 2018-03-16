<%@ page import="main.Operater" %>
<%@ page import="java.util.Scanner" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/23
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        body {background-image:url("/pic/10.jpg");}
        h1 {text-align: center}
        h1 {color:saddlebrown}
        h4 {text-align: center}
        h4 {color:saddlebrown}
    </style>
    <h1>欢迎来到借书界面~</h1>
</head>
<body>
<h2>
<form action="/borrowbookservlet.do" method="post">
    <h4>请输入借书年份:<input type="text" name="year">&nbsp;</h4>
    <h4>请输入借书月份:<input type="text" name="month">&nbsp;</h4>
    <h4>请输入借书日期:<input type="text" name="day">&nbsp;</h4>
    <br>
    <h4>请输入借书名称:<input type="text" name="bookname"></h4>
    <h4>请输入借书价格：<input type="text" name="price"></h4>
    <h4>请输入借书id:<input type="text" name="id"></h4><br/>
<h4><input type="submit" value="确认借书"/>
    <a href="index.jsp">返回菜单</a></h4><br/>
</form>
</h2>
</body>
</html>
