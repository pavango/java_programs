import java.util.*;

class VolumeOfSphere {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of Radius:");
        int radius = sc.nextInt();
        final double pi = 3.14;
        final int cnv=4/3;
        double volume = cnv * pi * radius * radius *radius;
        System.out.println("The Volume Of Sphere is:" + volume);
    }
}
