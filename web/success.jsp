<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/29
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>成功</title>
</head>
<body>

you have success upload <s:property value="myFileFileName"/>
<hr>
you are login success.
<hr>
<%--取contextMap,写#+key名字,取ValueStack,直接key名字--%>
valueStack:<s:property value="username"/><br>
contextMap:<s:property value="#username"/><br>
session:<s:property value="#session.username"/><br>
request:<s:property value="#request.username"/><br>
application:<s:property value="#application.username"/><br>
<s:debug/>
</body>
</html>
