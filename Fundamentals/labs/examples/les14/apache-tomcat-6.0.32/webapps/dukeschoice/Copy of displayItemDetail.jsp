<%@ page import = " java.util.*,java.io.*,duke.init.*,duke.item.*,duke.util.* " %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Duke's Choice Example</TITLE>
<META http-equiv=Content-Type content="text/html">
</HEAD>
<BODY>
<P>

<%
String theSKU = request.getParameter("SKU");
//DukesDB theDB = new DukesDB();
DukesDB theDB = (DukesDB)session.getAttribute("dataSource");
Searchable foundItem = theDB.findItem(theSKU);
int theId = foundItem.getItemID();
%>
<H2><%=foundItem.getDescription()%></H2>
<table border=0 cellpadding=40><tr>
	<td rowspan=2 >
	    <img src="images/<%=theId%>.gif"></td>
	<td>
<%
out.print(foundItem.getDisplay("<br>") );

String order = request.getParameter("orders");
if (order!=null) {
    theDB.removeItem(theSKU, Integer.parseInt(order));
    out.println("***********");
    theDB.removeItem("120GR",4);
}

%>
</td></tr><tr>
<td>
<form name="input" action="displayItemDetail.jsp" method="get">
    <input type="text" name="SKU">120GR</>
Number of orders: <input type="text" name="orders" />
<input type="submit" value="Submit" />
</form>
</td></tr>


</table>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="index.jsp">Return to main page</a>


</BODY></HTML>
