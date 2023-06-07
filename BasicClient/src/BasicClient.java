
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class BasicClient {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 9999);
            PrintStream pr = new PrintStream(s.getOutputStream());
            System.out.println("Client: ");
            BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
            String tmp = d.readLine();
            pr.println(tmp);
        } 
        catch (Exception e) {

        }
    }

}
