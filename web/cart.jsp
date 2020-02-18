<%@page import="ecommerce_products.Product"%>
<%@page import ="java.util.*" %>
<!doctype html>
<html class="no-js" lang="zxx">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Your Cart</title>
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
                                                <b><li><a class="active" style="color: black;" href="ecart.jsp"><h3>Home</h3></a></li></b>
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
        <div class="bradcam_area bradcam_bg_1">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="bradcam_text text-center">
                            <table border="6px" width="40%" align="center" cellpadding="20%" cellspacing="30%" style="border-radius: 1em;border-width: 6px;">
                                <%
                                    HashMap<String, Product> products = null;
                                    HashMap<String, Integer> userCart = null;
                                    if (session.getAttribute("cartItems") != null) {
                                        userCart = (HashMap<String, Integer>) session.getAttribute("cartItems");
                                        if (!userCart.isEmpty()) {
                                            // Forming Table to Display Cart 
                                            out.println("<tr align ='center'>");
                                            out.println("<td>Sr. No</td>");
                                            out.println("<td>Product</td>");
                                            out.println("<td>Price</td>");
                                            out.println("<td>Quantity</td>");
                                            out.println("<td>Total</td>");
                                            out.println("<td>Remove</td>");
                                            out.println("</tr>");

                                            products = (HashMap<String, Product>) application.getAttribute("products");
                                            Set<String> keySet = userCart.keySet();

                                            int srNo = 1;
                                            double price = 0.0;
                                            double totalAmount = 0.0;
                                            for (String id : keySet) {

                                                out.println("<tr align='center'>");
                                                out.println("<td>" + srNo++ + "</td>");
                                                out.println("<td>" + products.get(id).getName() + "</td>");

                                                price = products.get(id).getPrice();
                                                out.println("<td>" + price + "</td>");
                                                out.println("<td>" + userCart.get(id) + "</td>");
                                                price *= (userCart.get(id)); // Multiplying Quantity with Price 
                                                totalAmount += price;
                                                out.println("<td>" + price + "</td>"); // Total
                                                out.println("<td><a href='removeitem.jsp?id=" +  id+ "'><i>Remove</i></a></td>");
                                                out.println("</tr>");
                                            }                                            
                                            session.setAttribute("totalAmount", totalAmount);
                                            out.println("</table>");
                                            out.println("<div style = 'margin-top: 25px;'>");
                                            out.println("<a href = 'checkout.jsp'><button style='border-radius:40px;' class='boxed-btn3'>Check Out</button></a>");
                                            out.println("</div>");
                                        } 
                                        else {
                                            out.println("<h3 style='margin-bottom:30%;color: darkred;'>Your Cart IS Empty !</h3>");
                                        }
                                    } 
                                    else {
                                        out.println("<h3 style='margin-bottom:30%;color: darkred;'>Your Cart IS Empty !</h3>");
                                    }
                                %>
                        </div>
                    </div>
                </div>
            </div>
        </div>


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