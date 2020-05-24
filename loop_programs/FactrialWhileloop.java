import java.util.Scanner;

class FactrialWhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Factorial Number :");
        int factorialnumber = sc.nextInt();
        int factorial = 1;
        int number = 1;
        while (number <= factorialnumber) {
            factorial = factorial * number;
            number++;
        }
        System.out.println("The Factorial Of " + factorialnumber + "! Is "
        + factorial);
    }
}
