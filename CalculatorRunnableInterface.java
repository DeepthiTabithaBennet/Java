import java.util.*;
import java.lang.Thread;

class Add implements Runnable{
    int value;
    public void run(){
        System.out.println("\nThread ID : " + Thread.currentThread().getId());
        Scanner int_sc = new Scanner(System.in);
       
        System.out.println("Enter the first number : ");
        int a = int_sc.nextInt();
       
        System.out.println("Enter the second number : ");
        int b = int_sc.nextInt();
       
        value = a + b;
        System.out.print(value);
    }
}

class Sub implements Runnable{
    int value;
    public void run(){
        System.out.println("\nThread ID : " + Thread.currentThread().getId());
        Scanner int_sc = new Scanner(System.in);
       
        System.out.println("Enter the first number : ");
        int a = int_sc.nextInt();
       
        System.out.println("Enter the second number : ");
        int b = int_sc.nextInt();
       
        value = a - b;
        System.out.print(value);
    }
}

class Mul implements Runnable{
    int value;
    public void run(){
        System.out.println("\nThread ID : " + Thread.currentThread().getId());
        Scanner int_sc = new Scanner(System.in);
       
        System.out.println("Enter the first number : ");
        int a = int_sc.nextInt();
       
        System.out.println("Enter the second number : ");
        int b = int_sc.nextInt();
       
        value = a * b;
        System.out.print(value);
    }
}

class Div implements Runnable{
    int value;
    public void run(){
        System.out.println("\nThread ID : " + Thread.currentThread().getId());
        Scanner int_sc = new Scanner(System.in);
       
        System.out.println("Enter the first number : ");
        int a = int_sc.nextInt();
       
        System.out.println("Enter the second number : ");
        int b = int_sc.nextInt();
       
        value = a + b;
        System.out.print(value);
    }
}

class Main{
    public static void main(String[] args){
   
        int ch;
        do {
           
            System.out.println("\n\n1  Addition \n2  Subtraction \n3  Multiplication \n4  Division \n");
           
            Scanner int_sc = new Scanner(System.in);
       
            System.out.println("Enter your choice : ");
            ch = int_sc.nextInt();
           
            switch(ch) {
                case 0:
                    break;
                   
                case 1:
                    Thread t1 = new Thread(new Add());
                    t1.start();
                    try{
                        t1.sleep(5000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
                   
                case 2:
                    Thread t2 = new Thread (new Sub());
                    t2.start();
                    try{
                        t2.sleep(5000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
                   
                case 3:
                    Thread t3 = new Thread (new Mul());
                    t3.start();
                    try{
                        t3.sleep(5000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
                   
                case 4:
                    Thread t4 = new Thread (new Div());
                    t4.start();
                    try{
                        t4.sleep(5000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    break;
            }
        } while (ch != 0);
    }
}
