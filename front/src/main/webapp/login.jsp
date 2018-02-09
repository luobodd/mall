<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>登录界面</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link rel="stylesheet" href="${path}/static/login-static/css/style.css" />

<body>

<div class="login-container">
	<h1>登录</h1>
	
	<div class="connect">
		<p>www.luobodd.com</p>
	</div>
	
	<form action="${path}/member/login" method="post" id="loginForm">
		<div>
			<input type="text" name="memberName" class="username" placeholder="用户名" autocomplete="off"/>
		</div>
		<div>
			<input type="password" name="memberPassword" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<button id="submit" type="submit">登 录</button>
	</form>

	<a href="${path}/register.jsp">
		<button type="button" class="register-tis">还有没有账号？</button>
	</a>

</div>

<script src="${path}/static/login-static/js/jquery.min.js"></script>
<script src="${path}/static/login-static/js/common.js"></script>
<!--背景图片自动更换-->
<script src="${path}/static/login-static/js/supersized.3.2.7.min.js"></script>
<script src="${path}/static/login-static/js/supersized-init.js"></script>
<!--表单验证-->
<script src="${path}/static/login-static/js/jquery.validate.min.js?var1.14.0"></script>

</body>
</html>