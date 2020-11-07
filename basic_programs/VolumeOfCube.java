import java.util.*;
import java.lang.Math;

class VolumeOfCube {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double edge, volume;
        System.out.print("Enter The Value Of Edge:");
        edge = sc.nextDouble();
        volume = Math.pow(edge, 3);
        System.out.println("The Volume Of Cube Is:" + volume);
    }
}
