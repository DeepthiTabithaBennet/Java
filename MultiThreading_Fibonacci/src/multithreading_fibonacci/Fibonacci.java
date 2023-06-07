/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading_fibonacci;

/**
 *
 * @author admin
 */
import java.io.*;

class Fibonacci extends Thread {

    public void run() {
        try {
            int a = 0, b = 1, c = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nEnter the Limit for Fibonacci: ");
            int n = Integer.parseInt(br.readLine());

            System.out.println("\n\nThread ID : " + currentThread().getId());
            System.out.println("Fibonacci series:");
            while (n > 0) {
                System.out.print(c + " ");
                a = b;
                b = c;
                c = a + b;
                n = n - 1;
            }
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
