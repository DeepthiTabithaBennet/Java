
import java.io.*;
import java.net.*;
import java.util.*;

public class CalculatorClient {

    private Socket s = null;

    public CalculatorClient(String address, int port) {
        try {
            // In this Code Input Getting from a user
            Scanner sc = new Scanner(System.in);
            s = new Socket(address, port);
            System.out.println("Connected");

            // Create two objects first is dis and dos for input and output
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            // Making a Loop
            while (true) {
                System.out.print("Enter the operation in the form operand operator operand : ");
                String inp = sc.nextLine();

                // Check the user input if user enter over then connect is stopped by server and user
                if (inp.equals("over")) {
                    break;
                }
                dos.writeUTF(inp);

                String ans = dis.readUTF();
                System.out.println("Answer = " + ans);
            }
        } catch (Exception e) {
            System.out.println("Error in Connection");
        }
    }

    public static void main(String args[]) {
        // Connection With Server port 5000
        CalculatorClient client = new CalculatorClient("127.0.0.1", 5000);
    }
}
