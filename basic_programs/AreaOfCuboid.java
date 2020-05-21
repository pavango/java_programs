import java.util.Scanner;

class AreaOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.print("Enter The Value Of Length :");
        double length = sc.nextDouble();
        System.out.print("Enter The Value Of Hight :");
        double hight = sc.nextDouble();
        System.out.print("Enter The Value Of Width :");
        double width = sc.nextDouble();
        double area = (2 * length * hight) + (2 * width * hight ) + (2 * length * width);
        System.out.println("Area Of Cuboid Is :" + area);

    }
}
