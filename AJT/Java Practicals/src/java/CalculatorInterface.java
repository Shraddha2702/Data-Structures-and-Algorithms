
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface CalculatorInterface extends Remote {
   
        int add1(int a, int b) throws RemoteException;
        int sub1(int a,int b)throws RemoteException;
        int mul1(int a,int b)throws RemoteException;
        int div1(int a,int b)throws RemoteException;
}
