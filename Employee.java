import java.util.Scanner;

class Employee{
    int id;
    String name, address, dateHired, position;
    
    void pay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();

        
        System.out.println("Enter address: ");
        address = sc.nextLine();

        
        System.out.println("Enter the date hired: ");
        dateHired = sc.nextLine();
        
        System.out.println("Enter position of the employee: ");
        position = sc.nextLine();
        
        System.out.println("The name of the employee is: "+name);
        System.out.println("The address of the employee is: "+address);
        System.out.println("The date hired for the employee is: "+dateHired);
        System.out.println("The position of the employee is: "+position);        
        System.out.println("Function of Employee called");
    }
}

class Salaried extends Employee {
    int annualSalary, bonus;
    
    void calcBonus(){
        System.out.println("Function of salaried called");
    }
}

class Hourly extends Employee{
  int hourlyRate, overtimeRate;
  
  void calcOvertime(){
        System.out.println("Function of hourly called");
  }
}

class Temporary extends Employee{
  int dailyRate, ytdHours;
  
  void determinePermEligibility(){
       System.out.println("Function of temporary called");
  }
}

public class HelloWorld{

     public static void main(String []args){
        Employee e = new Employee();
        Salaried s = new Salaried();
        Hourly h = new Hourly();
        Temporary t = new Temporary();
        
        e.pay();
        System.out.println("\n");
        s.calcBonus();
        System.out.println("\n");
        h.calcOvertime();
        System.out.println("\n");
        t.determinePermEligibility();
     }
}
