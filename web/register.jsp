<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/19
  Time: 8:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        /*body {background-image:url("/pic/2.jpg");}*/
        h1 {text-align: center}
        h2 {text-align: center}
    </style>
    <title>注册界面</title>
</head>
<body>
<h1>欢迎注册</h1>
<h2>
    <form action="/registerservlet.do" method="post">
        <img src="/pic/icon_login_account.png" >
        用户名:<input type="text" name="account1"/><br/>
        <img src="/pic/icon_login_pw.png" >
        密码:<input type="text" name="password1"/>
        <img src="/pic/icon_nosee_pass.png" ><br/>
    </form>
   <div>
       <h5>请选择您想设定的头像(必选)</h5>
       <input type="checkbox"  name="head" >
       <img src="/pic/18.jpg"  height="100" width="100">
       <input type="checkbox"  name="head" >
       <img src="/pic/19.jpg"  height="100" width="100">
       <input type="checkbox"  name="head">
       <img src="/pic/20.jpg"  height="100" width="100">
       <input type="checkbox"  name="head">
       <img src="/pic/21.jpg"  height="100" width="100">
       <input type="checkbox"  name="head">
       <img src="/pic/22.jpg"  height="100" width="100">
       <input type="checkbox"  name="head">
       <img src="/pic/23.jpg"  height="100" width="100">
       <input type="checkbox"  name="head">
       <img src="/pic/24.jpg"  height="100" width="100">
       <input type="checkbox"  name="head">
       <img src="/pic/25.jpg"  height="100" width="100"><br>
       <input type="submit" value="注册" onclick="window.location.href='index1.jsp'"/>
    </div>
</h2>
</body>
</html>
