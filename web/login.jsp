<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/28
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<s:head/>
	<title>登录</title>
</head>
<body>
<h2>Struts2登录表单</h2>
<s:form action="login" method="POST">
	<s:textfield label="用户名" name="username"  requiredLabel="true" requiredPosition="left"/>
	<s:password label="密码" name="password"/>
	<s:submit value="提交"/>
</s:form>
</body>
</html>
