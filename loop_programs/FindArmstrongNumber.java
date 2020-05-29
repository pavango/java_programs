import java.lang.Math;

class FindArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("The Armstrong numbers Between 0 To 500 are :");
        for (int i = 0;i <= 500; i++ ) {
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
