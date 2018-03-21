<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/19
  Time: 8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        body {background-image:url("/pic/login3.png");}
        h1 {text-align: center}
        h2 {text-align: center}
        h3 {text-align: center}
        h4.pos_abs
        {
            position:absolute;
            left:150px;
            top:10px
        }
    </style>
    <title>登录</title>
</head>
<body>
<h1>欢迎登陆机智曾曾图书管理系统</h1>
<div style="background-image: url(/pic/login1.png) ">
<h2>
    <form action="/loginservlet.do" method="post">
        用户名:<input type="text" name="account"/><br>
        密码:<input type="text" name="password"/><br>
        <input type="submit" value="登录"/>
        <h3><a href="register.jsp" >没有账号？赶紧注册</a><br></h3>
    </form>
</h2>
</div>
</body>
</html>
