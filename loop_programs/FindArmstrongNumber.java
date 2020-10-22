import java.lang.Math;
import java.util.Scanner;

class FindArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number, Till How Much I Have to print Armstrong numbers:");
        int end_Number = sc.nextInt();
        for (int i = 0;i <= end_Number; i++ ) {
            int number = i;
            int sumOfCubeNumber = 0;
            do {
                int lastNumber = number % 10;
                int cubeNumber = lastNumber * lastNumber * lastNumber;
                sumOfCubeNumber = sumOfCubeNumber + cubeNumber;
                number = number / 10;
            } while (number != 0);
            if (sumOfCubeNumber == i) {
                System.out.println(i);
            }
        }
    }
}
