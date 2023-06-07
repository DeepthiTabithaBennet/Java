<%-- INDEX.JSP --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<%
 
    if(request.getParameter("submit")!=null)
    {
        String name = request.getParameter("s_name");
        String course = request.getParameter("courses");
        String fee = request.getParameter("fees");
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
        pst = con.prepareStatement("insert into records(s_name,courses,fees)values(?,?,?)");
        pst.setString(1, name);
        pst.setString(2, course);
        pst.setString(3, fee);
        pst.executeQuery();            
    }
   %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="Bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1 style="margin-left:25rem;">Student Management System</h1>
        </br>
        <div class="row">
            <div class="col-sm-4">
                <form method="POST" action="#" >
                    
                    <div>
                        <label class="form-label">Student Name</label>
                        <input type="text" class="form-control" placeholder="Student Name" name="sname" id="sname" required >
                     </div>
                        
                    <div>
                        <label class="form-label">Course</label>
                        <input type="text" class="form-control" placeholder="Course" name="course" id="course" required >
                     </div>
                        
                     <div>
                        <label class="form-label">Fee</label>
                        <input type="text" class="form-control" placeholder="Fee" name="fee" id="fee" required >
                     </div>
                         </br>
                        
                         <div style="margin-left: 7rem;">
                         <input type="submit" id="submit" value="submit" name="submit" class="btn btn-primary">
                         <input type="reset" id="reset" value="reset" name="reset" class="btn btn-danger">
                     </div>  
                        
                </form>
            </div>
            
             <div class="col-sm-8">
                 <div class="panel-body">
                     <table id="tbl-student" class="table table-responsive table-bordered" cellpadding ="0" width="100%">
                         <thead>
                             <tr>
                                    <th>Id</th>
                                    <th>Student Name</th>
                                    <th>Course</th>
                                    <th>Fee</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                             </tr>  
                             
                            <%  
 
                                Connection con;
                                PreparedStatement pst;
                                ResultSet rs;
        
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
                                
                                  String query = "select * from records";
                                  Statement st = con.createStatement();
                                  
                                    rs = st.executeQuery(query);
                                    
                                        while(rs.next())
                                        {
                                           String id = rs.getString("id");
                            %> 
                            
                             <tr>
                                 <td><%=rs.getString("id")%></td>
                                 <td><%=rs.getString("s_name") %></td>
                                 <td><%=rs.getString("courses") %></td>
                                 <td><%=rs.getString("fees") %></td>
                                 <td><a href="update.jsp?id=<%=id%>">Edit</a></td>
                                 <td><a href="delete.jsp?id=<%=id%>">Delete</a></td>
                             </tr>
                            
                            
                                <%
                                
                                 }
                               %>
                            
                     </table>    
                 </div>
 
            </div>  
        </div>
    </body>
</html>