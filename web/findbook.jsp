<%@ page import="java.util.Scanner" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/23
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>欢迎来到查找图书界面~</h1>
    <style type="text/css">
        body {background-image:url("/pic/12.jpg");}
        h1 {text-align: center}
        h1 {color:saddlebrown}
        h2 {text-align: center}
        h2 {color:saddlebrown}
    </style>
</head>
<body>
<br action="findbookservlet" method="post">
<h2>请输入要查找的书名：</h2>
<h2>
<input type="text" value=" " name="myname" />
<input type="submit" value="提交" name="namebutton"/>
<a href="welcome.jsp">返回菜单</a></br>
</h2>

</body>
</html>
