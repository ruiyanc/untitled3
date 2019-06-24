<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/24
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>springMVC</title>
</head>
<body>
<h1>文件上传</h1>
<form action="/form" enctype="multipart/form-data" method="post">
<input type="text" name="name">
<input type="file" name="file">
	<input type="submit">
</form>
</body>
</html>
