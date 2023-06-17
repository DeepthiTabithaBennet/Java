import java.util.Scanner;

class Vehicle{
  int idVehicle;
  String manufacturer;
  
  public String getManufacturer() {
    return manufacturer;
  }
  
  public void setManufacturer(String m) {
    this.manufacturer = m;
  }
}

public class TransportationVehicle extends Vehicle {
  int loadCapacity;
  
  public int getLoadCapacity() {
    return loadCapacity;
  }
  
  public void setLoadCapacity(int c) {
    this.loadCapacity = c;
  }
}

public class Truck extends TransportationVehicle {
  int noOfContainers;
   String manufacturer;
  public int getNoOfContainers() {
    return noOfContainers;
  }
  
  public void setNoOfContainers(int nc) {
    this.noOfContainers = nc;
  }
}

public class PassengerVehicle extends Vehicle {
  int noOfpassengers;
  
   public int getNoOfpassengers() {
    return noOfpassengers;
  }
  
  public void setNoOfpassengers(int np) {
    this.noOfpassengers = np;
  }
}

public class Car extends PassengerVehicle {
  int noOfDoors;
  String manufacturer;
  
  public int getNoOfDoors() {
    return noOfDoors;
  }
  
  public void setNoOfDoors(int nd) {
    this.noOfDoors = nd;
  }
}

public class Bike extends PassengerVehicle {
  int saddleHeight;
  String manufacturer;
  
  public int getSaddleHeight() {
    return saddleHeight;
  }
  
  public void setSaddleHeight(int sd) {
    this.saddleHeight = sd;
  }
}

class Multilevel{
  public static void main(String[] args){
  Vehicle v = new Vehicle();

    Bike bike = new Bike();
    bike.setManufacturer("TVS Scooty");
    bike.setNoOfpassengers(2);
    bike.setSaddleHeight(40);
    System.out.println("The Bike manufacturer is: "+bike.getManufacturer());
    System.out.println("The no of passengers riding this bike is: "+bike.getNoOfpassengers());
    System.out.println("The saddle height of this bike is: "+bike.getSaddleHeight());
      System.out.println("\n");
      
    
    Car car = new Car();
    car.setManufacturer("Hyundai");
    car.setNoOfDoors(4);
    car.setNoOfpassengers(4);
    System.out.println("The Car manufacturer is: "+car.getManufacturer());
    System.out.println("The no of passengers riding this car is: "+car.getNoOfpassengers());
    System.out.println("The no of doors of this car are: "+car.getNoOfDoors());
    System.out.println("\n");
    
    Truck truck = new Truck();
    
    truck.setManufacturer("Mahindra");
    truck.setLoadCapacity(1000);
    truck.setNoOfContainers(5);
    System.out.println("The Truck manufacturer is: "+truck.getManufacturer());
    System.out.println("The Load capacity of this truck is: "+truck.getLoadCapacity());
    System.out.println("Number of containers are: "+truck.getNoOfContainers());
  }
}
