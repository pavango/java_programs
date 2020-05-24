import java.util.Scanner;
// import java.Math.lang;
public class PowerUsingWhileLoop {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter The Value Of Base:");
       int base = sc.nextInt();
       System.out.print("Enter The Power Number :");
       int power = sc.nextInt();
       int value = 1;
       int i = 1;
       while (i <= power) {
           value = value * base;
           i++;
        }
        System.out.println("The Power Of" + base + " Is :" + value);
    }
}
