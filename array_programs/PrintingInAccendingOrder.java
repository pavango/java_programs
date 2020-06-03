import java.util.Scanner;

class PrintingInAccendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of Array :");
        int size = sc.nextInt();
        int[] numbersArray = new int[size];
        System.out.print("Enter The Array Elements :");
        for (int i = 0; i < size; i++) {
            numbersArray[i] = sc.nextInt();
        }
        for (int j = 0; j < size; j++) {
            for (int k = j + 1; k < size; k++) {
                if (numbersArray[j] > numbersArray[k]){
                    int largestNumber = numbersArray[j];
                    numbersArray[j] = numbersArray[k];
                    numbersArray[k] = largestNumber;
                }
            }
        }
        System.out.print("Elements Of Array Sorted In Ascending Order :");
        for (int x = 0;x < size;x++) {
            System.out.print(numbersArray[x] + " ");
        }
        System.out.println();
    }
}
