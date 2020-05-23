import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Factorial Number :");
        int factorialnumber = sc.nextInt();
        int factorial = 1;
        for (int number = 0; number < factorialnumber; number++) {
            factorial = factorial * (number + 1);
        }
        System.out.println("The Factorial Value Of " + factorialnumber
        + "! Is :" + factorial);
    }
}
