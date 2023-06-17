import java.util.*;

public class Main extends Thread{
    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getId() + " Running");
        }
        catch(Exception e){
             System.out.println("Exception caught!");
        }
    }
    
    public static void main(String[] args) {
        
        System.out.print("Enter the number of Threads : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){
            Main obj = new Main();
            obj.start();
        }
    }
}
