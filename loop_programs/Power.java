//importing the Scanner class from java.util package
import java.util.Scanner;
//defining class power
class Power {
    //defining main function with string arguments
    public static void main(String[] args) {
        //initializing the scanner
       Scanner sc = new Scanner(System.in);
       //printing the instartion for user to give an number
       System.out.println("Enter The Value Of Base:");
       //reading the value and storing that value to the new variable
       int base = sc.nextInt();
       //printing the instruction for user to give an number
       System.out.println("Enter The Power Number :");
       //reading the value and storing that value to the new variable
       int power = sc.nextInt();
       //cratering the variable and storing the value
       int value = 1;
       //creating an for loop by creating an variable  and storing an value
       // and giving an condition and increment the value of the variable
       for (int i = 1; i <= power; i++ ) {
           // multiplying the value of value and value of base and storing
           //that coming value to value variable
           value = value * base;
       //closing the for loop
        }
        // printing the value of base and value of value with instruction
        System.out.println("The Power Of" + base + " Is :" + value);
    //closing the main block
    }
//closing the class block
}
