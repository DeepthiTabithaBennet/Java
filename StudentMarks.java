import java.io.*;
import java.util.Scanner;

class Student{
    public String name;
    protected int mark1;
    protected int mark2;
    protected int mark3;
 
    void total(){
        System.out.println("Total mark : " + (mark1 + mark2 + mark3));
        System.out.println("\n");
    }

    private void average(){
        double avg = (mark1 + mark2 + mark3) / 3;
        System.out.println("Average : " + avg);
    }
 
    void display(){
        System.out.println("Name of the student : " + name);
        System.out.println("Mark in 1st subject : " + mark1);
        System.out.println("Mark in 2nd subject : " + mark2);
        System.out.println("Mark in 3rd subject : " + mark3);
    }
}

public class StudentMarks {
    public static void main(String[] args){
        System.out.println("Student marks and average of 3 subjects:\n");
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
   
        s1.name="Deepthi";
        s1.mark1 = 98;
        s1.mark2 = 97;
        s1.mark3 = 99;
 
        s2.name="Preethi";
        s2.mark1 = 99;
        s2.mark2 = 100;
        s2.mark3 = 96;
   
        s3.name="Shreya";
        s3.mark1 = 75;
        s3.mark2 = 80;
        s3.mark3 = 90;
   
   
        s1.display();
        s1.total();
        //s1.average();   shows error since sverage() is private
   
        s2.display();
        s2.total();
        //s2.average();   shows error since sverage() is private
   
        s3.display();
        s3.total();
        //s3.average();   shows error since sverage() is private
    } 
}
