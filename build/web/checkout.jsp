<!doctype html>
<html class="no-js" lang="zxx">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Check Out</title>
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
        <%
            // IF USER IS NOT LOGGED IN THEN WE CAN REDIRECT USER TO LOGIN.JSP
            // IF USER IS NOT REGISTERED THEN WE CAN REDIRECT USER TO SIGNUP.JSP
        %>
        <div class="bradcam_area bradcam_bg_1">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="bradcam_text text-center">
                            <div class="col-lg-8 col-md-8" style="margin-left: 230px">
                                <h3 class="mb-30" style="color: darkred;">Fill Details</h3>
                                <form action="orderplaced.jsp" method="post">
                                    <!--div class="mt-10" >
                                        <input type="text" name="fullName" placeholder="Full Name"
                                               onfocus="this.placeholder = ''" onblur="this.placeholder = 'Full Name'" required
                                               class="single-input">
                                    </div-->
                                    <div class="mt-10">
                                        <input style="border-radius:10px;background-color: activeborder;" type="text" name="userName" placeholder="Name"
                                               onfocus="this.placeholder = ''" onblur="this.placeholder = 'Name'" required
                                               class="single-input">
                                    </div>
                                    <div class="mt-10">
                                        <input style="border-radius:10px;background-color: activeborder;" type="text" name="phNum" placeholder="Phone Number"
                                               onfocus="this.placeholder = ''" onblur="this.placeholder = 'Phone Number'" required
                                               class="single-input">
                                    </div>
                                    <div class="mt-10">
                                        <textarea style="border-radius:10px;background-color: activeborder;" class="single-textarea" name="address" placeholder="Address" onfocus="this.placeholder = ''"
                                                  onblur="this.placeholder = 'Address'" required rows="3"></textarea>
                                    </div>
                                    <div class="mt-10">
                                        <input style="border-radius:10px;background-color: activeborder;" type="text" name="phNum" value="Total Payable Amount <%=session.getAttribute("totalAmount")%> INR only"                                                
                                               class="single-input">
                                    </div>
                                    <div class="input-group-icon mt-10">
                                        <div class="form-select" id="default-select">
                                            <select  name="paymentMethod">
                                                <option readonly = "readonly" >PAYMENT</option>
                                                <option value="1" selected="selected" >COD</option>
                                                <option value="2" disabled="disabled" >Paytm</option>
                                                <option value="3" disabled="disabled" >Credit Card</option>
                                                <option value="4" disabled="disabled" >UPI</option>
                                            </select>
                                        </div>            
                                    </div>
                                    <div class="col-xl-11" style="margin-left: 125px;">
                                        <button style="border-radius:40px;" type="submit" class="boxed-btn3">Place Order</button>
                                    </div>
                                </form>
                            </div>     
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