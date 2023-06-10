import java.io.*;
import java.util.Scanner;

class StrRev {
	public static void main (String[] args) {
		
		String str;
		String nstr = "";
		char ch;
		
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the string to be reversed : ");  
        str = sc.nextLine();
		
	    for (int i = 0; i < str.length(); i++){
		    ch = str.charAt(i); //extracts each character
		    nstr = ch + nstr; //adds each character in front of the existing string
	    }
	    System.out.println("Reversed word: "+ nstr);
	}
}
