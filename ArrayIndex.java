import java.util.*;

public class ArrayIndex {

// Main driver method
public static void main(String args[])
throws ArrayIndexOutOfBoundsException
{

// Taking input from user
Scanner s = new Scanner(System.in);

// Storing user input elements in an array
int arr[] = new int[7];

// Try block to check exception
try {
// Forcefully iteration loop no of times
// these no of times > array size
System.out.println("Enter the values of the array (7 elements only): \n ");
for (int i = 0; i < 9; i++) {

// Storing elements through nextInt()
arr[i] = s.nextInt();
}
}
catch (ArrayIndexOutOfBoundsException e) {
// Print message when any exception occurs
System.out.println("Array Bounds Exceeded...\nTry Again");
}
}
}
