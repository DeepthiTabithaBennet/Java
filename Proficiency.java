import java.util.*;

interface student{
   public void getstuddetails();    
}

interface mark extends student{
   public void getmarks();
}
 
interface sports extends student{
  public void getsportsgrade();
}

class proficiency implements sports,mark{
   public void getstuddetails()
   {
       int age;
       String name;
       Scanner s=new Scanner(System.in);
       System.out.println("\nEnter your name: ");
       name=s.next();
       System.out.println("\nEnter your age: ");
       age= s.nextInt();    
   }
   
   int mark;
   int grade;
   
   public void getmarks()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("\nEnter your percentage marks: ");
       mark=sc.nextInt();  
   }
   
   public void getsportsgrade()
   {
       Scanner c=new Scanner(System.in);
       System.out.println("\nEnter Sports grade: ");
       grade=c.nextInt();  
   }
   
   public void prof()
   {
   if (mark >= 90 && grade >= 90){
      System.out.println("\nEligible for proficiency\n");
   }
   
   else{
       System.out.println("\nNot eligible for proficiency\n");
   }
 }
   
}  
class Proficiency {
 
   public static void main(String[] args) {
       int n;
       
       Scanner sc=new Scanner(System.in);
       System.out.print("\nEnter no of students: ");
       
       n=sc.nextInt();
       proficiency[] arr = new proficiency[n];
       
       for(int i=0;i<n;i++){
           arr[i]=new proficiency();
           arr[i].getstuddetails();
           arr[i].getmarks();
           arr[i].getsportsgrade();
           arr[i].prof();
       }
   }
}
