import java.util.Scanner;
class PrintingGivenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of an Numbers :");
        int size = sc.nextInt();
        int[] numbersArray = new int[size];
        System.out.print("enter the elements :");
        for (int i = 0; i < size; i++) {
            numbersArray[i] = sc.nextInt();
        }
        for (int j = 0; j < size; j++) {
            System.out.print("The Given Numbers Are :" + numbersArray[j] + " ");
        }
        System.out.println();
    }
}
