<%@ page %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/23
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>欢迎来到增加图书界面~</h1>
    <style type="text/css">
        body {background-image:url("/pic/2.jpg");}
        h1 {text-align: center}
        h1 {color:saddlebrown}
        h2 {text-align: center}
        h2 {color:saddlebrown}
    </style>
</head>
<body>
<h2>
    <form action="/Addbookservlet.do" method="post">
        请输入书名:<input type="text" name="bookname"/><br/>
        请输入作者:<input type="text" name="author"/><br/>
        请输入价格:<input type="text" name="price"/><br/>
        请输入id:<input type="text"name="id"/><br/>
        <input type="submit" value="添加"/>
        <a href="index1.jsp">返回菜单</a><br/>
    </form>
</h2>
</body>
</html>
