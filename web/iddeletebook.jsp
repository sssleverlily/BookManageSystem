<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/6
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        h1 {text-align: center}
        h2 {text-align: center}
    </style>
    <h1>这是id删除界面</h1>
</head>
<body>
<h2>
<form action="/iddeletebookservlet.do" method="post">
    请输入id:<input type="text"name="id"/><br/>
    <input type="submit" value="确认删除"/>
    <a href="index.jsp">返回菜单</a><br/>
</form>
</h2>
</body>
</html>
