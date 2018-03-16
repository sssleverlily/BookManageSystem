<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/22
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>机智曾曾图书管理系统</title>
    <style type="text/css">
      body {background-image:url("/pic/8.jpg");}
      h1 {text-align: center}
      h1 {color:deepskyblue}
      h2 {text-align: center}
      h2 {color:deepskyblue}
    </style>
  </head>
  <body>
  <div class="bigone">
  <h1>欢迎来到机智曾曾图书管理系统~</h1>
  <h2>
<p class="normal">
  <div id="menu">
    <div id="add"><a href="addbook.jsp">增加图书</a></div>
    <div id="delete"><a href="deletebook.jsp">删除图书</a></div>
    <div id="change"><a href="changebook.jsp">更改图书</a> </div>
     <div id="find"><a href="findbook.jsp">查找图书</a> </div>
    <div id="borrow"><a href="borrowbook.jsp">借出图书</a></div>
    <div id="return"><a href="returnbook.jsp">归还图书</a></div>
      <div id="clear"><a href="clearbook.jsp">清空图书</a></div>
    <div id="show"><a href="remainderbook.jsp">展示剩余图书</a></div>
    <div id="out"><a href="LoginOut">退出登陆</a></div>

  </div>
  </p>
  </h2>
  </div>
  </body>
</html>
