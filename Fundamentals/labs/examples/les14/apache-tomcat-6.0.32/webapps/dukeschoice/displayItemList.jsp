<%@ page import = " java.util.*,java.io.*,dukeschoice.init.*,dukeschoice.item.*,dukeschoice.util.* " %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Duke's Choice Example</TITLE>
<META http-equiv=Content-Type content="text/html">
</HEAD>
<BODY>
<P>
<H3>Dress Trousers in Stock</H3>
<P></P>

<%
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





%>


</BODY></HTML>
