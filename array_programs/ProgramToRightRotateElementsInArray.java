import java.util.Scanner;

class ProgramToRightRotateElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Numbers :");
        int size = sc.nextInt();
        int[] numbersArray = new int[size];
        System.out.print("Enter The Original array Elements :");
        for (int i = 0; i < size; i++) {
            numbersArray[i] = sc.nextInt();
        }
        System.out.print("Enter The Rotation Value :");
        int rotation = sc.nextInt();
        int rotationValue = rotation % 5;
        for (int k = 0; k < rotationValue; k++) {
            int lastElement = numbersArray[size - 1];
            for (int j = size - 1; j > 0; j--) {
                numbersArray[j] = numbersArray[j - 1];
            }
            numbersArray[0] = lastElement;
        }
        System.out.print("Array after right rotation :");
        for (int k = 0; k < size; k++) {
            System.out.print(numbersArray[k] + " ");
        }
        System.out.println();
    }
}
