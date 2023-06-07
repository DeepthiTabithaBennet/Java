
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BasicServer {

    public static void main(String[] args) {
        try {
            ServerSocket se = new ServerSocket(9999);
            Socket s = se.accept();
            BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String t = b.readLine();
            System.out.println("I received: " + t);
            String tem = "I got your message";
            PrintStream pr = new PrintStream(s.getOutputStream());
            pr.println(tem);

        } 
        catch (Exception e) {

        }
    }

}
