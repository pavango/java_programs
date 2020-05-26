import java.util.Scanner;

class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int i = 0;
        do {
            System.out.print("Enter The Number :");
            int number = sc.nextInt();
            int x = number % 2;
            if (x == 0) {
                sumOfEvenNumbers = sumOfEvenNumbers + number;
            } else {
                sumOfOddNumbers = sumOfOddNumbers + number;
            }
            System.out.print("Give Any number To Continue Or Give 0 To Exit :");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("The Sum Of Even Numbers Are :" + sumOfEvenNumbers);
        System.out.println("The Sum Of Odd Numbers Are :"  + sumOfOddNumbers);
    }
}
