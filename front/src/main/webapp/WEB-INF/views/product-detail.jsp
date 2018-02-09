<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html class="no-js" lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="author" content="M_Adnan" />
<!-- Document Title -->
<title></title>

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
<link href="https://fonts.googleapis.com/css?family=Lato:100i,300,400,700,900" rel="stylesheet">

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

<!-- Page Wrapper -->
<div id="wrap"> 
  
  <!-- Top bar -->
    <%@include file="head/top.jsp"%>
  
  <!-- Linking -->
  <div class="linking">
    <div class="container">
      <ol class="breadcrumb">
        <li><a href="#">主页</a></li>
        <li><a href="#">查询商品</a></li>
        <li class="active">商品详情</li>
      </ol>
    </div>
  </div>
  
  <!-- Content -->
  <div id="content"> 
    
    <!-- Products -->
      <c:forEach items="${requestScope.products}" var="products">
          <section class="padding-top-40 padding-bottom-60">
              <div class="container">
                  <div class="row">
                      <!-- Products -->
                      <div class="col-md-9">
                          <div class="product-detail">
                              <div class="product">
                                  <div class="row">
                                      <!-- Slider Thumb -->
                                      <div class="col-xs-5">
                                          <article class="slider-item on-nav">
                                              <div class="thumb-slider">
                                                  <ul class="slides">
                                                      <li data-thumb="${path}/static/images/item-img-1-1.jpg"> <img src="${products.productFile}" alt="" > </li>
                                                      <li data-thumb="${path}/static/images/item-img-1-2.jpg"> <img src="${path}/static/images/item-img-1-2.jpg" alt="" > </li>
                                                      <li data-thumb="${path}/static/images/item-img-1-3.jpg"> <img src="${path}/static/images/item-img-1-3.jpg" alt="" > </li>
                                                  </ul>
                                              </div>
                                          </article>
                                      </div>
                                      <!-- Item Content -->
                                      <div class="col-xs-7"> <span class="tags">${products.brandName}</span>
                                          <h5>${products.productName}</h5>
                                          <p class="rev"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i> <i class="fa fa-star-o"></i> <span class="margin-left-10">5 Review(s)</span></p>
                                          <div class="row">
                                              <div class="col-sm-6"><span class="price">￥${products.productPrice}</span></div>
                                              <div class="col-sm-6">
                                                  <p>库存量: <span class="in-stock">￥${products.productStock}</span></p>
                                              </div>
                                          </div>
                                          <!-- List Details -->
                                          <ul class="bullet-round-list">
                                              <li>${products.productDerail1}</li>
                                              <li>${products.productDerail2}</li>
                                              <li>${products.productDerail3}</li>
                                              <li>${products.productDerail4}</li>
                                              <li>${products.productDerail5}</li>
                                          </ul>
                                          <!-- Colors -->
                                          <div class="row">
                                              <div class="col-xs-5">
                                                  <div class="clr"> <span style="background:#068bcd"></span> <span style="background:#d4b174"></span> <span style="background:#333333"></span> </div>
                                              </div>
                                              <!-- Sizes -->
                                              <div class="col-xs-7">
                                                  <div class="sizes"> <a href="#.">S</a> <a class="active" href="#.">M</a> <a href="#.">L</a> <a href="#.">XL</a> </div>
                                              </div>
                                          </div>
                                          <!-- Compare Wishlist -->
                                          <ul class="cmp-list">
                                              <li><a href="#."><i class="fa fa-heart"></i> Add to Wishlist</a></li>
                                              <li><a href="#."><i class="fa fa-navicon"></i> Add to Compare</a></li>
                                              <li><a href="#."><i class="fa fa-envelope"></i> Email to a friend</a></li>
                                          </ul>
                                          <!-- Quinty -->

                                          <div class="quinty">
                                              <input name="productIncartNumber" type="number" min="1" value="1">
                                          </div>
                                          <a href="" id="add_to_cart" class="btn-round"><i class="icon-basket-loaded margin-right-5"></i> 添加到购物车</a> </div>
                                      <script type="text/javascript">
                                      </script>
                                  </div>
                              </div>

                              <!-- Details Tab Section-->
                              <div class="item-tabs-sec">

                                  <!-- Nav tabs -->
                                  <ul class="nav" role="tablist">
                                      <li role="presentation" class="active"><a href="#pro-detil"  role="tab" data-toggle="tab">商品详细信息</a></li>
                                      <li role="presentation"><a href="#cus-rev"  role="tab" data-toggle="tab">Customer Reviews</a></li>
                                      <li role="presentation"><a href="#ship" role="tab" data-toggle="tab">Shipping & Payment</a></li>
                                  </ul>

                                  <!-- Tab panes -->
                                  <div class="tab-content">
                                      <div role="tabpanel" class="tab-pane fade in active" id="pro-detil">
                                          <!-- List Details -->
                                          <ul class="bullet-round-list">
                                              <li>${products.productDerail1}</li>
                                              <li>${products.productDerail2}</li>
                                              <li>${products.productDerail3}</li>
                                              <li>${products.productDerail4}</li>
                                              <li>${products.productDerail5}</li>
                                          </ul>
                                          <div class="table-responsive">
                                              <table class="table">
                                                  <thead>
                                                  <tr>
                                                      <th>Carrier</th>
                                                      <th>Compatibility Rating </th>
                                                      <th>Voice / Text </th>
                                                      <th>Voice / Text </th>
                                                      <th>2G Data </th>
                                                      <th>3G Data </th>
                                                      <th>4G LTE Data </th>
                                                  </tr>
                                                  </thead>
                                                  <tbody>
                                                  <tr>
                                                      <td>AT&T </td>
                                                      <td>Fully Compatible</td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"></td>
                                                  </tr>
                                                  <tr>
                                                      <td>Sprint </td>
                                                      <td>No Voice/Text and Partial Data Connection</td>
                                                      <td class="text-center"></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                  </tr>
                                                  <tr>
                                                      <td>Q-Mobile </td>
                                                      <td>Partial Data Connection</td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                  </tr>
                                                  <tr>
                                                      <td>Verizon Wireless </td>
                                                      <td>No Votice/Text and Partial Data Connection</td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                      <td class="text-center"><i class="fa fa-check"></i></td>
                                                  </tr>
                                                  </tbody>
                                              </table>
                                          </div>
                                      </div>
                                      <div role="tabpanel" class="tab-pane fade" id="cus-rev"></div>
                                      <div role="tabpanel" class="tab-pane fade" id="ship"></div>
                                  </div>
                              </div>
                          </div>

                          <!-- Related Products -->
                      </div>
                  </div>
              </div>
          </section>
      </c:forEach>

    
    <!-- Your Recently Viewed Items -->
    <section class="padding-bottom-60">
      <div class="container"> 
        
        <!-- heading -->
        <div class="heading">
          <h2>Your Recently Viewed Items</h2>
          <hr>
        </div>
        <!-- Items Slider -->
        <div class="item-slide-5 with-nav"> 
          <!-- Product -->
          <div class="product">
            <article> <img class="img-responsive" src="${path}/static/images/item-img-1-1.jpg" alt="" > 
              <!-- Content --> 
              <span class="tag">Latop</span> <a href="#." class="tittle">Laptop Alienware 15 i7 Perfect For Playing Game</a> 
              <!-- Reviews -->
              <p class="rev"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i> <i class="fa fa-star-o"></i> <span class="margin-left-10">5 Review(s)</span></p>
              <div class="price">$350.00 </div>
              <a href="#." class="cart-btn"><i class="icon-basket-loaded"></i></a> </article>
          </div>
          <!-- Product -->
          <div class="product">
            <article> <img class="img-responsive" src="${path}/static/images/item-img-1-2.jpg" alt="" > <span class="sale-tag">-25%</span> 
              
              <!-- Content --> 
              <span class="tag">Tablets</span> <a href="#." class="tittle">Mp3 Sumergible Deportivo Slim Con 8GB</a> 
              <!-- Reviews -->
              <p class="rev"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i> <i class="fa fa-star-o"></i> <span class="margin-left-10">5 Review(s)</span></p>
              <div class="price">$350.00 <span>$200.00</span></div>
              <a href="#." class="cart-btn"><i class="icon-basket-loaded"></i></a> </article>
          </div>
          
          <!-- Product -->
          <div class="product">
            <article> <img class="img-responsive" src="${path}/static/images/item-img-1-3.jpg" alt="" > 
              <!-- Content --> 
              <span class="tag">Appliances</span> <a href="#." class="tittle">Reloj Inteligente Smart Watch M26 Touch Bluetooh </a> 
              <!-- Reviews -->
              <p class="rev"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i> <i class="fa fa-star-o"></i> <span class="margin-left-10">5 Review(s)</span></p>
              <div class="price">$350.00</div>
              <a href="#." class="cart-btn"><i class="icon-basket-loaded"></i></a> </article>
          </div>
          
          <!-- Product -->
          <div class="product">
            <article> <img class="img-responsive" src="${path}/static/images/item-img-1-4.jpg" alt="" > <span class="new-tag">New</span> 
              
              <!-- Content --> 
              <span class="tag">Accessories</span> <a href="#." class="tittle">Teclado Inalambrico Bluetooth Con Air Mouse</a> 
              <!-- Reviews -->
              <p class="rev"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i> <i class="fa fa-star-o"></i> <span class="margin-left-10">5 Review(s)</span></p>
              <div class="price">$350.00</div>
              <a href="#." class="cart-btn"><i class="icon-basket-loaded"></i></a> </article>
          </div>
          
          <!-- Product -->
          <div class="product">
            <article> <img class="img-responsive" src="${path}/static/images/item-img-1-5.jpg" alt="" > 
              <!-- Content --> 
              <span class="tag">Appliances</span> <a href="#." class="tittle">Funda Para Ebook 7" 128GB full HD</a> 
              <!-- Reviews -->
              <p class="rev"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i> <i class="fa fa-star-o"></i> <span class="margin-left-10">5 Review(s)</span></p>
              <div class="price">$350.00</div>
              <a href="#." class="cart-btn"><i class="icon-basket-loaded"></i></a> </article>
          </div>
          
          <!-- Product -->
          <div class="product">
            <article> <img class="img-responsive" src="${path}/static/images/item-img-1-6.jpg" alt="" > <span class="sale-tag">-25%</span> 
              
              <!-- Content --> 
              <span class="tag">Tablets</span> <a href="#." class="tittle">Mp3 Sumergible Deportivo Slim Con 8GB</a> 
              <!-- Reviews -->
              <p class="rev"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i> <i class="fa fa-star-o"></i> <span class="margin-left-10">5 Review(s)</span></p>
              <div class="price">$350.00 <span>$200.00</span></div>
              <a href="#." class="cart-btn"><i class="icon-basket-loaded"></i></a> </article>
          </div>
          
          <!-- Product -->
          <div class="product">
            <article> <img class="img-responsive" src="${path}/static/images/item-img-1-7.jpg" alt="" > 
              <!-- Content --> 
              <span class="tag">Appliances</span> <a href="#." class="tittle">Reloj Inteligente Smart Watch M26 Touch Bluetooh </a> 
              <!-- Reviews -->
              <p class="rev"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i> <i class="fa fa-star-o"></i> <span class="margin-left-10">5 Review(s)</span></p>
              <div class="price">$350.00</div>
              <a href="#." class="cart-btn"><i class="icon-basket-loaded"></i></a> </article>
          </div>
          
          <!-- Product -->
          <div class="product">
            <article> <img class="img-responsive" src="${path}/static/images/item-img-1-8.jpg" alt="" > <span class="new-tag">New</span> 
              
              <!-- Content --> 
              <span class="tag">Accessories</span> <a href="#." class="tittle">Teclado Inalambrico Bluetooth Con Air Mouse</a> 
              <!-- Reviews -->
              <p class="rev"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i> <i class="fa fa-star-o"></i> <span class="margin-left-10">5 Review(s)</span></p>
              <div class="price">$350.00</div>
              <a href="#." class="cart-btn"><i class="icon-basket-loaded"></i></a> </article>
          </div>
        </div>
      </div>
    </section>
    
    <!-- Clients img -->
    <section class="light-gry-bg clients-img">
      <div class="container">
        <ul>
          <li><img src="${path}/static/images/c-img-1.png" alt="" ></li>
          <li><img src="${path}/static/images/c-img-2.png" alt="" ></li>
          <li><img src="${path}/static/images/c-img-3.png" alt="" ></li>
          <li><img src="${path}/static/images/c-img-4.png" alt="" ></li>
          <li><img src="${path}/static/images/c-img-5.png" alt="" ></li>
        </ul>
      </div>
    </section>
    
    <!-- Newslatter -->
    <section class="newslatter">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <h3>Subscribe our Newsletter <span>Get <strong>25% Off</strong> first purchase!</span></h3>
          </div>
          <div class="col-md-6">
            <form>
              <input type="email" placeholder="Your email address here...">
              <button type="submit">Subscribe!</button>
            </form>
          </div>
        </div>
      </div>
    </section>
  </div>
  <!-- End Content -->
  
  <!-- Rights -->
  <div class="rights">
    <div class="container">
      <div class="row">
        <div class="col-sm-6">
          <p>Copyright &copy; 2017.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
        </div>
        <div class="col-sm-6 text-right"> <img src="${path}/static/images/card-icon.png" alt=""> </div>
      </div>
    </div>
  </div>
  
  <!-- End Footer --> 
  
  <!-- GO TO TOP  --> 
  <a href="#" class="cd-top"><i class="fa fa-angle-up"></i></a> 
  <!-- GO TO TOP End --> 
