import java.util.*;
import java.util.Scanner;

public class ArraySort {
    public static void main(String args[]) {
        
        Scanner str_sc = new Scanner(System.in);
        Scanner int_sc = new Scanner(System.in);
        System.out.println("Enter the number of Students : ");
        int n = int_sc.nextInt();
        
        float[][] StudentMarks = new float[n][7];
        String[] StudentName = new String[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("\n\nEnter the Name of the Student : ");
            StudentName[i] = str_sc.nextLine();
            
            System.out.println("Enter the Marks for 5 Subjects : ");
            StudentMarks[i][0] = int_sc.nextInt();  
            StudentMarks[i][1] = int_sc.nextInt();  
            StudentMarks[i][2] = int_sc.nextInt();
            StudentMarks[i][3] = int_sc.nextInt();
            StudentMarks[i][4] = int_sc.nextInt();
        
            StudentMarks[i][5] = (StudentMarks[i][0] + StudentMarks[i][1] + StudentMarks[i][2] + StudentMarks[i][3] + StudentMarks[i][4]);  // total
            System.out.println("Total : " + StudentMarks[i][5]);
            StudentMarks[i][6] = (StudentMarks[i][5]) / 5;  // average
            System.out.println("Average : " + StudentMarks[i][6]);
        }
        System.out.println("\n\n Final Matrix : \n"); 
        System.out.println("Name     Sub1  Sub2  Sub3  Sub4  Sub5  Tot  Avg");
        
        for(int i = 0; i < n; i++){
            System.out.print("\n");
            System.out.print(StudentName[i] + "  ");
            for(int j = 0; j < 6; j++){
                System.out.print(StudentMarks[i][j] + "  ");
            }
        }       
    }
}
