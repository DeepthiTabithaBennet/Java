import java.io.*;
import java.util.Scanner;

public class FarenheitToCelsius{  
   public static void main (String args[]){ 
       float Fahrenheit, Celsius;  
       
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter the Temperature in Farenheit : ");
       Fahrenheit = sc.nextFloat();
       
       Celsius  = ((Fahrenheit-32)*5)/9;  
       System.out.println("Temperature in Celsius : " + Celsius);  
       
       if (Celsius < 15)
           System.out.println("There is a good chance of rain");
           
       else
           System.out.println("It is a clear day!");
    }
}  
