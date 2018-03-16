<%@ page import="main.Operater" %>
<%@ page import="java.util.Scanner" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/23
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        h1.topmargin {margin-top: 2cm}
        h1 {text-align: center}
        h1 {color:saddlebrown}
        h2.pos_abs
        {
            position:absolute;
            left:400px;
            top:200px
        }
        h2 {text-align: center}
        h2 {color:saddlebrown}
        body {background-image:url("/pic/11.jpg");}
    </style>
    <h1 class="topmargin">欢迎来到还书界面~</h1>
</head>
<body>
<h2 class="pos_abs">
<form action="/returnbookservlet.do" method="post">
请输入还书名称:<input type="text" name="bookname"></br>
请输入还书id:<input type="text" name="id"></br>
请输入还书作者:<input type="text" name="author"></br>
请输入还书价格:<input type="text" name="price"></br>
<input type="submit" value="归还"/>
<a href="welcome.jsp">返回菜单</a><br/>
</form>
</h2>
</body>
</html>
