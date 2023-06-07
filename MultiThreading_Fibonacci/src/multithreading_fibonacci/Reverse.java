/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading_fibonacci;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author admin
 */
class Reverse extends Thread {

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nEnter the Limit for Fibonacci Reverse : ");
            int n = Integer.parseInt(br.readLine());

            System.out.println("\n\nThread ID : " + currentThread().getId());
            System.out.println("Reverse is: ");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + "  ");
            }
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
