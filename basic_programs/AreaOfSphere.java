import java.util.*;
import java.lang.Math;

class AreaOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of Radius:");
        double radius = sc.nextDouble();
        final double pi = 3.141;
        double area = 4 * pi * Math.pow(radius, 2);
        System.out.println("The Area Of Sphere Is :" + area);
    }
}
