<%@page import="java.util.*"%>
<%@page import="org.apache.catalina.Session,ecommerce_products.*"%>
<!doctype html>
<html class="no-js" lang="zxx">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>E-Cart : )</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- <link rel="manifest" href="site.webmanifest"> -->
        <!-- Place favicon.ico in the root directory -->

        <!-- CSS here -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/themify-icons.css">
        <link rel="stylesheet" href="css/nice-select.css">
        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/gijgo.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/slick.css">
        <link rel="stylesheet" href="css/slicknav.css">
        <link rel="stylesheet" href="css/style.css">
        <!-- <link rel="stylesheet" href="css/responsive.css"> -->
    </head>

    <body>
        <!--[if lte IE 9]>
                <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
            <![endif]-->

        <!-- header-start -->
        <%!
            static int totalCartItems = 0; // Total items in user cart Initially  

            static HashMap<String, Product> DAO() { // This function intialize objects of Product // that means it puts product in Web app 
                Product p1 = new Product("1", "Iphone 11", 99999.0, "This is Iphone 11 by apple and many people sold thier Kidneys to buy this ", 5);
                Product p2 = new Product("2", "Gaming Controller", 999.0, "This is Gamming controller used with an old videoGames", 10);
                Product p3 = new Product("3", "MacBook Air Max", 257999.00, "This is MacBook Air max with fully high Functionalities", 5);
                HashMap<String, Product> products = new HashMap<String, Product>();
                products.put(p1.getId(), p1);
                products.put(p2.getId(), p2);
                products.put(p3.getId(), p3);
                return products;
            }
        %>
        <%
            HashMap<String, Product> products = DAO();
            application.setAttribute("products", products);
            if (session.getAttribute("totalCartItems") == null) {
                session.setAttribute("totalCartItems", 0);
            }
            totalCartItems = (Integer) session.getAttribute("totalCartItems");
        %>
        <header>
            <div class="header-area ">
                <div class="header-top_area d-none d-lg-block">
                    <div class="container">
                        <div class="row">
                            <div class="col-xl-6 col-md-6 ">
                                <div class="social_media_links">
                                    <a href="https://www.linkedin.com/in/dhairya-vyas-a4002a17b/">
                                        <i class="fa fa-linkedin"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="col-xl-6 col-md-6">
                                <div class="short_contact_list">
                                    <ul>
                                        <li><a href="#"> <i class="fa fa-envelope"></i> vyasdhairya99@gmail.com</a></li>
                                        <li><a href="#"> <i class="fa fa-phone"></i> +91 9638559070</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="sticky-header" class="main-header-area">
                    <div class="container">
                        <div class="header_bottom_border white_border">
                            <div class="row align-items-center">
                                <div class="col-xl-3 col-lg-2">
                                </div>
                                <div class="col-xl-6 col-lg-7">
                                    <div class="main-menu  d-none d-lg-block">
                                        <nav>
                                            <ul id="navigation">
                                                <b><li><a class="active" style="color: black;" href="home.html"><h3>Home</h3></a></li></b>
                                                <b><li><a class="active" style="color: black;" href="cart.jsp"><h3>Cart = <%=totalCartItems%></h3></a></li></b>
                                            </ul>
                                        </nav>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </header>
        <form action="addtocart.jsp" method="post" style="margin-top: 0px">
            <div class="bradcam_area bradcam_bg_1">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-12">
                            <div class="bradcam_text text-center">
                                <h3 style="color: darkred">PRODUCTS</h3><br/><br/>
                                <p style="color: darkred">Welcome to Ecart here are some products you can buy them, more items coming soon.</p>
                                <div class="service_area">
                                    <div class="container">
                                        <div class="row">
                                            <div class="col-xl-4 col-md-4">
                                                <form action="addtocart.jsp" method="post" style="margin-top: 0px">
                                                    <div class="single_service service_bg_1">
                                                        <div class="service_hover">
                                                            <img src="img/svg_icon/legal-paper.svg" alt="">
                                                            <h3>Iphone 11</h3>
                                                            <div class="hover_content">
                                                                <div class="hover_content_inner">
                                                                    <h4>Iphone 11</h4>
                                                                    <p>This is Iphone 11 costs 99999 INR</p>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="single-element-widget mt-30">Quantity :
                                                        <select name="quantity" style="margin-left: 8px;">
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                        </select>
                                                    </div><br/>
                                                    <button style="border-radius:40px;" type="submit" name="productid" value="1" class="boxed-btn3">Add To cart</button>
                                                </form>
                                            </div>

                                            <div class="col-xl-4 col-md-4">
                                                <form action="addtocart.jsp" method="post" style="margin-top: 0px">
                                                    <div class="single_service service_bg_2">
                                                        <div class="service_hover">
                                                            <img src="img/svg_icon/case.svg" alt="">
                                                            <h3>Gaming Controller</h3>
                                                            <div class="hover_content">
                                                                <div class="hover_content_inner">
                                                                    <h4>Gaming Controller</h4>
                                                                    <p>This is Gaming Controller to play in videogames of old time costs 999 INR</p>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="single-element-widget mt-30">Quantity :
                                                        <select name="quantity" style="margin-left: 8px;">
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                            <option value="3">3</option>
                                                            <option value="4">4</option>
                                                            <option value="5">5</option>
                                                        </select>
                                                    </div><br/>
                                                    <button  style="border-radius:40px;" type="submit" name="productid" value="2" class="boxed-btn3" >Add To cart</button>
                                                </form>
                                            </div>

                                            <div class="col-xl-4 col-md-4">
                                                <form action="addtocart.jsp" method="post" style="margin-top: 0px">
                                                    <div class="single_service service_bg_3">
                                                        <div class="service_hover">
                                                            <img src="img/svg_icon/survey.svg" alt="">
                                                            <h3>MacBook</h3>
                                                            <div class="hover_content">
                                                                <div class="hover_content_inner">
                                                                    <h4>MacBook</h4>
                                                                    <p>This is Apple MacBook costs two Kidney.</p>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="single-element-widget mt-30">Quantity :
                                                        <select name="quantity" style="margin-left: 8px;">
                                                            <option value="1">1</option>
                                                        </select>
                                                    </div><br/>
                                                    <button style="border-radius:40px;" type="submit" name="productid" value="3" class="boxed-btn3">Add To cart</button>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div></form>


        <!-- header-end -->
        <!-- bradcam_area  -->
        <!--/ bradcam_area  -->


        <!-- link that opens popup -->

        <!-- form itself end-->
        <!-- form itself end -->

        <!-- JS here -->
        <script src="js/vendor/modernizr-3.5.0.min.js"></script>
        <script src="js/vendor/jquery-1.12.4.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/isotope.pkgd.min.js"></script>
        <script src="js/ajax-form.js"></script>
        <script src="js/waypoints.min.js"></script>
        <script src="js/jquery.counterup.min.js"></script>
        <script src="js/imagesloaded.pkgd.min.js"></script>
        <script src="js/scrollIt.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/nice-select.min.js"></script>
        <script src="js/jquery.slicknav.min.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/gijgo.min.js"></script>
        <script src="js/slick.min.js"></script>
        <!--contact js-->
        <script src="js/contact.js"></script>
        <script src="js/jquery.ajaxchimp.min.js"></script>
        <script src="js/jquery.form.js"></script>
        <script src="js/jquery.validate.min.js"></script>
        <script src="js/mail-script.js"></script>

        <script src="js/main.js"></script>
    </body>

</html>