<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/8
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        body {background-image:url("/pic/1.jpg");}
        h1 {text-align: center}
        h1 {color:saddlebrown}
        h2 {text-align: center}
        h2 {color:saddlebrown}
    </style>
</head>
<body>
<h2>
    <form action="/returnbookservlet.do" method="get">
        <h2>下面展示您刚刚归还的图书 </h2>
        <h3>书名：</h3>${sessionScope.returnbook.bookname}<br/>
        <h3>作者：</h3>${sessionScope.returnbook.author}<br/>
        <h3>价格：</h3>${sessionScope.returnbook.price}<br/>
        <h3>id:</h3>${sessionScope.returnbook.id}<br/>
    </form>
</h2>

</body>
</html>
