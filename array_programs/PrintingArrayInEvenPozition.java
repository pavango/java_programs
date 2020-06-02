import java.util.Scanner;

class PrintingArrayInEvenPozition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Numbers :");
        int size = sc.nextInt();
        int[] numbersArray = new int[size];
        System.out.print("Enter The Elements :");
        for (int i = 0; i < size; i++) {
            numbersArray[i] = sc.nextInt();
        }
        System.out.print("In GIven Numbers The Even position values are :");
        for (int j = 0; j < size; j++) {
            j = j + 1;
            System.out.print(numbersArray[j] + " ");
        }
        System.out.println();
    }
}
