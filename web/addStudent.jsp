<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/30
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>添加</title>
</head>
<body>
<h2>添加学生</h2>
<s:actionerror/>
<s:form action="add" method="POST">
	<s:textfield name="username" label="用户名"/>
	<s:textfield name="age" label="年龄"/>
	<s:textfield name="email" label="邮箱"/>
	<s:password name="password" label="密码"/>
	<s:password name="repassword" label="确认密码"/>
	<s:textfield name="score" label="成绩"/>
	<s:radio list="{'男','女'}" name="gender" label="性别" />
	<s:submit value="提交"/>
</s:form>
</body>
</html>
