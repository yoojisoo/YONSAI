/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-08-26 03:11:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDate;

public final class joinForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1629768322691L));
    _jspx_dependants.put("jar:file:/D:/RJS/jsworkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/schemasJMS/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.time.LocalDate");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>회원가입</h1>\r\n");
      out.write("	<br>\r\n");
      out.write("	");

	LocalDate now = LocalDate.now();
	int year = now.getYear();
	int month = now.getMonthValue();
	int day = now.getDayOfMonth();
	int i =0;
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		<form action=\"joinOK.jsp\" method=\"post\">\r\n");
      out.write("			<p>아이디 <input type=\"text\" name=\"id\" \" required></p>\r\n");
      out.write("			<p>비밀번호 <input type=\"password\" name=\"pw1\" required></p>\r\n");
      out.write("			<p>비밀번호 확인 <input type=\"password\" name=\"pw2\" placeholder=\"똑같이 써요~~\" autofocus required></p>\r\n");
      out.write("			<p>이름 <input type=\"text\" name=\"name\"></p>\r\n");
      out.write("			<p>핸드폰번호 <input type=\"text\" name=\"phon\" required></p>\r\n");
      out.write("			<p>메일주소 <input type=\"email\" name=\"email\"></p>\r\n");
      out.write("			\r\n");
      out.write("			<select name = \"year\">\r\n");
      out.write("			");
for(i=1910; i<=year; i++){ 
      out.write("\r\n");
      out.write("				<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(i );
      out.write(" </option>		\r\n");
      out.write("			");
}
      out.write("\r\n");
      out.write("			</select>년\r\n");
      out.write("				\r\n");
      out.write("			<select name = \"month\">\r\n");
      out.write("			");
for(i=1; i<=12; i++){ 
      out.write("\r\n");
      out.write("				<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(i );
      out.write(" </option>		\r\n");
      out.write("			");
}
      out.write("\r\n");
      out.write("			</select>월\r\n");
      out.write("				\r\n");
      out.write("			<select name = \"day\">\r\n");
      out.write("			");
for(i=1; i<=31; i++){ 
      out.write("\r\n");
      out.write("				<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(i );
      out.write(" </option>		\r\n");
      out.write("			");
}
      out.write("\r\n");
      out.write("			</select>일\r\n");
      out.write("			\r\n");
      out.write("			<P><input type=\"submit\" value=\"완료\"></P>\r\n");
      out.write("		</form>	\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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