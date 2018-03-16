<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/6
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        h1 {text-align: center}
        h2 {text-align: center}
    </style>
    <h1>这是书名修改图书界面</h1>
</head>
<body>
<form  action="/namechangebookservlet.do" method="post">
    <h2>请输入要修改的书的书名：</h2>
    <input type="text" value=" " name=bookname" />
    <input type="submit" value="提交" name="namebutton"/>
    <a href="index.jsp">返回菜单</a><br/>
</form>


<form action="/namechangebookservlet.do" method="post" enctype="multipart/form-data">
    <h2>请输入修改后的书的书名：</h2>
<input type="text" value=" " name="changebookname" />
<input type="submit" value="提交" name="namebutton2" />
</form>


</body>
</html>
