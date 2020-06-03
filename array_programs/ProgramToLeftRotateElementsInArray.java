import java.util.Scanner;

class ProgramToLeftRotateElementsInArray {
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
        int rotationValue = rotation % size;
        for (int k = 0; k < rotationValue; k++) {
            int firstElement = numbersArray[0];
            for (int j = 0; j < size - 1; j++) {
                numbersArray[j] = numbersArray[j + 1];
            }
            numbersArray[size - 1] = firstElement;
        }
        System.out.print("Array After Left Rotation :");
        for (int k = 0; k < size; k++) {
            System.out.print(numbersArray[k] + " ");
        }
        System.out.println();
    }
}
