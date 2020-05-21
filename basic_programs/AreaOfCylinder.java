import java.util.Scanner;
import java.lang.Math;

class AreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of Radius :");
        double radius = sc.nextDouble();
        System.out.print("Enter The Value Of Hight :");
        double hight = sc.nextDouble();
        final double pi = 3.142;
        double area = (2 * pi)* radius * hight + (2 * pi) * Math.pow(radius,2);
        System.out.println("The Area Of Cylinder Is :" + area);
    }
}
