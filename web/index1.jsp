<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/9
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>机智曾曾图书管理系统</h1>
    <style type="text/css">
        body {background-image:url("/pic/8.jpg");}
        p.italic {font-style:italic}
        h1 {text-align: center}
        h1 {color:pink}
        h2 {text-align: center}
        h2 {color:pink}
        h5 {text-align: right}
        ul
        {
            float:left;
            width:100%;
            padding:0;
            margin:0;
            list-style-type:none;
        }
        a
        {
            float:left;
            width:7em;
            text-decoration:none;
            color:black;
            background-color:pink;
            padding:0.5em 0.7em;
            border-right:1px solid white;
        }
        a:hover {background-color:#87CEFA}
        li {display:inline}
    </style>
</head>
<h2>欢迎来到机智曾曾图书管理系统~</h2>
<body>
<form>
<ul><p class="italic" >

    <li><a href="addbook.jsp">增加图书<br></a></li>
    <li><a href="deletebook.jsp">删除图书<br></a></li>
    <li><a href="changebook.jsp">改动图书<br></a></li>
    <li><a href="findbook.jsp">查找图书<br></a></li>
    <li><a href="borrowbook.jsp">借出图书<br></a></li>
    <li><a href="returnbook.jsp">归还图书<br></a></li>
    <li><a href="clearbook.jsp">清空图书<br></a></li>
    <li><a href="remainderbook.jsp">剩余图书<br></a></li>
    <li><a href="LoginOut">退出登录<br></a></li>
</p>
</ul>
</form>
  <div>
  </div>
</body>


</html>
