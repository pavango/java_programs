import java.util.Scanner;

class ReversNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Numbers :");
        int size = sc.nextInt();
        int[] numbersArray = new int[size];
        System.out.print("Enter The Elements :");
        for (int i = 0; i < size; i++) {
            numbersArray[i] = sc.nextInt();
        }
        System.out.print("The Revers Form Of Given Numbers Is :");
        for (int j = size - 1; j >= 0; j--) {
            System.out.print(numbersArray[j] + " ");
        }
        System.out.println();
    }
}
