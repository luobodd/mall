<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="top-bar">
    <div class="container">
        <p>欢迎来到SmartTech商城!</p>
        <div class="right-sec">
            <ul>
                <li><a href="<%=session.getAttribute("memberName") == null ? request.getContextPath()+"/login.jsp" : request.getContextPath()+"/address/queryMemberAddress"%>"><%=session.getAttribute("memberName") == null ? "登录/注册" : session.getAttribute("memberName") %> </a></li>
                <%--<li><a href="${path}/login.jsp">登录/注册 </a></li>--%>
                <li><a href="${path}/orders/queryHistoryOrders">历史订单 </a></li>
                <li><a href="#.">常见问题 </a></li>
                <li><a href="#.">通讯 </a></li>
                <li>
                    <select class="selectpicker">
                        <option>法国</option>
                        <option>德国</option>
                        <option>意大利</option>
                        <option>日本</option>
                    </select>
                </li>
                <li>
                    <select class="selectpicker">
                        <option>(USD)元</option>
                        <option>英镑</option>
                        <option>欧元</option>
                        <option>日元</option>
                    </select>
                </li>
            </ul>
            <div class="social-top"> <a href="#."><i class="fa fa-facebook"></i></a> <a href="#."><i class="fa fa-twitter"></i></a> <a href="#."><i class="fa fa-linkedin"></i></a> <a href="#."><i class="fa fa-dribbble"></i></a> <a href="#."><i class="fa fa-pinterest"></i></a> </div>
        </div>
    </div>
</div>

<!-- Header -->
<header>
    <div class="container">
        <div class="logo"> <a href="../index.jsp"><img src="${path}/static/images/logo.png" alt="" ></a> </div>
        <div class="search-cate">
            <%--<select class="selectpicker">
                <option> 所有类别</option>
                <option> 家庭 & 影院</option>
                <option> 电视 & 视频</option>
                <option> 相机, 照片 & 录像机</option>
                <option> 手机 & 配件</option>
                <option> 头戴耳机</option>
                <option> 视频 游戏</option>
                <option> 蓝牙 & 无线 </option>
                <option> 游戏 控制台</option>
                <option> 电脑 & 平板电脑</option>
                <option> 显示器 </option>
            </select>--%>
            <form method="post" action="${path}/product/selectProduct">

            <input type="search" name="productName" placeholder="Search entire store here...">
            <button class="submit" type="submit"><i class="icon-magnifier"></i></button>
            </form>
        </div>

        <!-- Cart Part -->
        <ul class="nav navbar-right cart-pop">
            <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><i class="flaticon-shopping-bag"></i> <strong><a href="${path}/memberCart/memberCartList">我的购物车</a></strong> <br>
            </a>
            </li>
        </ul>
    </div>

    <!-- Nav -->
    <nav class="navbar ownmenu">
        <div class="container">

            <!-- Categories -->
            <div class="cate-lst"> <a  data-toggle="collapse" class="cate-style" href="#cater"><i class="fa fa-list-ul"></i> 商品分类 </a>
                <div class="cate-bar-in">
                    <div id="cater" class="collapse">
                        <ul>
                            <c:forEach items="${applicationScope.categoryList}" var="categoryList">
                                <li><a href="${path}/product/productCategoryList?categoryId=${categoryList.categoryId}">${categoryList.categoryName}</a></li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>

            <!-- Navbar Header -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#nav-open-btn" aria-expanded="false"> <span><i class="fa fa-navicon"></i></span> </button>
            </div>
            <!-- NAV -->
            <div class="collapse navbar-collapse" id="nav-open-btn">
                <ul class="nav">
                    <li><a href="${path}/index">主页 </a></li>
                    <li><a href="#."> 关于 </a></li>
                    <li><a href="#."> 联系客服 </a></li>
                </ul>
            </div>

            <!-- NAV RIGHT -->
            <div class="nav-right"> <span class="call-mun"><i class="fa fa-phone"></i> <strong>Hotline:</strong> (+100) 123 456 7890</span> </div>
        </div>
    </nav>
</header>