<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>注册界面</title>
<link rel="stylesheet" href="${path}/static/login-static/css/style.css" />
<body>

<div class="register-container">
	<h1>注册</h1>
	
	<div class="connect">
		<p>世界的联系,分享世界</p>
	</div>
	<%--/member/register--%>
	<form action="${path}/member/register" method="post" id="registerForm">
		<div>
			<input type="text" name="memberName" class="username" placeholder="您的用户名" autocomplete="off"/>
		</div>
		<div>
			<input type="password" name="memberPassword" class="password" placeholder="输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="password" name="confirm_password" class="confirm_password" placeholder="再次输入密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		<div>
			<input type="text" name="memberTel" class="phone_number" placeholder="输入手机号码" autocomplete="off" id="number"/>
		</div>
		<div>
			<input type="email" name="memberMail" class="email" placeholder="输入邮箱地址" oncontextmenu="return false" onpaste="return false" />
		</div>

		<button id="submit" type="submit">注 册</button>
	</form>
	<a href="${path}/login.jsp">
		<button type="button" class="register-tis">已经有账号？</button>
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
<!--
本代码由js代码收集并编辑整理;
尊重他人劳动成果;
转载请保留js代码链接 - www.jsdaima.com
-->