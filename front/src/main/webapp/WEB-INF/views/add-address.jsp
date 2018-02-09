<%--
  Created by IntelliJ IDEA.
  User: 李如利
  Date: 2018/1/19
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>添加新的收货地址</title>

    <!-- StyleSheets -->
    <link rel="stylesheet" href="${path}/static/css/ionicons.min.css">
    <link rel="stylesheet" href="${path}/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/static/css/font-awesome.min.css">
    <link rel="stylesheet" href="${path}/static/css/main.css">
    <link rel="stylesheet" href="${path}/static/css/style.css">
    <link rel="stylesheet" href="${path}/static/css/responsive.css">

    <!-- Fonts Online -->
    <link href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i" rel="stylesheet">
    <link rel="stylesheet" href="${path}/static/css/tasp.css" />
    <link href="${path}/static/css/orderconfirm.css" rel="stylesheet" />


</head>
<body>
<%@include file="head/top.jsp"%>
<div style="margin-left: 200px">
<form action="${path}/address/insertMemberAddress" method="post">
    <span>输入新的地址:</span><input name="addressName" type="text"><br/><br/>
    <span>输入联系电话:</span><input name="addressTel" type="text"><br/><br/>
    <input type="submit" value="提交">
</form>

</div>

</body>
</html>
