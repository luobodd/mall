<%--
  Created by IntelliJ IDEA.
  User: 李如利
  Date: 2018/1/22
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>历史订单</title>
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
  </head>
  <body>
  <div id="wrap" class="layout-1">

      <!-- Top bar -->
      <%@include file="head/top.jsp"%>
      <div style="margin-left: 20%">

          <c:forEach items="${historyOrders}" var="historyOrders">
              <c:forEach items="${historyOrders.ordersDetails}" var="ordersDetails">
              <h5><span>${ordersDetails.productName}</span>--数量:<span>${ordersDetails.productNumber}</span>--单价:￥<span>${ordersDetails.productPrice}</span>--发货状态:<span>${ordersDetails.express}</span></h5>
              </c:forEach>
              <h5>订单生成时间:${historyOrders.ordersTime}</h5><br/>
              <h5>订单总价:￥${historyOrders.ordersPrice}</h5>
              <h6>-----------------------------------------------</h6>
          </c:forEach>
      </div>

      <%--<c:forEach items="${addressList}" var="address">
          <h3>${address.addressName}</h3>
          <h3>${address.addressId}</h3>
      </c:forEach>--%>


  </div>
  </body>
  </html>
