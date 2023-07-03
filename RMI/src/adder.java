import java.rmi.Remote;
import java.rmi.RemoteException;

public interface adder extends Remote{
    public int add(int n1, int n2) throws RemoteException;
}
