/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-08-24 06:17:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("			<nav class=\"sb-sidenav accordion sb-sidenav-dark\" id=\"sidenavAccordion\">\r\n");
      out.write("                    <div class=\"sb-sidenav-menu\">\r\n");
      out.write("                        <div class=\"nav\">\r\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Core</div>\r\n");
      out.write("                            <a class=\"nav-link\" href=\"index.html\">\r\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\r\n");
      out.write("                                ?????????\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Interface</div>\r\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseLayouts\" aria-expanded=\"false\" aria-controls=\"collapseLayouts\">\r\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-columns\"></i></div>\r\n");
      out.write("                                Layouts\r\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"collapse\" id=\"collapseLayouts\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("                                	");

                                	 String userid = (String)session.getAttribute("sid");
                                	 String sname = (String)session.getAttribute("sname");
                                	 if(userid==null){
                                	
      out.write("\r\n");
      out.write("                                	\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"loginForm.jsp\">?????????</a>\r\n");
      out.write("                                    \r\n");
      out.write("                                    ");

                                	 }else{
                                	
      out.write("\r\n");
      out.write("                                	\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"loginForm.jsp\"> ");
      out.print(sname+"??? " );
      out.write("????????????</a>                                		 \r\n");
      out.write("\r\n");
      out.write("									");
 
                                	 }
                                	 
      out.write("             \r\n");
      out.write("                                    \r\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\">????????????</a>\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"dbConn.jsp\">JSBC Test</a>\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"layout-sidenav-light.html\">32Light Sidenav</a>\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"layout-sidenav-light.html\">4Light Sidenav</a>\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"layout-sidenav-light.html\">5Light Sidenav</a>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsePages\" aria-expanded=\"false\" aria-controls=\"collapsePages\">\r\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-book-open\"></i></div>\r\n");
      out.write("                                Pages\r\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"collapse\" id=\"collapsePages\" aria-labelledby=\"headingTwo\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav accordion\" id=\"sidenavAccordionPages\">\r\n");
      out.write("                                    <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#pagesCollapseAuth\" aria-expanded=\"false\" aria-controls=\"pagesCollapseAuth\">\r\n");
      out.write("                                        Authentication\r\n");
      out.write("                                        <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"collapse\" id=\"pagesCollapseAuth\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordionPages\">\r\n");
      out.write("                                        <nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"login.html\">Login</a>\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"register.html\">Register</a>\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"password.html\">Forgot Password</a>\r\n");
      out.write("                                        </nav>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#pagesCollapseError\" aria-expanded=\"false\" aria-controls=\"pagesCollapseError\">\r\n");
      out.write("                                        Error\r\n");
      out.write("                                        <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <div class=\"collapse\" id=\"pagesCollapseError\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordionPages\">\r\n");
      out.write("                                        <nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"401.html\">401 Page</a>\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"404.html\">404 Page</a>\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"500.html\">500 Page</a>\r\n");
      out.write("                                        </nav>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Addons</div>\r\n");
      out.write("                            <a class=\"nav-link\" href=\"charts.html\">\r\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-chart-area\"></i></div>\r\n");
      out.write("                                Charts\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a class=\"nav-link\" href=\"tables.html\">\r\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-table\"></i></div>\r\n");
      out.write("                                Tables\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"sb-sidenav-footer\">\r\n");
      out.write("                        <div class=\"small\">Logged in as:</div>\r\n");
      out.write("                        Start Bootstrap\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
