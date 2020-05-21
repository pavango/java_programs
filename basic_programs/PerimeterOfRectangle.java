import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of Length :");
        double length = sc.nextDouble();
        System.out.print("Enter The Value Of Width :");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println(" The Perimeter Of Rectangle Is :" + perimeter);

    }

}
