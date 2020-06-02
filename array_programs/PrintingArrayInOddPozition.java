import java.util.Scanner;

class PrintingArrayInOddPozition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Numbers :");
        int size = sc.nextInt();
        int[] numbersArray = new int[size];
        System.out.print("Enter The Elements :");
        for (int i = 0; i < size; i++) {
            numbersArray[i] = sc.nextInt();
        }
        for (int j = 0; j < size; j++) {
            int remainder = j % 2;
            if (remainder == 0) {
               System.out.print("In GIven Numbers The Odd position values are :"
               + numbersArray[j] + " ");
            }
        }
        System.out.println();
    }
}
