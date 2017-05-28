
import java.sql.Connection;
import java.sql.DriverManager;
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
public class DatabaseExample {
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.OracleDriver");
        
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                "shraddha","buffy1405");
       
        Statement st = conn.createStatement();
        
        int i = st.executeUpdate("INSERT INTO BOOKS (BOOK_ID,TITLE,AUTHOR_LAST_NAME,AUTHOR_FIRST_NAME,"
                + "RATING) VALUES(123,FAULT IN OUR STARS, SAF, RTER, 3)");
        
        System.out.println(i);
        
        conn.close();
    }
}
