class Car{
 String color;
 String manufacturer;
 String brand;
 String fuel;
 
 void display(){
 
   
   System.out.println("Color: " + color);
   System.out.println("Manufacturer: " + manufacturer);
   System.out.println("brand: " + brand);
   System.out.println("fuel: " + fuel);
   System.out.println("\n");
 }
}


class Info{
  public static void main(String[] args){
    Car c1 = new Car();
    Car c2 = new Car();
    Car c3 = new Car();
   
    System.out.println("Car Information");
    c1.color = "Green";
    c1.manufacturer = "Ford";
    c1.brand = "Mustang";
    c1.fuel = "Gasoline";
   
    c2.color = "Red";
    c2.manufacturer = "Toyota";
    c2.brand = "Prius";
    c2.fuel = "Electricity";
   
    c3.color = "Blue";
    c3.manufacturer = "Volkswagen";
    c3.brand = "Golf";
    c3.fuel = "Diesel";
   
    c1.display();
    c2.display();
    c3.display();
  }
}

public class CarInfo {
   public static void main(String[] args){
    Car c1 = new Car();
    Car c2 = new Car();
    Car c3 = new Car();
   
    System.out.println("Car Information");
    c1.color = "Green";
    c1.manufacturer = "Ford";
    c1.brand = "Mustang";
    c1.fuel = "Gasoline";
   
    c2.color = "Red";
    c2.manufacturer = "Toyota";
    c2.brand = "Prius";
    c2.fuel = "Electricity";
   
    c3.color = "Blue";
    c3.manufacturer = "Volkswagen";
    c3.brand = "Golf";
    c3.fuel = "Diesel";
   
    c1.display();
    c2.display();
    c3.display();
  }
   
}
