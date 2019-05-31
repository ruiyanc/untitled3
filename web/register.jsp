<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/29
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<s:head/>
	<title>注册</title>
</head>
<body>
<h2>Struts2的form标签</h2>
<s:form action="register" method="POST" enctype="multipart/form-data">
	<s:textfield name="username" label="用户名"  requiredLabel="true" requiredPosition="left"/>
	<s:password name="password" label="密码" showPassword="true"/>
	<s:textfield name="birthday" label="生日"/>
	<s:hidden value="aaaa" />
	<s:select list="#{'':'-请选择城市-','gz':'广州','sz':'深圳'}" label="城市" name="city"/>
	<s:checkboxlist list="#{'写代码':'写代码','泡妞':'泡妞'}"  name="hobby" label="爱好"/>
	<s:radio list="#{'true':'已婚','false':'未婚'}" name="married" label="是否已婚"/>
	<s:textarea label="备注" rows="10" cols="50"/>
	<s:token/>
	<s:submit value="注册" align="left"/>
	<s:reset value="重置"/>
</s:form>
<s:a cssErrorClass="ui-corner-all" label="这是a标签" href="http://www.google.com"/>
<%--<form action="<s:url action="regist"/>" method="post">
	用户名：<input type="text" name="username"><br>
	密码：<input type="password" name="password"><br>
	生日：<input type="text" name="birthday"><br>
	爱好：<input type="checkbox" name="hobby" value="写代码">写代码
	<input type="checkbox" name="hobby" value="泡妞">泡妞
	<input type="checkbox" name="hobby" value="买房">买房<br>
	是否已婚：<input type="radio" value="true" name="married">已婚
	<input type="radio" value="false" name="married">未婚<br>
	<input type="submit" value="注册">
</form>--%>
</body>
</html>
