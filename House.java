import java.util.Scanner;

public class House{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows  = 10;
        int columns = 10;
             
        for (int i = 1; i <= rows; i++){
            for (int j = i; j < rows; j++){
                System.out.print("   ");
            }  
            for (int k = 1; k <= (2*i - 1); k++){
                if (k == 1 || i == rows || k==(2*i - 1)){
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                if(j == 1 || j == columns){
                    System.out.print("      *");
                }
                if(j == 5 || j == columns-6){
                    if (i > 5)
                        System.out.print("   *   ");
                    else if (i == 5)
                        System.out.print("*******");
                    else
                        System.out.print("       ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("      *  *  *  *  *  *  *  *  *  *  *  *  *  *  *");
    }
}
