//importing the Scanner class from java.util package
import java.util.Scanner;
//defining the PrimeNumber class
class PrimeNumber {
    // defining the main function
    public static void main(String[] args) {
        //printing the instartion for user to give an number
        Scanner sc = new Scanner(System.in);
        //createing the boolean veriable and storing the value(true)
        boolean primenumber = true;
         //printing the instraction to take input from user
        System.out.print("Enter The Number :");
        //reading the value and storing that value to the new veriable
        int number = sc.nextInt();
        // cheaking the conditin that number valueis equal to 1or not
        if (number == 1) {
            // storeing the value(false) to veriable primenumber
            primenumber = false;
        //closeing the if block
        }
        //createing an for loop by createing an veriable  and storeing an value
        // and giveing an condition and incrementing the value of the veriable
        for (int i = 2; i < number; i++) {
            // storing the value of
            int value = number % i;
            if (value == 0) {
                primenumber = false;
                break;
            }
        }
        if (primenumber) {
            System.out.println("It Is a PrimeNumber");
        } else {
            System.out.println("It is not a PrimeNumber");
        }
    }
}
