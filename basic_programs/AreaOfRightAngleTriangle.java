import java.util.Scanner;

class AreaOfRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ether The Value Of Base :");
        double base = sc.nextDouble();
        System.out.print("Ether The Value Of Perpendicular :");
        double perpendicular = sc.nextDouble();
        double area = (base * perpendicular) / 2;
        System.out.println("The Area Of Right Angle Triangle Is:" + area);
    }
}
