
import java.io.*;
import java.net.*;
import java.util.*;

public class CalculatorServer {
    // initialize socket and input stream

    private Socket socket = null;

    // constructor with port
    public CalculatorServer(int port) {
        try {
            // Making a ServerSocket object for receiving Client Request
            ServerSocket ss = new ServerSocket(port);
            Socket s = ss.accept();

            // dis and dos object for receiving input from client send output to client
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            while (true) {
                String input = dis.readUTF();
                if (input.equals("bye")) {
                    break;
                }
                System.out.println("Equation Received");
                int result = 0;

                StringTokenizer st = new StringTokenizer(input);
                int oprnd1 = Integer.parseInt(st.nextToken());
                String operation = st.nextToken();
                int oprnd2 = Integer.parseInt(st.nextToken());

                // Calculator Operation Perform By Server
                if (operation.equals("+")) {
                    result = oprnd1 + oprnd2;
                } 
                else if (operation.equals("-")) {
                    result = oprnd1 - oprnd2;
                } 
                else if (operation.equals("/")) {
                    result = oprnd1 / oprnd2;
                } 
                else if (operation.equals("*")) {
                    result = oprnd1 * oprnd2;
                }
                
                System.out.println("Sending the Result");
                dos.writeUTF(Integer.toString(result));
            }
        } 
        catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String args[]) {
        // Server Object and set port number 5000
        CalculatorServer server = new CalculatorServer(5000);
    }
}
