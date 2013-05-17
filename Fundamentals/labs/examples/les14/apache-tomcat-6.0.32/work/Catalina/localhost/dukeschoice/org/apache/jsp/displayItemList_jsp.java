package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import dukeschoice.init.*;
import dukeschoice.item.*;
import dukeschoice.util.*;

public final class displayItemList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<HTML><HEAD><TITLE>Duke's Choice Example</TITLE>\n");
      out.write("<META http-equiv=Content-Type content=\"text/html\">\n");
      out.write("</HEAD>\n");
      out.write("<BODY>\n");
      out.write("<P>\n");
      out.write("<H3>Dress Trousers in Stock</H3>\n");
      out.write("<P></P>\n");
      out.write("\n");

DukesDB theDB = new DukesDB();
Searchable[] foundItems = theDB.findItems(120);
//out.println(DBDisplayUtil.getDisplayLines(foundItems, "<br>"));
//System.out.println("Hello");
//out.println("There");

for (Searchable element:foundItems) {

out.print("<A href=\"displayItemDetail.jsp\">");

out.print(element.getSku()+ "</A>");
out.print("&nbsp;&nbsp;&nbsp;" + element.getDescription() + "<br>");

//    String printLine = element.getDisplay(" | ");
//    int length = printLine.length();
//    separatorLine = new String(new char[length]).replace("\0", "-");
//    System.out.println(separatorLine);
//    System.out.println(element.getDisplay(" | "));

}
//System.out.println(separatorLine);






      out.write("\n");
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
