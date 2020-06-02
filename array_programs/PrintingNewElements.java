import java.util.Scanner;

class PrintingNewElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Numbers :");
        int size = sc.nextInt();
        int[] numbersArray = new int[size];
        System.out.print("Enter The Elements :");
        int i = 0;
        for (i = 0; i < size; i++) {
            numbersArray[i] = sc.nextInt();
        }
        int[] newArray = new int[size];
        System.out.print("Elements of Original Array :");
        for (int j = 0; j < size; j++) {
            System.out.print(numbersArray[j] + " ");
            newArray[j] = numbersArray[j];
        }
        System.out.println();
        System.out.print("Elements of new Array :");
        for (int k = 0; k < size; k++) {
            System.out.print(newArray[k] + " ");
        }
        System.out.println();
    }
}
