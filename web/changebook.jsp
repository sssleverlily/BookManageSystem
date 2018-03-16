<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/23
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>欢迎来到更改图书界面</h1>
    <style type="text/css">
        body {background-image:url("/pic/3.jpg");}
        h1 {text-align: center}
        h1 {color:saddlebrown}
        h2 {text-align: center}
        h2 {color:saddlebrown}
    </style>
</head>
<body>
<h2>您想以何种方式修改图书</h2><br/>
<h2>
<form action="idchangebook.jsp" method="get">
    <input type="submit" name="deleteid" value="按id更改" >
</form>
<form action="namechangebook.jsp" method="get">
    <input type="submit" name="deletename" value="按书名更改">
</form>
<a href="index.jsp">返回菜单</a></br>
</h2>
</body>
</html>
