<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/29
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>文件上传</title>
</head>
<body>
<s:form method="POST" action="upload" enctype="multipart/form-data">
	<s:file label="myFile" name="myFile"/>
	<s:submit value="upload"/>
</s:form>
</body>
</html>
