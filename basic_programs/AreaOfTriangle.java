import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of Base :");
        double base = sc.nextDouble();
        System.out.print("Enter The Value Of Height :");
        double height = sc.nextDouble();
        double area = (base * height) / 2;
        System.out.println("The Area Of Triangle Is :" + area);
    }
}
