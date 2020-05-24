import java.util.Scanner;
// import java.Math.lang;
public class Power {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Value Of Base:");
       int base = sc.nextInt();
       System.out.println("Enter The Power Number :");
       int power = sc.nextInt();
       int value = 1;
       for (int i = 1; i <= power; i++ ) {
           value = value * base;
        }
        System.out.println("The Power Of" + base + " Is :" + value);
    }
}
