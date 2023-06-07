import Calculator.*;

public class PackageCalculator {
    public static void main (String args[]){
        Addition obj1 = new Addition();
        Subtraction obj2 = new Subtraction();
        Multiplication obj3 = new Multiplication();
        Division obj4 = new Division();
        Modulo obj5 = new Modulo();
        
        obj1.add(10, 25);
        obj2.sub(10, 25);
        obj3.mult(10, 25);
        obj4.div(10, 25);
        obj5.mod(10, 25);
    }
}
