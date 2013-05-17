<%@ page import = " java.util.*,java.io.*,duke.init.*,duke.item.*,duke.util.* " %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Duke's Choice Example</TITLE>
<META http-equiv=Content-Type content="text/html">
</HEAD>
<BODY>
<P>
<%
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
%>
<table border=0 cellpadding=10>
    <tr> <th colspan=2 > <H2><%=foundItem.getDescription()%></H2> </th></tr>
    <tr>
	<td rowspan=2 >
	    <img src="images/<%=theId%>.gif"></td>
	<td>
<%

out.print(foundItem.getDisplay("<br>") );

%>
</td></tr><tr>
<td>
<form name="input" action="displayItemDetail.jsp" method="get">
    <input type="hidden" name="SKU" value="<%=theSKU%>"></>
Number of orders: <input type="text" name="orders" size=5 value="1" />
<input type="submit" value="Add to order" />
</form>
</td></tr>
<th colspan=2 > <a href="listItems.jsp">Return to main page</a></th>


</table>
<%}} // End of if statements %>
<%
// For debugging purposes
//Searchable[] items = theDB.findItems();
//for (Searchable element:items) {
 //   out.println(element.getDisplay(" | ") + "<BR>");
//}
//out.println("At bottom of page number of items in list is: " + theDB.findItems().length);
%>

</BODY></HTML>
