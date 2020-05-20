import java.util.Scanner;
import java.lang.Math;

class VolumeOfSphere {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double radius;
        System.out.print("Enter The Value Of Radius:");
        radius = sc.nextDouble();
        final double pi = 3.14;
        double volume = (4/3) * pi * Math.pow(radius, 3);
        System.out.println("The Volume Of Sphere Is:" + volume);
    }
}
