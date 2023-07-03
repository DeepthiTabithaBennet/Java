import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerRMI extends UnicastRemoteObject implements adder{
    public ServerRMI() throws RemoteException{
        super();
    }

    @Override
    public int add(int n1, int n2) throws RemoteException {
        return n1+n2;
    }
    
    public static void main(String args[]) throws RemoteException{
        try{
            Registry reg = LocateRegistry.createRegistry(4444);
            reg.rebind("hello_server", new ServerRMI());
            System.out.println("Server ready");
        }
        
        catch(RemoteException e){
            System.out.println("Exception"+e);
        }
    }
}
