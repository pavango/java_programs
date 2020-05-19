import java.util.*;

class AreaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of Radius:");
        int radius = sc.nextInt();
        final double pi = 3.14;
        double area = pi* radius * radius;
        System.out.println("The Area OF Circle Is:" + area);
    }
}
