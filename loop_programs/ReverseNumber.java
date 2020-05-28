import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Numbers :");
        int numbers = sc.nextInt();
        int reverseNumbers = 0;
        while (numbers != 0) {
            reverseNumbers = reverseNumbers * 10;
            reverseNumbers = reverseNumbers + (numbers % 10);
            numbers = numbers / 10;
        }
        System.out.println("The Reverse Number Is :" + reverseNumbers);
    }
}
