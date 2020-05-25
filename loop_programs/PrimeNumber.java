//importing the Scanner class from java.util package
import java.util.Scanner;
//defining the PrimeNumber class
class PrimeNumber {
    // defining the main function
    public static void main(String[] args) {
        //printing the instartion for user to give an number
        Scanner sc = new Scanner(System.in);
        //creating the boolean variable and storing the value(true)
        boolean primenumber = true;
         //printing the instruction to take input from user
        System.out.print("Enter The Number :");
        //reading the value and storing that value to the new variable
        int number = sc.nextInt();
        // cheeking the condition that number value is equal to 1or not
        if (number == 1) {
            // storeing the value(false) to variable prime number
            primenumber = false;
        //closeing the if block
        }
        //creating an for loop by creating an variable  and storing an value
        // and giving an condition and increment the value of the variable
        for (int i = 2; i < number; i++) {
            // storing the remainder of number divide by i
            int value = number % i;
            //cheeking an condition value of value is equal to 0
            if (value == 0) {
                // storeing the value(false) to variable prime number
                primenumber = false;
                //breaking the loop
                break;
            //closing the if condition
            }
        //closing the for loop
        }
        //cheeking the condition
        if (primenumber) {
            //printing an instruction
            System.out.println("It Is a PrimeNumber");
        //if condition is false  print this line
        } else {
            //printing an instruction
            System.out.println("It is not a PrimeNumber");
        //closing the else condition
        }
    //closing the main condition
    }
//closing class
}
