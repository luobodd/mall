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
<link rel="stylesheet" href ="${path}/static/css/font-awesome.min.css">
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
        <li class="active">查询商品</li>
      </ol>
    </div>
  </div>

  <!-- Content -->
  <div id="content">

    <!-- Products -->
    <section class="padding-top-40 padding-bottom-60">
      <div class="container">
        <div class="row">

          <!-- Shop Side Bar -->
          <div class="col-md-3">
            <div class="shop-side-bar">

              <!-- Categories -->
              <h6>商品类别</h6>
              <div class="checkbox checkbox-primary">
                <ul>
                    <c:forEach items="${requestScope.categoryList}" var="categoryList">
                        <li>
                            <input value="${categoryList.categoryId}" class="styled" type="checkbox" >
                            <label> ${categoryList.categoryName} </label>
                        </li>
                    </c:forEach>
                </ul>
              </div>

              <!-- Featured Brands -->
              <h6>品牌类别</h6>
              <div class="checkbox checkbox-primary">
                <ul>
                    <c:forEach items="${requestScope.brandList}" var="brandList">
                        <li>
                            <input value="${brandList.brandId}" class="styled" type="checkbox" >
                            <label> ${brandList.brandName} </label>
                        </li>
                    </c:forEach>
                </ul>
              </div>

              <!-- Rating -->
              <h6>评价</h6>
              <div class="rating">
                <ul>
                  <li><a href="#."><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star-o"></i> <span>(218)</span></a></li>
                  <li><a href="#."><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star-o"></i><i class="fa fa-star-o"></i> <span>(178)</span></a></li>
                  <li><a href="#."><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star-o"></i><i class="fa fa-star-o"></i><i class="fa fa-star-o"></i> <span>(79)</span></a></li>
                  <li><a href="#."><i class="fa fa-star"></i><i class="fa fa-star-o"></i><i class="fa fa-star-o"></i><i class="fa fa-star-o"></i><i class="fa fa-star-o"></i> <span>(188)</span></a></li>
                </ul>
              </div>
            </div>
          </div>

          <!-- Products -->
          <div class="col-md-9">

            <!-- Short List -->
            <div class="short-lst">
              <h2>商品信息</h2>
              <ul>
                <!-- Short List -->
                <li>
                  <p>Showing 1–12 of 756 results</p>
                </li>
                <!-- Short  -->
                <li >
                  <select class="selectpicker">
                    <option>Show 12 </option>
                    <option>Show 24 </option>
                    <option>Show 32 </option>
                  </select>
                </li>
                <!-- by Default -->
                <li>
                  <select class="selectpicker">
                    <option>Sort by Default </option>
                    <option>Sort by Default </option>
                    <option>Sort by Default</option>
                  </select>
                </li>

                <!-- Grid Layer -->
                <li class="grid-layer"> <a href="#."><i class="fa fa-list margin-right-10"></i></a> <a href="#."><i class="fa fa-th"></i></a> </li>
              </ul>
            </div>

            <!-- Items -->
            <div class="col-list">
              <!-- Product -->
                <c:forEach items="${requestScope.productList}" var="productList">
                    <div class="product">
                        <article>
                            <!-- Product img -->
                            <div class="media-left">
                                <div class="item-img"> <img class="img-responsive" src="${productList.productFile}" alt="" >  </div>
                            </div>
                            <!-- Content -->
                            <div class="media-body">
                                <div class="row">
                                    <!-- Content Left -->
                                    <div class="col-sm-7"> <span class="tag">${productList.brandName}</span> <a href="${path}/product/products?productId=${productList.productId}" class="tittle">${productList.productName}</a>
                                        <!-- Reviews -->
                                        <p class="rev"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i> <i class="fa fa-star"></i> <span class="margin-left-10">5 Review(s)</span></p>
                                        <ul class="bullet-round-list">
                                            <li>${productList.productDerail1}</li>
                                            <li>${productList.productDerail2}</li>
                                            <li>${productList.productDerail3}</li>
                                            <li>${productList.productDerail4}</li>
                                            <li>${productList.productDerail5}</li>
                                        </ul>
                                    </div>
                                    <!-- Content Right -->
                                    <div class="col-sm-5 text-center"> <a href="#." class="heart"><i class="fa fa-heart"></i></a> <a href="#." class="heart navi"><i class="fa fa-navicon"></i></a>
                                        <div class="position-center-center">
                                            <div class="price">￥${productList.productPrice}</div>
                                            <p>库存量: <span class="in-stock">${productList.productStock}</span></p>
                                            <a href="${path}/memberCart/addProductInCart?productId=${productList.productId}&productIncartNumber=1" class="btn-round"><i class="icon-basket-loaded"></i> 添加到购物车</a> </div>
                                    </div>
                                </div>
                            </div>
                        </article>
                    </div>
                </c:forEach>




              <!-- pagination -->
              <ul class="pagination">
                <li> <a href="#" aria-label="Previous"> <i class="fa fa-angle-left"></i> </a> </li>
                <li><a class="active" href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li> <a href="#" aria-label="Next"> <i class="fa fa-angle-right"></i> </a> </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </section>

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

  <!-- Footer -->
  <footer>
    <div class="container">

      <!-- Footer Upside Links -->
      <div class="foot-link">
        <ul>
          <li><a href="#."> About us </a></li>
          <li><a href="#."> Customer Service </a></li>
          <li><a href="#."> Privacy Policy </a></li>
          <li><a href="#."> Site Map </a></li>
          <li><a href="#."> Search Terms </a></li>
          <li><a href="#."> Advanced Search </a></li>
          <li><a href="#."> Orders and Returns </a></li>
          <li><a href="#."> Contact Us</a></li>
        </ul>
      </div>
      <div class="row">

        <!-- Contact -->
        <div class="col-md-4">
          <h4>Contact SmartTech!</h4>
          <p>Address: 45 Grand Central Terminal New York, NY 1017
            United State USA</p>
          <p>Phone: (+100) 123 456 7890</p>
          <p>Email: Support@smarttech.com</p>
          <!-- Social Links -->
          <div class="social-links"> <a href="#."><i class="fa fa-facebook"></i></a> <a href="#."><i class="fa fa-twitter"></i></a> <a href="#."><i class="fa fa-linkedin"></i></a> <a href="#."><i class="fa fa-pinterest"></i></a> <a href="#."><i class="fa fa-instagram"></i></a> <a href="#."><i class="fa fa-google"></i></a> </div>
        </div>

        <!-- Categories -->
        <div class="col-md-3">
          <h4>Categories</h4>
          <ul class="links-footer">
            <li><a href="#.">Home Audio & Theater</a></li>
            <li><a href="#."> TV & Video</a></li>
            <li><a href="#."> Camera, Photo & Video</a></li>
            <li><a href="#."> Cell Phones & Accessories</a></li>
            <li><a href="#."> Headphones</a></li>
            <li><a href="#."> Video Games</a></li>
            <li><a href="#."> Bluetooth & Wireless</a></li>
          </ul>
        </div>

        <!-- Categories -->
        <div class="col-md-3">
          <h4>Customer Services</h4>
          <ul class="links-footer">
            <li><a href="#.">Shipping & Returns</a></li>
            <li><a href="#."> Secure Shopping</a></li>
            <li><a href="#."> International Shipping</a></li>
            <li><a href="#."> Affiliates</a></li>
            <li><a href="#."> Contact </a></li>
          </ul>
        </div>

        <!-- Categories -->
        <div class="col-md-2">
          <h4>Information</h4>
          <ul class="links-footer">
            <li><a href="#.">Our Blog</a></li>
            <li><a href="#."> About Our Shop</a></li>
            <li><a href="#."> Secure Shopping</a></li>
            <li><a href="#."> Delivery infomation</a></li>
            <li><a href="#."> Store Locations</a></li>
            <li><a href="#."> FAQs</a></li>
          </ul>
        </div>
      </div>
    </div>
  </footer>

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
