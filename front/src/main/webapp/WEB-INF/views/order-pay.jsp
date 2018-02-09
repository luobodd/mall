<%--
  Created by IntelliJ IDEA.
  User: 李如利
  Date: 2018/1/19
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <!-- Viewport metatags -->
    <meta name="HandheldFriendly" content="true" />
    <meta name="MobileOptimized" content="320" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

    <link rel="stylesheet" type="text/css" href="${path}/static/prompt/css/dandelion.css" media="screen" />

    <title>支付</title>

</head>

<body>

<!-- Main Wrapper. Set this to 'fixed' for fixed layout and 'fluid' for fluid layout' -->
<div id="da-wrapper" class="fluid">

    <!-- Content -->
    <div id="da-content">

        <!-- Container -->
        <div class="da-container clearfix">

            <div id="da-error-wrapper">

                <div id="da-error-pin"></div>
                <div id="da-error-code">
                    使用支付宝支付 <br/><br/>
                    ￥${requestScope.price}                    </div>

                <h1 class="da-error-heading">请扫码</h1>
                <img src="${path}/static/images/aliPayEWM.jpg" alt=""/>
                <p><a href="${path}/orders/submitOrders">我已完成支付</a><p></p> <a href="${path}/index">继续购物</a></p>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <div id="da-footer">
        <div class="da-container clearfix">
            <p> 2018 17sucai . All Rights Reserved. <a href="${path}/" target="_blank">SmartTech</a></div>
    </div>
</div>

</body>
</html>
