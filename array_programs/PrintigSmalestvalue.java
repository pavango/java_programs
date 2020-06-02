import java.util.Scanner;

class PrintigSmalestvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array :");
        int size = sc.nextInt();
        int[] numberArray = new int[size];
        System.out.print("Enter The Elements :");
        for (int i = 0; i < size; i++) {
            numberArray[i] = sc.nextInt();
        }
        int smalestNumber = Integer.MAX_VALUE;
        for (int j = 0; j <  size; j++) {
            if (numberArray[j] < smalestNumber) {
                smalestNumber = numberArray[j];
            }
        }
        System.out.println("The Smallest Number Of Given Numbers Is :"
        + smalestNumber);
    }
}
