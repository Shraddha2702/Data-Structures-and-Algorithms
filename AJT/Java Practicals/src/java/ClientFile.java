
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class ClientFile {
    public static void main(String args[])
    {
        try
        {
            System.out.println("Client");
        System.out.println("Enter the country Name ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String con = br.readLine();
        
        DatagramSocket ds = new DatagramSocket(4000);
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(con.getBytes(),con.length(),ip,3000);
        ds.send(dp);
        
        byte[] buf = new byte[1000];
        DatagramPacket dp1 = new DatagramPacket(buf,1000);
        ds.receive(dp1);
        
        String cap = new String(dp1.getData(),0,dp1.getLength());
        System.out.println(cap);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
