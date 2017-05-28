
import java.rmi.Naming;
import java.rmi.registry.Registry;
import java.util.Scanner;



public class ServerSide{
    public static void main(String args[])
    {
        try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
        CalculatorInterface ca = new CalcImplementation();
        r.rebind("180",ca);
        System.out.print("Connected !");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
