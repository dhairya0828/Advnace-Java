<!doctype html>
<html class="no-js" lang="zxx">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Calculator</title>
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
                                                <b><li><a class="active" style="color: black;" href="home.html"><h3>Home</h3></a></li></b>
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
                            <div class="col-lg-8 col-md-8" style="margin-left: 230px">
                                <h3 class="mb-30">Feild Generator</h3>
                                <form action="feildgenerator.jsp" method="post">
                                    <div class="mt-10">
                                        <input type="number" name="totalfeilds" placeholder="Enter total number of Feilds"
                                               onfocus="this.placeholder = ''" onblur="this.placeholder = 'Number 1'" required
                                               class="single-input">
                                    </div>
                                    <br/>
                                    <div>
                                        <button type="submit" name="generate" class="boxed-btn3">Generate</button>
                                    </div>
                                </form>
                            </div>
                            <form>
                                <br/><br/>
                                <%
                                    if (request.getParameter("generate") != null) {
                                        int totalfeilds = Integer.parseInt(request.getParameter("totalfeilds"));
                                        while (totalfeilds != 0) {
                                            out.println("<input type='text' name='totalfeilds' class='single-input'><br/>");
                                            totalfeilds--;
                                        }
                                    }
                                %>
                            </form>
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