import java.io.*;
import java.util.Scanner;

class Palindrome {
    public static boolean isPalindrome(String str){

        String rev = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
  
    public static void main(String[] args){

        String str;
    
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the string to be checked : ");  
        str = sc.nextLine();

        // Convert the string to lowercase
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}

