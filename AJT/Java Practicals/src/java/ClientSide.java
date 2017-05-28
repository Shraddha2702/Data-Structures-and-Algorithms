
import java.rmi.Naming;
import java.util.Scanner;


public class ClientSide {
    public static void main(String args[])
    {
        try
        {
          CalculatorInterface ca = (CalculatorInterface)Naming.lookup("180");
            System.out.println("Enter two nos");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ad,s,m,d;
        
        ad = ca.add1(a, b);
        s = ca.sub1(a,b);
        m = ca.mul1(a,b);
        d = ca.div1(a,b);
        
        System.out.println("Addition "+ad);
        System.out.println("Substraction "+s);
        System.out.println("Multiplication "+m);
        System.out.println("Division "+d);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
