<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML>
<html>
<head>
<title>Products In Cart Template Flat Responsive Widget Template | Home :: w3layouts</title>
<link href="${path}/static/static-cart/css/style.css" rel="stylesheet" type="text/css" media="all"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Flash Registration Form  Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!--web-fonts-->
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
    <script type="text/javascript" src="${path}/static/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
            $(function () {
                $("input[name='count']").blur(function () {
                    var productInCartNumber = $(this).val();
                    var productId = $(this).next().val();
                    /*console.log(memberCartNumber)
                    console.log(productId)*/

                    /*formData:{
                        productId:productId;
                        memberCartNumber:memberCartNumber;
                    }*/
                    console.log(productInCartNumber)
                    console.log(productId)
                    $.ajax( {
                        url:'${path}/memberCart/updateMemberCartProductNumber',
                        method:'post',
                        data:{productId:productId,
                            productInCartNumber:productInCartNumber},
                        success:function (res) {
                            $("#tot").text(res.msg);
                        }
                    })
                })
            })
    </script>

</head>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,700,300,200' rel='stylesheet' type='text/css'>
<!-- SLIDER REVOLUTION 4.x CSS SETTINGS -->
<link rel="stylesheet" type="text/css" href="${path}/static/rs-plugin/css/settings.css" media="screen" />

<!-- StyleSheets -->
<link rel="stylesheet" href="${path}/static/css/ionicons.min.css">
<link rel="stylesheet" href="${path}/static/css/bootstrap.min.css">
<link rel="stylesheet" href="${path}/static/css/font-awesome.min.css">
<link rel="stylesheet" href="${path}/static/css/main.css">
<link rel="stylesheet" href="${path}/static/css/style.css">
<link rel="stylesheet" href="${path}/static/css/responsive.css">

<body>
<%@include file="head/top.jsp"%>
		<!---header--->
		<div class="header">
			<h1>购物车里面的商品</h1>
		</div>
		<!---header--->
		<!---main--->

			<div class="main">
				<div class="main-section">
                    <c:forEach items="${requestScope.memberCartList}" var="memberCartList">
                        <div class="product2">
                            <div class="product-top">
                                <div class="product-left">
                                    <img src="${memberCartList.productFile}">
                                </div>
                                <div class="product-right">
                                    <h2>${memberCartList.productName}</h2>
                                    <h5>${memberCartList.brandName}</h5>
                                    <ul class="size">
                                        <li>Size 9</li>
                                        <li>Qty 1</li>
                                    </ul>
                                </div>
                            </div>
                            <div class="product-middle">
                                <input class="sel" name="count" type="number" min="1" value="${memberCartList.productInCartNumber}"/>
                                <input type="hidden" name="productId" value="${memberCartList.productId}">
                            </div>
                            <div class="product-right1">
                                <p>￥${memberCartList.productPrice}<p>
                                <div class="close2"><a href="${path}/memberCart/deleteCartProduct?productId=${memberCartList.productId}"><img src="${path}/static/static-cart/images/close.png"></a> </div>
                            </div>
                            <div class="clear"></div>
                        </div>
                    </c:forEach>
					<div class="product-bottom">
                        <h3 style="color: black">总价 : ￥<span id="tot">${requestScope.memberCartPrice}</span></h3>
						<a href="${path}/orders/insertOrders">去结算</a>
						<div class="clear">
					</div>
				</div>
			</div>	
			<div class="footer">
			<p>&copy 2016 Products In Cart . All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
		</div>

		<!---main--->
            </div>
</body>
</html>