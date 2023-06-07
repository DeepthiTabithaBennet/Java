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
public class MultiThreading_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Fibonacci fib = new Fibonacci();
            fib.start();
            fib.sleep(4000);
            Reverse rev = new Reverse();
            rev.start();
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
