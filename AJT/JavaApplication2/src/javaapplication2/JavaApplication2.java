/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author SHRADDHA
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHRADDHA
 */
public class JavaApplication2 {
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.OracleDriver");
        
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                "shraddha","buffy1405");
       
        Statement st = conn.createStatement();
       
        ResultSet s = st.executeQuery("Select * from books");
        
       while(s.next()){System.out.println("true");}
        
        conn.close();
    }
}
