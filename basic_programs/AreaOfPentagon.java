import java.util.*;

class AreaOfPentagon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double side, length;
        System.out.print("Enter The Value Of Side:");
        side = sc.nextDouble();
        System.out.print("Enter The Value Of Apothem Length:");
        length = sc.nextDouble();
        double area = (5/2) * side * length;
        System.out.println("The Volume Of Sphere Is:" + area);
    }
}
