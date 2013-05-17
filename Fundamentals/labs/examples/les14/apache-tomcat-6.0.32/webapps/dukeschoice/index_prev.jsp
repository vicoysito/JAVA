<%@ page import = " java.util.*,dukeschoice.init.*,dukeschoice.item.* " %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Duke's Choice Example</TITLE>
<META http-equiv=Content-Type content="text/html">
</HEAD>
<BODY>
<P>
<H3>Duke's Choice</H3>
<P></P>

<table border="0">
<tr>
<td>
<img src="images/tomcat.gif">
</td>
<td>
<h1>Sample "Dukes Choice" Application</h1>
<p>This is the home page for a sample application used to illustrate how adding or modifying
a class will affect the output of the application irrespective of the client.
</td>
</tr>
</table>
<p><p>
<%
DukesDB theDB = new DukesDB();
Searchable[] foundItems = theDB.findUniqueItems();
%>
<form action="display.jsp">
<select>
<% for(Object element:foundItems) { %>
<option value="<%=((Searchable)element).getItemID()%>"><%=((Searchable)element).getDescription()%></option>
<%} %>
</select>
</form>


</BODY></HTML>
