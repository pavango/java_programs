import  java.util.Scanner;

class SumOfGivenArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array :");
        int size = sc.nextInt();
        int[] numberArray = new int[size];
        System.out.print("Enter The Elements :");
        for (int i = 0; i < size; i++) {
            numberArray[i] = sc.nextInt();
        }
        int value = 0;
        for (int j = 0;j < size; j++) {
            value = value + numberArray[j];
        }
        System.out.println("Sum Of Given Array Elements Is :" + value);
    }
}
