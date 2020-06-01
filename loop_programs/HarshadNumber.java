import  java.util.Scanner;

class HarshadNumber {
    public static int sumOfDigits(int number){
        int modulusValue = 0;
        while (number != 0) {
            int value = number % 10;
            modulusValue = modulusValue + value;
            number = number / 10;
        }
        return modulusValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int number = sc.nextInt();
        int remainder = number % sumOfDigits(number);
        if (remainder == 0) {
            System.out.println(number + " Is A Harshad Number");
        }else {
            System.out.println(number + " Is Not A Harshad Number");
        }
    }
}
