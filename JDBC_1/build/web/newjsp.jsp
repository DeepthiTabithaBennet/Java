<%-- 
    Document   : newjsp
    Created on : 3 Nov, 2022, 12:46:16 PM
    Author     : admin


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
--%>


<%@ page import="java.sql.*" %>
<% Class.forName("oracle.jdbc.driver.OracleDriver"); %>
<HTML>
       <HEAD>
       <TITLE>The View Of Database Table </TITLE>
       </HEAD>
       <BODY BGCOLOR="cyan">
       <H1>The View Of Database Table </H1>
       <%=
          
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
           Statement st = con.createStatement();
           ResultSet resu1tset = st.executeQuery("select * from employee");
           ResultSet resultset = statement.executeQuery("select * from table1") ;
        
       %>
      <TABLE BORDER="1">
      <TR>
      <TH>ID</TH>
      <TH>Name</TH>
      <TH>City</TH>
      <TH>State</TH>
      <TH>Country</TH>
      <TH>Email</TH>
      <TH>Interest in Game</TH>
      </TR>
      <% while(resultset.next()){ %>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>

      </TR>
      <% } %>
     </TABLE>
     </BODY>
</HTML>