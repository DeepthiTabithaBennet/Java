import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {
   public static void main(String args[]){
       ClientRMI crmi = new ClientRMI();
       crmi.connectRemote();
   }

    private void connectRemote() {
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",4444);

            adder addition = (adder) reg.lookup("hello_server");
            
            System.out.println("Addition is: "+addition.add(45, 23));
        }
        
        catch(NotBoundException|RemoteException e){
            System.out.println("Exception"+e);
        }
    }
}
