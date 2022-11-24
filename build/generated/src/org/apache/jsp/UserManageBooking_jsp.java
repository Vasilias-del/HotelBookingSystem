package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.UserBooking;

public final class UserManageBooking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hotel Hilton</title>\n");
      out.write("        <!-- Google font -->\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700%7CVarela+Round\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("\n");
      out.write("\t<!-- Owl Carousel -->\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/owl.carousel.css\" />\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/owl.theme.default.css\" />\n");
      out.write("\n");
      out.write("\t<!-- Magnific Popup -->\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/magnific-popup.css\" />\n");
      out.write("\n");
      out.write("\t<!-- Font Awesome Icon -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\t<!-- Custom stlylesheet -->\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("        <script>\n");
      out.write("\t\t$( function() {\n");
      out.write("\t\t$( \"#datepicker\" ).datepicker();\n");
      out.write("\t\t} );\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userprofile == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("             ");
 response.sendRedirect(request.getContextPath() + "/sessionterminate.jsp"); 
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\n");
      out.write("        \n");
      out.write("        <header id=\"home\">\n");
      out.write("\t\t<!-- Background Image -->\n");
      out.write("\t\t<div class=\"bg-img\" style=\"background-image: url('./img/back6.jpg');\">\n");
      out.write("\t\t\t<div class=\"overlay\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /Background Image -->\n");
      out.write("\n");
      out.write("\t\t<!-- Nav -->\n");
      out.write("\t\t<nav id=\"nav\" class=\"navbar nav-transparent\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t<div class=\"navbar-brand\">\n");
      out.write("                                            <h2 class=\"white-text\"><a href=\"#home\">Hotel Hilton</a></h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /Logo -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Collapse nav button -->\n");
      out.write("\t\t\t\t\t<div class=\"nav-collapse\">\n");
      out.write("\t\t\t\t\t\t<span></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /Collapse nav button -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!--  Main navigation  -->\n");
      out.write("\t\t\t\t<ul class=\"main-nav nav navbar-nav navbar-right\">\n");
      out.write("                                        <li><a>Welcome Again, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userprofile.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#home\">Home</a></li>\n");
      out.write("                                        <li><a href=\"#about\">Our Room</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"has-dropdown\"><a href=\"home\">Manage Booking</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"home\">View Booking</a></li>\n");
      out.write("                                                        <li><a href=\"home\">Edit Booking</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"logout.jsp\">Log Out</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- /Main navigation -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t\t<!-- /Nav -->\n");
      out.write("\n");
      out.write("\t\t<!-- home wrapper -->\n");
      out.write("\t\t<div class=\"home-wrapper\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<!-- home content -->\n");
      out.write("\t\t\t\t\t<!--<div class=\"col-md-7 col-md-push-5\">\n");
      out.write("\t\t\t\t\t\t<div class=\"home-content\">\n");
      out.write("\t\t\t\t\t\t\t<section id=\"banner\">\n");
      out.write("                                                                <div style=\" background:#ffffff; background-color: rgba(255,255,255,0.5); width:650px; height: 500px; margin:0 auto;\">\n");
      out.write("                                                                    <h2 style=\"padding-top:10px; text-align: center;font-size: 1em;margin-bottom: 10px;text-transform: uppercase;font-weight: bold; color: #333;\">HELLO ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userprofile.getFullName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                                                                    <hr>\n");
      out.write("                                                                    <br>\n");
      out.write("                                                                        <img src =\"./img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userprofile.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" width =\"250\" height =\"230\" style=\"border:1px solid black\">\n");
      out.write("                                                                        <br><br>\n");
      out.write("                                                                        <h3> Name : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userprofile.getFullName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h3>\n");
      out.write("                                                                        <h3><font color=\"black\">You are looking fine today !</font></h3>\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                        </section>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>-->\n");
      out.write("\t\t\t\t\t<!-- /home content -->\n");
      out.write("                                    <div class=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"booking-form\">\n");
      out.write("                                                     <table>\n");
      out.write("                                                         <tr>\n");
      out.write("                                                             <th>Booking ID</th>\n");
      out.write("                                                             <th>Name</th>\n");
      out.write("                                                             <th>Roomtype</th>\n");
      out.write("                                                             <th>Check-in Date</th>\n");
      out.write("                                                             <th>Check-out Date</th>\n");
      out.write("                                                         </tr>\n");
      out.write("                                                          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                     </table>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /home wrapper -->\n");
      out.write("\t</header>\n");
      out.write("\t<!-- /Header -->\n");
      out.write("        \n");
      out.write("        <div id=\"about\" class=\"section md-padding\">\n");
      out.write("\n");
      out.write("\t\t<!-- Container -->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Row -->\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Section header -->\n");
      out.write("\t\t\t\t<div class=\"section-header text-center\">\n");
      out.write("\t\t\t\t\t<h2 class=\"title\">Welcome to Our Hotel</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /Section header -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- about -->\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"about\" style=\"background-image: url('./img/room1.jpg'); background-size: cover; opacity: .7;\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-cogs\"></i>\n");
      out.write("\t\t\t\t\t\t<h3>Room1</h3>\n");
      out.write("\t\t\t\t\t\t<p>Queen Bed, With the breathtaking view outside the windows and luxury night with your love</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /about -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- about -->\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"about\" style=\"background-image: url('./img/room2.jpg'); background-size: cover; opacity: .7;\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-magic\"></i>\n");
      out.write("\t\t\t\t\t\t<h3>Room2</h3>\n");
      out.write("\t\t\t\t\t\t<p>Maecenas tempus tellus eget condimentum rhoncus sem quam semper libero sit amet.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /about -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- about -->\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"about\" style=\"background-image: url('./img/room3.jpg'); background-size: cover; opacity: .7;\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-mobile\"></i>\n");
      out.write("\t\t\t\t\t\t<h3>Room3</h3>\n");
      out.write("\t\t\t\t\t\t<p>Maecenas tempus tellus eget condimentum rhoncus sem quam semper libero sit amet.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /about -->\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /Row -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /Container -->\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /About -->\n");
      out.write("\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\t<footer id=\"footer\" class=\"sm-padding bg-dark\">\n");
      out.write("\n");
      out.write("\t\t<!-- Container -->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Row -->\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- footer logo -->\n");
      out.write("\t\t\t\t\t<div class=\"footer-logo\">\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\"><img src=\"img/logo-alt.png\" alt=\"logo\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /footer logo -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- footer follow -->\n");
      out.write("\t\t\t\t\t<ul class=\"footer-follow\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<!-- /footer follow -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- footer copyright -->\n");
      out.write("\t\t\t\t\t<div class=\"footer-copyright\">\n");
      out.write("\t\t\t\t\t\t<p>Copyright © 2018. All Rights Reserved. Designed by <a href=\"#home\"> Half Blood Prince</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /footer copyright -->\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /Row -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /Container -->\n");
      out.write("\n");
      out.write("\t</footer>\n");
      out.write("\t<!-- /Footer -->\n");
      out.write("\n");
      out.write("\t<!-- Back to top -->\n");
      out.write("\t<div id=\"back-to-top\"></div>\n");
      out.write("\t<!-- /Back to top -->\n");
      out.write("\n");
      out.write("\t<!-- Preloader -->\n");
      out.write("\t<div id=\"preloader\">\n");
      out.write("\t\t<div class=\"preloader\">\n");
      out.write("\t\t\t<span></span>\n");
      out.write("\t\t\t<span></span>\n");
      out.write("\t\t\t<span></span>\n");
      out.write("\t\t\t<span></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /Preloader -->\n");
      out.write("\n");
      out.write("\t<!-- jQuery Plugins -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.magnific-popup.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userbook}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("book");
    _jspx_th_c_forEach_0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                                                         <tr>\n");
          out.write("                                                            <td style=\"color:black\">");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                                            <td style=\"color:black\">");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>        \n");
          out.write("                                                            <td style=\"color:black\">");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                                            <td style=\"color:black\">");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                                            <td style=\"color:black\">");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                                        </tr>\n");
          out.write("\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookingID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.roomtype}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.checkin}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.checkout}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }
}