</div>
<!-- End Page Wrapper --> 

<!-- JavaScripts --> 
<script src="${path}/static/js/vendors/jquery/jquery.min.js"></script> 
<script src="${path}/static/js/vendors/wow.min.js"></script> 
<script src="${path}/static/js/vendors/bootstrap.min.js"></script> 
<script src="${path}/static/js/vendors/own-menu.js"></script> 
<script src="${path}/static/js/vendors/jquery.sticky.js"></script> 
<script src="${path}/static/js/vendors/owl.carousel.min.js"></script> 

<!-- SLIDER REVOLUTION 4.x SCRIPTS  --> 
<script type="text/javascript" src="${path}/static/rs-plugin/js/jquery.tp.t.min.js"></script>
<script type="text/javascript" src="${path}/static/rs-plugin/js/jquery.tp.min.js"></script>
<script src="${path}/static/js/main.js"></script> 
<script src="${path}/static/js/vendors/jquery.nouislider.min.js"></script> 
<script>
jQuery(document).ready(function($) {
//    alert("haha");
    $("#add_to_cart").click(function () {
        var value = $("input[name='productIncartNumber']").val();
        var url = "${path}/memberCart/addProductInCart?productId=${param.productId}&productIncartNumber="+value;
//        alert(url);
        window.location.href=url;
        return false;
    })
 
    $("#price-range").noUiSlider({
    range: {
      'min': [ 0 ],
      'max': [ 1000 ]
    },
    start: [40, 940],
        connect:true,
        serialization:{
            lower: [
        $.Link({
          target: $("#price-min")
        })
      ],
      upper: [
        $.Link({
          target: $("#price-max")
        })
      ],
      format: {
      
        decimals: 2,
        prefix: '$'
      }
        }
  })
})

</script>
</body>
</html>
