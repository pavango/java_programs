import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i != 0) {
            System.out.print("Enter The Number 1 Value :");
            double num1 = sc.nextDouble();
            System.out.print("Enter The Number 2 Value :");
            double num2 = sc.nextDouble();
            double sum = num1 + num2;
            System.out.println("The Sum Of " + num1 + " And " + num2
            + " Is :" + sum);
            System.out.print("Give 1 To Continue Or Give 0 To Exit :");
            i = sc.nextInt();
            
        }
    }
}
