import java.util.Scanner;

public class Prime{  
    public static void main(String[] args){  
    
        int ct = 0, n = 0, i = 1, j = 1, num;  
        
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number : ");  
        num = sc.nextInt(); 
        
        while(i < num){  
            // prime no.s less than num -> (i < num)
            // num no.of prime no.s -> (n < num)
  
            j = 1;  
            ct = 0;  
            
            while(j <= i){  
                if(i % j == 0)  
                    ct++;  
                j++;   
            }  
            if(ct == 2){  // the factors of the number are only 1 and itself
                System.out.printf("%d ", i);  
                n++;  
            }  
            i++;  
        }    
    }  
}
