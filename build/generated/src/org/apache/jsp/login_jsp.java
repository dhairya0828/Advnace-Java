package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Login</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- <link rel=\"manifest\" href=\"site.webmanifest\"> -->\n");
      out.write("    <!-- Place favicon.ico in the root directory -->\n");
      out.write("\n");
      out.write("    <!-- CSS here -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nice-select.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/gijgo.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slick.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slicknav.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"css/responsive.css\"> -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!--[if lte IE 9]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"https://browsehappy.com/\">upgrade your browser</a> to improve your experience and security.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    <!-- header-start -->\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-area \">\n");
      out.write("            <div class=\"header-top_area d-none d-lg-block\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xl-6 col-md-6 \">\n");
      out.write("                            <div class=\"social_media_links\">\n");
      out.write("                                <a href=\"https://www.linkedin.com/in/dhairya-vyas-a4002a17b/\">\n");
      out.write("                                    <i class=\"fa fa-linkedin\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-6 col-md-6\">\n");
      out.write("                            <div class=\"short_contact_list\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\"> <i class=\"fa fa-envelope\"></i> vyasdhairya99@gmail.com</a></li>\n");
      out.write("                                    <li><a href=\"#\"> <i class=\"fa fa-phone\"></i> +91 9638559070</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"sticky-header\" class=\"main-header-area\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"header_bottom_border white_border\">\n");
      out.write("                        <div class=\"row align-items-center\">\n");
      out.write("                            <div class=\"col-xl-3 col-lg-2\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-6 col-lg-7\">\n");
      out.write("                                <div class=\"main-menu  d-none d-lg-block\">\n");
      out.write("                                    <nav>\n");
      out.write("                                        <ul id=\"navigation\">\n");
      out.write("                                            <b><li><a class=\"active\" style=\"color: black;\" href=\"home.html\"><h3>Home</h3></a></li></b>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </nav>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"bradcam_area bradcam_bg_1\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xl-12\">\n");
      out.write("                    <div class=\"bradcam_text text-center\">\n");
      out.write("                            <div class=\"col-lg-8 col-md-8\" style=\"margin-left: 230px\">\n");
      out.write("                                <h3 class=\"mb-30\">Login</h3>\n");
      out.write("                                <form action=\"errorpage_for_login.jsp\" method=\"post\">\n");
      out.write("                                        <div class=\"mt-10\">\n");
      out.write("                                            <input type=\"text\" name=\"username\" placeholder=\"User Name\"\n");
      out.write("                                                onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'User Name'\" \n");
      out.write("                                                class=\"single-input\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("                                        <div class=\"mt-10\">\n");
      out.write("                                            <input type=\"password\" name=\"pwd\" placeholder=\"Password\"\n");
      out.write("                                                    onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Password'\"\n");
      out.write("                                                    class=\"single-input\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("                                        <br/>\n");
      out.write("                                        <div class=\"col-xl-11\" style=\"margin-left: 125px;\">\n");
      out.write("                                            <button type=\"submit\" name=\"submitted\" value=\"1\" class=\"boxed-btn3\">Submit</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                String msg = request.getParameter("msg");
                                if(msg != null)
                                    out.println(msg);
                            
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("    <!-- header-end -->\n");
      out.write("    <!-- bradcam_area  -->\n");
      out.write("    <!--/ bradcam_area  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- link that opens popup -->\n");
      out.write("\n");
      out.write("    <!-- form itself end-->\n");
      out.write("    <!-- form itself end -->\n");
      out.write("\n");
      out.write("    <!-- JS here -->\n");
      out.write("    <script src=\"js/vendor/modernizr-3.5.0.min.js\"></script>\n");
      out.write("    <script src=\"js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/isotope.pkgd.min.js\"></script>\n");
      out.write("    <script src=\"js/ajax-form.js\"></script>\n");
      out.write("    <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("    <script src=\"js/imagesloaded.pkgd.min.js\"></script>\n");
      out.write("    <script src=\"js/scrollIt.js\"></script>\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <script src=\"js/wow.min.js\"></script>\n");
      out.write("    <script src=\"js/nice-select.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.slicknav.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("    <script src=\"js/plugins.js\"></script>\n");
      out.write("    <script src=\"js/gijgo.min.js\"></script>\n");
      out.write("    <script src=\"js/slick.min.js\"></script>\n");
      out.write("    <!--contact js-->\n");
      out.write("    <script src=\"js/contact.js\"></script>\n");
      out.write("    <script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.form.js\"></script>\n");
      out.write("    <script src=\"js/jquery.validate.min.js\"></script>\n");
      out.write("    <script src=\"js/mail-script.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
