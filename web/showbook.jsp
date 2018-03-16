<%@ page import="main.Operater" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/23
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        body {background-image:url("/pic/2.jpg");}
        table.one
        {
            table-layout: fixed;
        }
        table.two
        {
            table-layout: fixed;
        }
        table.three
        {
            table-layout:fixed;
        }
        table.four{
            table-layout: fixed;
        }
        title{text-align:center }
        title{color: pink}
        h1 {text-align: center}
        h1 {color:saddlebrown}
        h2 {text-align: center}
        h2 {color:saddlebrown}
    </style>
    <title>欢迎来到展示图书界面~</title>
<%--</head>--%>
<%--<br>--%>
<%--<br action="showbookservlet" method="post" enctype="multipart/form-data">--%>
<%--<h1>本馆藏书如下：~</h1></br>--%>
<%--<%--%>
    <%--Operater operater = new Operater();--%>
    <%--operater.printAllbook();--%>
<%--%>--%>
</head>
<body>
<%--<jsp:useBean id="adbook"  class="main.Book"  />--%>
   <%--图书书名:<input type="text" name="bookname"><jsp:getProperty name="adbook" property="bookname"/></br>--%>
   <%--图书作者:<input type="text" name="author"><jsp:getProperty name="adbook" property="author"/></br>--%>
   <%--图书价格:<input type="text" name="price"><jsp:getProperty name="adbook" property="price"/></br>--%>
   <%--图书id:<input type="text"name="id"><jsp:getProperty name="adbook" property="id"/></br>--%>
<%--</body>--%>
<%----%>
<%----%>
<%--<br action="findbookservlet" method="post" enctype="multipart/form-data">--%>
<%--<%--%>
    <%--List<Map<String, Object>> list = (List<Map<String, Object>>) request.getAttribute("lists");//对servlet中的数据的接收--%>
    <%--if (list == null || list.size() < 1) {//判断数据库中有没有数据--%>
        <%--System.out.println("数据库中没有数据");--%>
    <%--} else {--%>
<%--%>--%>
<%--<div class="head">所有图书信息</div>--%>
    <%--<thead>--%>
    <%--<tr align="center">--%>
        <%--<td><b>图书id</b></td>--%>
        <%--<td><b>图书名称</b></td>--%>
        <%--<td><b>图书作者</b></td>--%>
        <%--<td><b>图书价格</b></td>--%>
    <%--</tr>--%>
    <%--</thead>--%>
        <%--<%--%>
        <%--for (int i = 0; i < list.size(); i++) {//对接收的数据进行遍历打印--%>
    <%--%>--%>
    <%--<tr align="center">--%>
        <%--<td><input type="checkbox" value="<%=list.get(i).get("id")%>"></td>//第二get是字段，第一get是第二get对应的值--%>
        <%--<td><%=list.get(i).get("id")%></td>--%>
        <%--<td><%=list.get(i).get("bookname")%></td>--%>
        <%--<td><%=list.get(i).get("author")%></td>--%>
        <%--<td><%=list.get(i).get("price")%></td>--%>
    <%--</tr>--%>
   <%--<%--%>
        <%--}--%>
    <%--}--%>
   <%--%>--%>
    <%--<br action="borrowbookservlet" method="post" enctype="multipart/form-data">--%>
    <%--<h1>借书成功</h1></br>--%>
<%----%>
    <%--<br action="returnbookservlet" method="post" enctype="multipart/form-data">--%>
    <%--<h1>还书成功</h1></br>--%>
<h2>
<form action="/Addbookservlet.do" method="get">
    <h2>下面展示您刚刚添加的图书 </h2>
    <table class="one" border="1" width="50%">
        <tr>
            <td width="20%">书名</td>
            <td width="30%">${sessionScope.adbook.bookname}</td>
        </tr>
    </table>
    <table class="two" border="1" width="50%">
        <tr>
            <td width="20%">作者</td>
            <td width="30%">${sessionScope.adbook.author}</td>
        </tr>
    </table>
    <table class="three" border="1" width="50%">
        <tr>
            <td width="20%">价格</td>
            <td width="30%">${sessionScope.adbook.price}</td>

        </tr>
    </table>
    <table class="four" border="1" width="50%">
        <tr>
            <td width="20%">id</td>
            <td width="30%">${sessionScope.adbook.id}</td>
        </tr>
    </table>
    <a href="index1.jsp">返回菜单</a><br>
    <a href="remainderbook.jsp">展示本馆藏书</a><br>
</form>
</h2>

<form action="deletebook.jsp" method="get">

</form>

<form action="/borrowbookservlet.do" method="get">

</form>


<h2>
<form action="/findbookservlet.do" method="get">
    <h2>下面展示您刚刚查找的图书</h2>
    <table class="one" border="1" width="50%">
        <tr>
            <td width="20%">书名</td>
            <td width="30%">${sessionScope.findbook.bookname}</td>
        </tr>
    </table>
    <table class="two" border="1" width="50%">
        <tr>
            <td width="20%">作者</td>
            <td width="30%">${sessionScope.findbook.author}</td>
        </tr>
    </table>
    <table class="three" border="1" width="50%">
        <tr>
            <td width="20%">价格</td>
            <td width="30%">${sessionScope.findbook.price}</td>

        </tr>
    </table>
    <table class="four" border="1" width="50%">
        <tr>
            <td width="20%">id</td>
            <td width="30%">${sessionScope.findbook.id}</td>
        </tr>
    </table>
    <a href="index1.jsp">返回菜单</a><br/>
    <a href="remainderbook.jsp">展示本馆藏书</a><br>
</form>
</h2>










</html>
