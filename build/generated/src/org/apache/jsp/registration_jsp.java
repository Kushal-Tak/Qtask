package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                background-color: #d6d3d3\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.topnav {\n");
      out.write("                text-align: center;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #666666;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            div.a{\n");
      out.write("                text-align: center;\n");
      out.write("                font:Times New Roman;\n");
      out.write("                font-size: 30px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            div.b{\n");
      out.write("                text-align: left;\n");
      out.write("                font:Times New Roman;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <h1 style=\"color:white;\"> Qtask </h1>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class = \"a\">\n");
      out.write("            <h2> Registration</h2>\n");
      out.write("        </div>   \n");
      out.write("        \n");
      out.write("        <div class =\"b\">\n");
      out.write("        <form action=\"SaveUser\" method=\"post\">\n");
      out.write("        <table align= \"center\" cellspacing=\"12\" >\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>UserID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"userid\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Username</td>\n");
      out.write("                    <td><input type=\"text\" name=\"uname\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" value=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td><input type=\"text\" name=\"addr\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Contact</td>\n");
      out.write("                    <td><input type=\"text\" name=\"contact\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("   \n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"Register\"/></td>\n");
      out.write("                    <td><input type=\"reset\"/> </td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("   \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("       \n");
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
}
