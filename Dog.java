import java.util.Scanner;

class Dog{
    String breed;
    String size;
    String color;
    String name;
    int age;
  
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter the breed of the dog: ");
        breed = sc.nextLine();
    
        System.out.println("Enter the size of the dog: ");
        size = sc.nextLine();
    
        System.out.println("Enter the color of the dog: ");
        color = sc.nextLine();
    
        System.out.println("Enter the age of the dog: ");
        age = sc.nextInt();
    }
  
    void display(){
        System.out.println("Breed : " + breed);
        System.out.println("Size : " + size);
        System.out.println("Colour : " + color);
        System.out.println("Age : " + age);
    }
  
    void Eat(){
        System.out.println(name + " is Eating");
    }
  
    void Run(){
        System.out.println(name + " is Running");
    }
  
    void Sleep(){
        System.out.println(name + " is Sleeping");
    }
    
    void Name(){
        System.out.println("Enter the name of the dog: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("\nName : " + name);
    }
}

public class Main{
    public static void main(String[] args){
        Dog[] d;
        int n;
        String name = " ";
    
        Scanner dd = new Scanner(System.in);
        System.out.println("No of objects: ");
        n = dd.nextInt();
        d = new Dog[n];
    
        for(int i = 0; i < n; i++){
            d[i] = new Dog();
            d[i].getData();
            d[i].Name();
            d[i].display();
            d[i].Eat();
            d[i].Run();
            d[i].Sleep();
        }
    }
}
