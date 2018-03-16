<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/6
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        h1 {text-align: center}
        h2 {text-align: center}
    </style>
    <h1>这是id更改图书界面</h1>
</head>
<body>
<h2>
<form action="idchangebookservlet" method="post">
<h2>请输入要修改的图书id：</h2>
<input type="text" value=" " name="id" />
<input type="submit" value="提交" name="idbutton" />
</form>
</h2>
<h2>
<form action="idchangebookservlet" method="post" >
    <h2>请输入修改后的书的id：</h2>
    <input type="text" value=" " name="changeid" />
    <input type="submit" value="提交" name="namebutton1" />
    <a href="index.jsp">返回菜单</a></br>
</form>
</h2>
</body>
</html>
