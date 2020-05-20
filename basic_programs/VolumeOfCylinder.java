import java. util.*;
import java.lang.Math;

class VolumeOfCylinder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of Radius:");
        int radius = sc.nextInt();
        System.out.print("Enther The Value OF Height:");
        int height = sc.nextInt();
        final double pi = 3.141;
        double volume = pi * Math.pow(radius, 2) * height;
        System.out.println("The Volume Of Cylinder Is:" + volume);
    }
}
