import java.util.Scanner;

class DiralriumNumber {
    public static int lengthOf(int number) {
        int number1 = number;
        int size = 0;
        do {
            number1 = number1 / 10;
            size++;
        } while (number1 != 0);
        return size;
    }
    public static int powerOf(int number, int power) {
        int powerValue = 1;
        for (int i = 1; i <= power; i++) {
            powerValue = powerValue * number;
        }
        return powerValue;
    }
    public static int getPowerOfDigits(int number) {
        int cubeofdigits = 0;
        int size = lengthOf(number);
        do {
            int remainder = number % 10;
            cubeofdigits = cubeofdigits + powerOf(remainder, size);
            number = number / 10;
            size--;
        } while (size > 0);
        return cubeofdigits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int number = sc.nextInt();
        int cubeofdigits = getPowerOfDigits(number);
        if (cubeofdigits == number) {
            System.out.println("It Is A Disarium Number");
        } else {
            System.out.println("It is Not A Disarium Number");
        }
    }
}
