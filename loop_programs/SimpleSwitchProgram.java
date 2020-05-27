import java.util.Scanner;

class SimpleSwitchProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Calculate Addition press 1.");
        System.out.println("To Calculate Subtraction press 2.");
        System.out.println("To Calculate Multiply press 3.");
        System.out.println("To Calculate Divide press 4.");
        int number = sc.nextInt();
        System.out.print("Enter 1st Number :");
        int a = sc.nextInt();
        System.out.print("Enter The 2nd Number :");
        int b = sc.nextInt();
        switch (number) {
            case 1:
            int d = a + b;
            System.out.println("The Addtion Value Of " + a + " And " + b + " Is " + d);
            break;
            case 2:
            int x = a - b;
            System.out.println("The Subraction Value Of " + a + " And " + b + " Is " + x);
            break;
            case 3:
            int y = a * b;
            System.out.println("The Multiplied Value Of " + a + " And " + b + " Is " + y);
            break;
            case 4:
            int z = a / b;
            System.out.println("The Divided Value Of " + a + " And " + b + " Is " + z);
            break;
        }
    }
}
