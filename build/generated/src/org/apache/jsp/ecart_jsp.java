package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.apache.catalina.Session;
import ecommerce_products.*;

public final class ecart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>E-Cart : )</title>\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <!-- <link rel=\"manifest\" href=\"site.webmanifest\"> -->\r\n");
      out.write("        <!-- Place favicon.ico in the root directory -->\r\n");
      out.write("\r\n");
      out.write("        <!-- CSS here -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flaticon.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/gijgo.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slick.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <!-- <link rel=\"stylesheet\" href=\"css/responsive.css\"> -->\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--[if lte IE 9]>\r\n");
      out.write("                <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"https://browsehappy.com/\">upgrade your browser</a> to improve your experience and security.</p>\r\n");
      out.write("            <![endif]-->\r\n");
      out.write("\r\n");
      out.write("        <!-- header-start -->\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");

            HashMap<String, Product> products = DAO();
            application.setAttribute("products", products);
            if (session.getAttribute("totalCartItems") == null) {
                session.setAttribute("totalCartItems", 0);
            }
            totalCartItems = (Integer) session.getAttribute("totalCartItems");
        
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"header-area \">\r\n");
      out.write("                <div class=\"header-top_area d-none d-lg-block\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-xl-6 col-md-6 \">\r\n");
      out.write("                                <div class=\"social_media_links\">\r\n");
      out.write("                                    <a href=\"https://www.linkedin.com/in/dhairya-vyas-a4002a17b/\">\r\n");
      out.write("                                        <i class=\"fa fa-linkedin\"></i>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xl-6 col-md-6\">\r\n");
      out.write("                                <div class=\"short_contact_list\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"#\"> <i class=\"fa fa-envelope\"></i> vyasdhairya99@gmail.com</a></li>\r\n");
      out.write("                                        <li><a href=\"#\"> <i class=\"fa fa-phone\"></i> +91 9638559070</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"sticky-header\" class=\"main-header-area\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"header_bottom_border white_border\">\r\n");
      out.write("                            <div class=\"row align-items-center\">\r\n");
      out.write("                                <div class=\"col-xl-3 col-lg-2\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-xl-6 col-lg-7\">\r\n");
      out.write("                                    <div class=\"main-menu  d-none d-lg-block\">\r\n");
      out.write("                                        <nav>\r\n");
      out.write("                                            <ul id=\"navigation\">\r\n");
      out.write("                                                <b><li><a class=\"active\" style=\"color: black;\" href=\"home.html\"><h3>Home</h3></a></li></b>\r\n");
      out.write("                                                <b><li><a class=\"active\" style=\"color: black;\" href=\"cart.jsp\"><h3>Cart = ");
      out.print(totalCartItems);
      out.write("</h3></a></li></b>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </nav>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <form action=\"addtocart.jsp\" method=\"post\" style=\"margin-top: 0px\">\r\n");
      out.write("            <div class=\"bradcam_area bradcam_bg_1\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xl-12\">\r\n");
      out.write("                            <div class=\"bradcam_text text-center\">\r\n");
      out.write("                                <h3 style=\"color: darkred\">PRODUCTS</h3><br/><br/>\r\n");
      out.write("                                <p style=\"color: darkred\">Welcome to Ecart here are some products you can buy them, more items coming soon.</p>\r\n");
      out.write("                                <div class=\"service_area\">\r\n");
      out.write("                                    <div class=\"container\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-xl-4 col-md-4\">\r\n");
      out.write("                                                <form action=\"addtocart.jsp\" method=\"post\" style=\"margin-top: 0px\">\r\n");
      out.write("                                                    <div class=\"single_service service_bg_1\">\r\n");
      out.write("                                                        <div class=\"service_hover\">\r\n");
      out.write("                                                            <img src=\"img/svg_icon/legal-paper.svg\" alt=\"\">\r\n");
      out.write("                                                            <h3>Iphone 11</h3>\r\n");
      out.write("                                                            <div class=\"hover_content\">\r\n");
      out.write("                                                                <div class=\"hover_content_inner\">\r\n");
      out.write("                                                                    <h4>Iphone 11</h4>\r\n");
      out.write("                                                                    <p>This is Iphone 11 costs 99999 INR</p>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"single-element-widget mt-30\">Quantity :\r\n");
      out.write("                                                        <select name=\"quantity\" style=\"margin-left: 8px;\">\r\n");
      out.write("                                                            <option value=\"1\">1</option>\r\n");
      out.write("                                                            <option value=\"2\">2</option>\r\n");
      out.write("                                                        </select>\r\n");
      out.write("                                                    </div><br/>\r\n");
      out.write("                                                    <button style=\"border-radius:40px;\" type=\"submit\" name=\"productid\" value=\"1\" class=\"boxed-btn3\">Add To cart</button>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-xl-4 col-md-4\">\r\n");
      out.write("                                                <form action=\"addtocart.jsp\" method=\"post\" style=\"margin-top: 0px\">\r\n");
      out.write("                                                    <div class=\"single_service service_bg_2\">\r\n");
      out.write("                                                        <div class=\"service_hover\">\r\n");
      out.write("                                                            <img src=\"img/svg_icon/case.svg\" alt=\"\">\r\n");
      out.write("                                                            <h3>Gaming Controller</h3>\r\n");
      out.write("                                                            <div class=\"hover_content\">\r\n");
      out.write("                                                                <div class=\"hover_content_inner\">\r\n");
      out.write("                                                                    <h4>Gaming Controller</h4>\r\n");
      out.write("                                                                    <p>This is Gaming Controller to play in videogames of old time costs 999 INR</p>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                    <div class=\"single-element-widget mt-30\">Quantity :\r\n");
      out.write("                                                        <select name=\"quantity\" style=\"margin-left: 8px;\">\r\n");
      out.write("                                                            <option value=\"1\">1</option>\r\n");
      out.write("                                                            <option value=\"2\">2</option>\r\n");
      out.write("                                                            <option value=\"3\">3</option>\r\n");
      out.write("                                                            <option value=\"4\">4</option>\r\n");
      out.write("                                                            <option value=\"5\">5</option>\r\n");
      out.write("                                                        </select>\r\n");
      out.write("                                                    </div><br/>\r\n");
      out.write("                                                    <button  style=\"border-radius:40px;\" type=\"submit\" name=\"productid\" value=\"2\" class=\"boxed-btn3\" >Add To cart</button>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"col-xl-4 col-md-4\">\r\n");
      out.write("                                                <form action=\"addtocart.jsp\" method=\"post\" style=\"margin-top: 0px\">\r\n");
      out.write("                                                    <div class=\"single_service service_bg_3\">\r\n");
      out.write("                                                        <div class=\"service_hover\">\r\n");
      out.write("                                                            <img src=\"img/svg_icon/survey.svg\" alt=\"\">\r\n");
      out.write("                                                            <h3>MacBook</h3>\r\n");
      out.write("                                                            <div class=\"hover_content\">\r\n");
      out.write("                                                                <div class=\"hover_content_inner\">\r\n");
      out.write("                                                                    <h4>MacBook</h4>\r\n");
      out.write("                                                                    <p>This is Apple MacBook costs two Kidney.</p>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"single-element-widget mt-30\">Quantity :\r\n");
      out.write("                                                        <select name=\"quantity\" style=\"margin-left: 8px;\">\r\n");
      out.write("                                                            <option value=\"1\">1</option>\r\n");
      out.write("                                                        </select>\r\n");
      out.write("                                                    </div><br/>\r\n");
      out.write("                                                    <button style=\"border-radius:40px;\" type=\"submit\" name=\"productid\" value=\"3\" class=\"boxed-btn3\">Add To cart</button>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div></form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- header-end -->\r\n");
      out.write("        <!-- bradcam_area  -->\r\n");
      out.write("        <!--/ bradcam_area  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- link that opens popup -->\r\n");
      out.write("\r\n");
      out.write("        <!-- form itself end-->\r\n");
      out.write("        <!-- form itself end -->\r\n");
      out.write("\r\n");
      out.write("        <!-- JS here -->\r\n");
      out.write("        <script src=\"js/vendor/modernizr-3.5.0.min.js\"></script>\r\n");
      out.write("        <script src=\"js/vendor/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <script src=\"js/isotope.pkgd.min.js\"></script>\r\n");
      out.write("        <script src=\"js/ajax-form.js\"></script>\r\n");
      out.write("        <script src=\"js/waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.counterup.min.js\"></script>\r\n");
      out.write("        <script src=\"js/imagesloaded.pkgd.min.js\"></script>\r\n");
      out.write("        <script src=\"js/scrollIt.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("        <script src=\"js/wow.min.js\"></script>\r\n");
      out.write("        <script src=\"js/nice-select.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.slicknav.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("        <script src=\"js/plugins.js\"></script>\r\n");
      out.write("        <script src=\"js/gijgo.min.js\"></script>\r\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\r\n");
      out.write("        <!--contact js-->\r\n");
      out.write("        <script src=\"js/contact.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.ajaxchimp.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.form.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("        <script src=\"js/mail-script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
