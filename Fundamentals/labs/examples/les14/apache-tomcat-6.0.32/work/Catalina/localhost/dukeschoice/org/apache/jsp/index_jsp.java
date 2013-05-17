package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import duke.init.*;
import duke.item.*;
import duke.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n");
      out.write("<HTML><HEAD><TITLE>Apache Tomcat Examples</TITLE>\n");
      out.write("<META http-equiv=Content-Type content=\"text/html\">\n");
      out.write("</HEAD>\n");
      out.write("<BODY>\n");
      out.write("<P>\n");
      out.write("<P>\n");
      out.write("<!--<table border=\"0\" style=\"margin: auto;\"> -->\n");
      out.write("<table border=\"0\" cellpadding=20> \n");
      out.write("    <tr><th><H2>Welcome to Duke's Choice</th></tr></H2>\n");
      out.write("    <tr><td> <a href=\"listItems.jsp\"> <img src=\"images/Duke.png\"></a></td>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th>\n");
      out.write("    <a href=\"listItems.jsp\">Go to search page</a>\n");
      out.write("</th>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</p>\n");
      out.write("<br>\n");
      out.write("\n");
 
// Initialize the DukesDB object
DukesDB theDB = new DukesDB();
theDB.setupDb();
session.setAttribute("dataSource", theDB);

      out.write("\n");
      out.write("\n");
      out.write("</BODY></HTML>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
