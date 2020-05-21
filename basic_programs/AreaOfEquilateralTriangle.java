import java.util.Scanner;
import java.lang.Math;

class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of Side :");
        double side = sc.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println("The Area Of Equilateral Triangle Is :" + area);
    }
}
