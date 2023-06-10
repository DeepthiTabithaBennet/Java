import java.io.*;
import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {

    String operator;
    char type;
    //Double number1, number2, result;

    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    
    // ask users to choose the type of operator
    System.out.println("Choose the type of operator : \n(1) Arithmetic \n(2) Logical \n(3) Relational ");
    type = input.next().charAt(0);
    
    if (type == '1'){
        Double number1, number2, result;
        // ask users to enter operator
        System.out.println("Choose an operator : +, -, *, /");
        operator = sc.nextLine();

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();
    
        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case "+":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case "/":
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
    
    if (type == '2'){
        boolean number1, number2, result;
        // ask users to enter operator
        System.out.println("Choose an operator : &&, ||, !");
        operator = sc.nextLine();

        // ask users to enter numbers
        System.out.println("Enter first value (true/false)");
        number1 = input.nextBoolean();

        switch (operator) {

            // performs addition between numbers
            case "&&":
                System.out.println("Enter second value (true/false)");
                number2 = input.nextBoolean();
                result = number1 && number2;
                System.out.println(number1 + " && " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case "||":
                System.out.println("Enter second value (true/false)");
                number2 = input.nextBoolean();
                result = number1 || number2;
                System.out.println(number1 + " || " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case "!":
                result = !number1;
                System.out.println("!" + number1 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
        
    if (type == '3'){
        Double number1, number2;
        boolean result;
        // ask users to enter operator
        System.out.println("Choose an operator : ==, !=, >, <, >=, <=");
        operator = sc.nextLine();

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();
    
        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case "==":
                result = (number1 == number2);
                System.out.println(number1 + " == " + number2 + " -> " + result);
                break;

            // performs subtraction between numbers
            case "!=":
                result = (number1 != number2);
                System.out.println(number1 + " != " + number2 + " -> " + result);
                break;

            // performs multiplication between numbers
            case ">":
                result = (number1 > number2);
                System.out.println(number1 + " > " + number2 + " -> " + result);
                break;

            // performs division between numbers
            case "<":
                result = (number1 < number2);
                System.out.println(number1 + " < " + number2 + " -> " + result);
                break;
                
            case ">=":
                result = (number1 >= number2);
                System.out.println(number1 + " >= " + number2 + " -> " + result);
                break;
                
            case "<=":
                result = (number1 <= number2);
                System.out.println(number1 + " <= " + number2 + " -> " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
    
    input.close();
    }
}
