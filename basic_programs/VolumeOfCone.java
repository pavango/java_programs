import java.util.*;
import java.lang.Math;

class VolumeOfCone {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double radius, height;
        System.out.print("Enter The Value Of Radius:");
        radius = sc.nextDouble();
        System.out.print("Enter The Value Of Height:");
        height = sc.nextDouble();
        final double pi = 3.141;
        double volume = pi * Math.pow(radius, 2) * height/3;
        System.out.println("The Volume Of Cone Is:" + volume);
    }
}
