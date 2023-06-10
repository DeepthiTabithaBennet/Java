import java.io.*;
import java.util.Scanner;

public class GradePrinting{

    public static void main(String args[]){
    	
    	int n;
    	
        int marks[] = new int[5];
        float total = 0, avg;
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of students : ");
		n = scanner.nextInt();
		
		for(int i = 0; i < n; i++){
            System.out.print("\n\n");
            for(int j = 0; j < 5; j++) { 
                System.out.print("Enter Marks of Subject " + (j + 1) + " : ");
                marks[j] = scanner.nextInt();
                total = total + marks[j];
            }

            avg = total / 5;
            System.out.print("Grade : ");
        
            if(avg >= 90)
                System.out.print("S");
        
            else if(avg >= 80 && avg < 90)
                System.out.print("A");
          
            else if(avg >= 60 && avg < 80)
                System.out.print("B");
       
            else if(avg >=40 && avg < 60)
                System.out.print("C");
            
            else
                System.out.print("D");
         }
    }
}
