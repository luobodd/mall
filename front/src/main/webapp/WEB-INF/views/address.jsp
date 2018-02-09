<%--
  Created by IntelliJ IDEA.
  User: 李如利
  Date: 2018/1/19
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>管理收货地址</title>

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

<h3>确认收货地址
    <span class="manage-address">
 <a href="http://member1.taobao.com/member/fresh/deliver_address.htm" target="_blank" title="管理我的收货地址"
    class="J_MakePoint" data-point-url="http://log.mmstat.com/buy.1.7"></a>
 </span>
</h3>
<ul id="address-list" class="address-list">

    <c:forEach items="${requestScope.memberAddressList}" var="memberAddressList">
        <li class="J_Addr J_MakePoint clearfix">

            <s class="J_Marker marker"></s>
            <span class="marker-tip">寄送至</span>
            <div class="address-info">
                <a href="#" class="J_Modify modify J_MakePoint" data-point-url="#"></a>
                <label class="user-address">
                    ${memberAddressList.addressName}<em>${memberAddressList.addressTel}</em></label><em class="tip" style="display: none">默认地址</em>
                <a class="J_DefaultHandle set-default J_MakePoint" style="display: none" data-point-url="#" href="#">设置为默认收货地址</a>
            </div>
        </li>
    </c:forEach>
</ul>
<ul id="J_MoreAddress" class="address-list hidden">

</ul>

<div class="address-bar">
    <a href="${path}/address/addAddressPage" class="new J_MakePoint" id="J_NewAddressBtn">添加新地址</a>
</div><br/><br/><br/>
    <h1><a href="${path}/member/logOff">退出用户</a></h1>
</div>
</body>
</html>
