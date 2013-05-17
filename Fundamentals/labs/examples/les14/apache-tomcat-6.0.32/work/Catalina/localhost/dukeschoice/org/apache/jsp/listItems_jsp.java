package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import duke.init.*;
import duke.item.*;
import duke.util.*;

public final class listItems_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <P>\n");
      out.write("<!--\n");
      out.write("<table border=\"0\" >\n");
      out.write("</tr>\n");
      out.write("<td>\n");
      out.write("<img src=\"images/Duke_small.png\">\n");
      out.write("</td>\n");
      out.write("<tr>\n");
      out.write("</table>\n");
      out.write("</p>\n");
      out.write("<br>\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<SCRIPT>\n");
      out.write("function getItem(theSelect)\n");
      out.write("{\n");
      out.write("    window.location='listItems.jsp?selection=' + theSelect[theSelect.selectedIndex].value;\n");
      out.write("}\n");
      out.write("</SCRIPT>\n");
 
// Initialize the DukesDB object
DukesDB theDB = (DukesDB)session.getAttribute("dataSource");
if (theDB==null) {
    theDB = new DukesDB();
    theDB.setupDb();
    session.setAttribute("dataSource", theDB);
}
// Find the unique items for the dropdown list
Searchable[] foundItemTypes = theDB.findUniqueItems();

      out.write("\n");
      out.write("<!-- Start the table -->\n");
      out.write("<table border=0 cellpadding=4 >\n");
      out.write("<tr>\n");
      out.write("<th colspan=5>\n");
      out.write("<H2>Duke's Choice Search</H2>\n");
      out.write("</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th colspan=5>\n");
      out.write("<img src=\"images/Duke_small.png\">\n");
      out.write("</th>\n");
      out.write("</tr>\n");

// Find the items based on the selection
String selection = (request.getParameter("selection"));
if (selection == null || selection.equals("")) selection = "-1"; // no items have negative id's so foundItems will be empty
// Check to make sure selection is not equal to null (first time on the page)
Searchable[] foundItems = theDB.findItems(Integer.parseInt(selection));

      out.write("\n");
      out.write("<!--<tr><td rowspan=");
      out.print(foundItems.length + 1);
      out.write(" valign=\"top\">-->\n");
      out.write("<tr><td valign=\"top\" colspan=5>\n");
      out.write("<form action=\"display.jsp\">\n");
      out.write("<select id=\"itemTypes\" onChange=\"getItem(this);\">\n");
      out.write("<option value=\"\">Select an Item</option>\n");
 for(Object element:foundItemTypes) { 
      out.write("\n");
      out.write("<option ");
if (((Searchable)element).getItemID()==Integer.parseInt(selection)) out.println(" selected=\"selected\"");
      out.write("\n");
      out.write("value=\"");
      out.print(((Searchable)element).getItemID());
      out.write('"');
      out.write('>');
      out.print(((Searchable)element).getDescription());
      out.write("</option>\n");
} 
      out.write("\n");
      out.write("</select>\n");
      out.write("</form></td></tr>\n");

if (foundItems.length > 0) out.println(" <tr></td><td>SKU</td><td>Description</td><td>Price</td><td>Available</td></tr>");

      out.write('\n');

for (Searchable element: foundItems) {
   //out.println(element.getSku() + " | " + element.getDescription() + "<br>");
   out.println("<tr> </td><td><a href=\"displayItemDetail.jsp?SKU=" + element.getSku() + "\">" + element.getSku() + "</a></td>" +
               "<td>" + element.getDescription() + "</td>" +
               "<td>" + element.getPrice() + "</td>" +
               "<td>" + element.getQuantityInStock() + "</td>" +
               "</tr>" );
}


      out.write("\n");
      out.write("</table>\n");
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
