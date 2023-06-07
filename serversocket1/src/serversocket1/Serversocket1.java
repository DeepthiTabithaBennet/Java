package serversocket1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serversocket1 {

    public static void main(String[] args) {
        try{
            ServerSocket se = new ServerSocket(9999);
            Socket s = se.accept();
            BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String t =  b.readLine();
            System.out.println("Client 1 : "+t);
            PrintStream pr = new PrintStream(s.getOutputStream());
            
            while(!t.equals("bye")){
                System.out.print("Server : ");
                BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
                String te = d.readLine();
                pr.println(te);
                t = b.readLine();
                System.out.println("Client 1 : "+t);
            }
        }
        
        catch(Exception ex){
            
        }
    }
    
}
