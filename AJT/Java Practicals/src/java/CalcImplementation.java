
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalcImplementation extends UnicastRemoteObject implements CalculatorInterface{
    CalcImplementation() throws RemoteException
    {
        super();
    }
    @Override
    public int add1(int a, int b) {
        int c = a+b;
        return c;
    }

    @Override
    public int sub1(int a, int b) {
       int c = 0;
       if(a>b){c = a-b;}
       else {c = b-a;}
       return c;
    }

    @Override
    public int mul1(int a, int b) {
        int c = a*b;
        return c;
    }

    @Override
    public int div1(int a, int b) {
        int c = a/b;
        return c;
    }
}
