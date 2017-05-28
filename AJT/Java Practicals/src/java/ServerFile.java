
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ServerFile {
    public static void main(String args[])
    {
        try
        {
            System.out.println("Server");
        DatagramSocket ds = new DatagramSocket(3000);
        
        byte[] buf = new byte[1000];
        
        DatagramPacket dp = new DatagramPacket(buf,1000);
        ds.receive(dp);
        
        String s = new String(dp.getData(),0,dp.getLength());
        
        System.out.println("Country : "+s);
        
        //Database Connectivity
        
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "shraddha", 
                "buffy1405");
        
        Statement st = conn.createStatement();
        String quer = "SELECT * FROM SHRADDHA.CAPITAL WHERE COUNTRY='"+s+"'";
        
        ResultSet rs = st.executeQuery(quer);
        String cap = "";
        while(rs.next())
        {
            cap = rs.getString(2);
        }
        System.out.println(cap);
        
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp1 = new DatagramPacket(cap.getBytes(),cap.length(),
                ip,4000);
        ds.send(dp1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
