package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import duke.init.*;
import duke.item.*;
import duke.util.*;

public final class displayItemDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String theSKU = request.getParameter("SKU");
DukesDB theDB = (DukesDB)session.getAttribute("dataSource");


if (theDB == null || theSKU==null){ 
out.println("<table><tr><th><h2>You cannot navigate directly to this page - please click the link below" + 
    "</h2></th></tr><tr><th colspan=2 > <a href=\"listItems.jsp\">Return to main page</a></th></tr>");
} else {
// first check if there's a remove request
String order = request.getParameter("orders");
//out.println(order);
int removed=0;
if (order!=null) {
    removed = theDB.removeItem(theSKU, Integer.parseInt(order));
    //out.println(removed);
//    if (removed == foundItem.getQuantityInStock()) {
	// all gone could just not show anything
//	out.println("LAST ONE GONE");
 //   }
}
Searchable foundItem = theDB.findItem(theSKU);
if (foundItem==null) { 
//out.println("<table><tr><th><h2>You bought " + removed + 
		//" items - that's the lot! Please click the link below</h2>" + 
out.println("<table><tr><th><h2>You bought all the items! Please click the link below</h2>" + 
    "</th></tr><tr><th colspan=2 > <a href=\"listItems.jsp\">Return to main page</a></th></tr>");
} else {
//out.println("foundItem is " + foundItem);
//out.println("At top of page number of items in list is: " + theDB.findItems().length);

int theId = foundItem.getItemID();

      out.write("\n");
      out.write("<table border=0 cellpadding=10>\n");
      out.write("    <tr> <th colspan=2 > <H2>");
      out.print(foundItem.getDescription());
      out.write("</H2> </th></tr>\n");
      out.write("    <tr>\n");
      out.write("\t<td rowspan=2 >\n");
      out.write("\t    <img src=\"images/");
      out.print(theId);
      out.write(".gif\"></td>\n");
      out.write("\t<td>\n");


out.print(foundItem.getDisplay("<br>") );


      out.write("\n");
      out.write("</td></tr><tr>\n");
      out.write("<td>\n");
      out.write("<form name=\"input\" action=\"displayItemDetail.jsp\" method=\"get\">\n");
      out.write("    <input type=\"hidden\" name=\"SKU\" value=\"");
      out.print(theSKU);
      out.write("\"></>\n");
      out.write("Number of orders: <input type=\"text\" name=\"orders\" size=5 value=\"1\" />\n");
      out.write("<input type=\"submit\" value=\"Add to order\" />\n");
      out.write("</form>\n");
      out.write("</td></tr>\n");
      out.write("<th colspan=2 > <a href=\"listItems.jsp\">Return to main page</a></th>\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
}} // End of if statements 
      out.write('\n');

// For debugging purposes
//Searchable[] items = theDB.findItems();
//for (Searchable element:items) {
 //   out.println(element.getDisplay(" | ") + "<BR>");
//}
//out.println("At bottom of page number of items in list is: " + theDB.findItems().length);

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
