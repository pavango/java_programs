import java.util.Scanner;

class FibNumber {
    public static void main(String[] args) {
        int secondPreviousNumber = 0;
        int previousNumber = 1;
        int currentNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :");
        int number = sc.nextInt();
        System.out.print(secondPreviousNumber + " ");
        System.out.print(previousNumber + " ");
        int counter = 3;
        do {
            currentNumber = secondPreviousNumber + previousNumber;
            secondPreviousNumber = previousNumber;
            previousNumber = currentNumber;
            System.out.print(currentNumber + " ");
            counter++;
        } while (counter <= number);
        System.out.println();
    }
}
