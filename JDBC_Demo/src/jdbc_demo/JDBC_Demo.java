package jdbc_demo;

import java.sql.*;
public class JDBC_Demo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load driver class
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        //connection object
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
      
        //create the statement object
        Statement st = con.createStatement();
        
        
        //execute query : DISPLAY
        ResultSet re1 = st.executeQuery("select * from employee");
        while(re1.next())
            System.out.println(re1.getString(1) + " " + re1.getString(2) + " " +  re1.getInt(3));
        
        System.out.println("\n");
        
        
        //execute query : INSERT
        String query1 = "INSERT INTO employee (emp_id, emp_name, salary) VALUES (3, 'Priya', 90000)";
        int count1 = st.executeUpdate(query1);
        System.out.println("Number of rows updated in database = " + count1);
        ResultSet re2 = st.executeQuery("select * from employee");
        while(re2.next())
            System.out.println(re2.getString(1) + " " + re2.getString(2) + " " +  re2.getInt(3));
        
        System.out.println("\n");
        
        
        //execute query : DELETE
        String query2 = "DELETE FROM employee WHERE emp_name = 'Priya' ";
        int count2 = st.executeUpdate(query2);
        System.out.println("Number of rows updated in database = " + count2);
        ResultSet re3 = st.executeQuery("select * from employee");
        while(re3.next())
            System.out.println(re3.getString(1) + " " + re3.getString(2) + " " +  re3.getInt(3));
        
        System.out.println("\n");
        
        
        //execute query : UPDATE
        String query3 = "UPDATE employee SET emp_name = 'Deepthi Bennet' WHERE emp_id = 1";
        int count3 = st.executeUpdate(query3);
        System.out.println("Number of rows updated in database = " + count3);
        ResultSet re4 = st.executeQuery("select * from employee");
        while(re4.next())
            System.out.println(re4.getString(1) + " " + re4.getString(2) + " " +  re4.getInt(3));
        
        System.out.println("\n");
        //close connection
        con.close();
    }
    
}
