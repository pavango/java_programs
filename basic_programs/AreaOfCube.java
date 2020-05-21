import java.util.Scanner;
import java.lang.Math;

class AreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Vlaue Of Side :");
        double side = sc.nextDouble();
        double area = 6 * Math.pow(side, 2);
        System.out.println("The Area Of Cube Is :" + area);
    }
}
