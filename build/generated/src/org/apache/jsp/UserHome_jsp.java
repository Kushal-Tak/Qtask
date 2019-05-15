package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    String nm = (String) session.getAttribute("username");
    if (nm == null) {
        response.sendRedirect("index.html");
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                background-color: #ffffff\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div.topnav {\n");
      out.write("                text-align: center;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #666666;\n");
      out.write("            }\n");
      out.write("            div.topnav.one{\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button.Logout{\n");
      out.write("                background-color:green;\n");
      out.write("                color:white;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            button.Logout:active{\n");
      out.write("                border:none;\n");
      out.write("            }\n");
      out.write("            button.Add:hover{\n");
      out.write("                box-shadow: 5px 18px 15px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("            button.Add:active\n");
      out.write("            {\n");
      out.write("                outline: none;\n");
      out.write("                border:none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            button.Add{\n");
      out.write("                background-color: green;\n");
      out.write("                color: white; \n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 10px 20px; \n");
      out.write("                font: Arial;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                margin:40px 0px 0px 70px\n");
      out.write("            }\n");
      out.write("            button.Logout{\n");
      out.write("                float: right;\n");
      out.write("                border-radius: 5px\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ul li {\n");
      out.write("                cursor: pointer;\n");
      out.write("                position: relative;\n");
      out.write("                padding: 12px 8px 12px 40px;\n");
      out.write("                background: #eee;\n");
      out.write("                font-size: 18px;\n");
      out.write("                transition: 0.2s;\n");
      out.write("\n");
      out.write("                /* make the list items unselectable */\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("                -moz-user-select: none;\n");
      out.write("                -ms-user-select: none;\n");
      out.write("                user-select: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set all odd list items to a different color (zebra-stripes) */\n");
      out.write("            ul li:nth-child(odd) {\n");
      out.write("                background: #f9f9f9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Darker background-color on hover */\n");
      out.write("            ul li:hover {\n");
      out.write("                background: #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* When clicked on, add a background color and strike out text */\n");
      out.write("            ul li.checked {\n");
      out.write("                background: #888;\n");
      out.write("                color: #fff;\n");
      out.write("                text-decoration: line-through;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <h1 style=\"color:white;\"> Qtask \n");
      out.write("            </h1>\n");
      out.write("        </div>\n");
      out.write("        <p style=\"font-size: 15; color: green;margin: 10px 15px; text-align: left \" > Welcome ");
      out.print(nm);
      out.write(" \n");
      out.write("\n");
      out.write("            <button class = \"Logout\">Logout</button>\n");
      out.write("        </p> \n");
      out.write("        <button class=\"Add\" onclick=\"displayBox()\" id = \"addbtn\">Add+</button>\n");
      out.write("        <input id= \"input\" type=\"text\"style=\"visibility: hidden; padding: 20px; margin: 0px 0px 0px 20px \" placeholder=\"What needs to be done..\">\n");
      out.write("        <table border=\"0\" align=\"center\" cellpadding=\"40\" >\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"font-size: 20;color:white; background-color: green;padding: 20px 200px ; text-align: center; \">Task to do</td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <ul id=\"list\" style=\"text-align: left ;margin: 0px 444px 0px 444px\" ></ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function displayBox()\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"input\").style.visibility = \"visible\";\n");
      out.write("        }\n");
      out.write("        function newItem() {\n");
      out.write("            var item = document.getElementById(\"input\").value;\n");
      out.write("            var ul = document.getElementById(\"list\");\n");
      out.write("            var li = document.createElement(\"li\");\n");
      out.write("            li.appendChild(document.createTextNode(\"- \" + item));\n");
      out.write("            ul.appendChild(li);\n");
      out.write("            document.getElementById(\"input\").value = \"\";\n");
      out.write("            li.onclick = removeItem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("        // Create a \"close\" button and append it to each list item\n");
      out.write("                var myNodelist = document.getElementsByTagName(\"LI\");\n");
      out.write("        var i;\n");
      out.write("        for (i = 0; i < myNodelist.length; i++) {\n");
      out.write("            var span = document.createElement(\"SPAN\");\n");
      out.write("            var txt = document.createTextNode(\"\\u00D7\");\n");
      out.write("            span.className = \"close\";\n");
      out.write("            span.appendChild(txt);\n");
      out.write("            myNodelist[i].appendChild(span);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("// Click on a close button to hide the current list item\n");
      out.write("        var close = document.getElementsByClassName(\"close\");\n");
      out.write("        var i;\n");
      out.write("        for (i = 0; i < close.length; i++) {\n");
      out.write("            close[i].onclick = function () {\n");
      out.write("                var div = this.parentElement;\n");
      out.write("                div.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        // Add a \"checked\" symbol when clicking on a list item\n");
      out.write("        var list = document.querySelector('ul');\n");
      out.write("        list.addEventListener('click', function (ev) {\n");
      out.write("            if (ev.target.tagName === 'LI') {\n");
      out.write("                ev.target.classList.toggle('checked');\n");
      out.write("            }\n");
      out.write("        }, false);\n");
      out.write("\n");
      out.write("        function newItems() {\n");
      out.write("            var li = document.createElement(\"li\");\n");
      out.write("            var inputValue = document.getElementById(\"myInput\").value;\n");
      out.write("            var t = document.createTextNode(inputValue);\n");
      out.write("            li.appendChild(t);\n");
      out.write("            if (inputValue === '') {\n");
      out.write("                alert(\"You must write something!\");\n");
      out.write("            } else {\n");
      out.write("                document.getElementById(\"myUL\").appendChild(li);\n");
      out.write("            }\n");
      out.write("            document.getElementById(\"myInput\").value = \"\";\n");
      out.write("\n");
      out.write("            var span = document.createElement(\"SPAN\");\n");
      out.write("            var txt = document.createTextNode(\"\\u00D7\");\n");
      out.write("            span.className = \"close\";\n");
      out.write("            span.appendChild(txt);\n");
      out.write("            li.appendChild(span);\n");
      out.write("\n");
      out.write("            for (i = 0; i < close.length; i++) {\n");
      out.write("                close[i].onclick = function () {\n");
      out.write("                    var div = this.parentElement;\n");
      out.write("                    div.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        document.body.onkeyup = function (e) {\n");
      out.write("            if (e.keyCode == 13) {\n");
      out.write("                newItem();\n");
      out.write("            }\n");
      out.write("        };\n");
      out.write("    </script>\n");
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
