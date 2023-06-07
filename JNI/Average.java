import java.util.*;

class Average {
    public native double average(int n1, int n2, int n3);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three values : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        Average avg = new Average();
        double result = avg.average(n1, n2, n3);
        System.out.println("Average = " + result);
    }

    static {
        System.LoadLibrary("Average");
    }
}