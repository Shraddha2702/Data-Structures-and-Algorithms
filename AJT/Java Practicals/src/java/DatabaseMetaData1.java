
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseMetaData1 {
  public static void main(String args[]) throws ClassNotFoundException, SQLException
  {
      Class.forName("oracle.jdbc.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "shraddha", "buffy1405");
      DatabaseMetaData db = con.getMetaData();
      
      System.out.println("Driver Name : "+db.getDriverName());
      System.out.println("Driver Version : "+db.getDriverVersion());
      System.out.println("User Name : "+db.getUserName());
      System.out.println("Database Product Name : "+db.getDatabaseProductName());
      System.out.println("Database Product Version : "+db.getDatabaseProductVersion());
      
      con.close();
  }
}
