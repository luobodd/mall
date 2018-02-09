<%--
  Created by IntelliJ IDEA.
  User: 李如利
  Date: 2018/1/19
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name="author" content="M_Adnan" />
    <!-- Document Title -->
    <title>商城订单页</title>

    <!-- SLIDER REVOLUTION 4.x CSS SETTINGS -->
    <link rel="stylesheet" type="text/css" href="${path}/static/rs-plugin/css/settings.css" media="screen" />

    <!-- StyleSheets -->
    <link rel="stylesheet" href="${path}/static/css/ionicons.min.css">
    <link rel="stylesheet" href="${path}/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/static/css/font-awesome.min.css">
    <link rel="stylesheet" href="${path}/static/css/main.css">
    <link rel="stylesheet" href="${path}/static/css/style.css">
    <link rel="stylesheet" href="${path}/static/css/responsive.css">

    <!-- Fonts Online -->
    <link href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i" rel="stylesheet">


    <!-- JavaScripts -->
    <script src="${path}/static/js/vendors/modernizr.js"></script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<div id="wrap" class="layout-1">

    <!-- Top bar -->
    <%@include file="head/top.jsp"%>
    <div style="margin-left: 20%">
        <h3>收货地址</h3>
        <c:forEach items="${addressList}" var="addressList">
            <input type="radio" name="address" value="${addressList.addressId}">${addressList.addressName}
            <%--<h5>${addressList.addressName}<em>${addressList.addressTel}</em></h5>--%>
        </c:forEach>
        <h1>-------------------------------------------------------------------</h1>
        <h3>订单商品信息</h3>
        <c:forEach items="${ordersDetailList}" var="ordersDetailList">
            <h5><span>${ordersDetailList.productName}</span>-数量-<span>${ordersDetailList.productNumber}</span>-单价-<span>${ordersDetailList.productPrice}</span></h5>
        </c:forEach>
        <h3>订单信息</h3>
        <c:forEach items="${ordersList}" var="ordersList">
            <h5>订单生成时间:${ordersList.ordersTime}</h5><br/>
            <h5>订单总价:￥${ordersList.ordersPrice}</h5>
        </c:forEach>
        <button  /><a href="${path}/orders/ordersPay">确认订单</a>
    </div>

       <%--<c:forEach items="${addressList}" var="address">
           <h3>${address.addressName}</h3>
           <h3>${address.addressId}</h3>
       </c:forEach>--%>


</div>

</body>
</html>
