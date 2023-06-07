package clientsocket2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Clientsocket2 {

    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 9999);
            PrintStream pr = new PrintStream(s.getOutputStream());
            System.out.print("Client 2 : ");
            BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
            String tmp = d.readLine();
            pr.println(tmp);
           
            while(!tmp.equals("bye")){
                BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String tp = b.readLine();
                System.out.println("Server: "+tp);
                System.out.print("Client 2 : ");
                tmp = d.readLine();
                pr.println(tmp);
            }
        }
       
        catch(Exception ex){
           
        }
    }  

}
