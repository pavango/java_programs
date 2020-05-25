// importing the Scanner class form java.utill package
import java.util.Scanner;
//defining the PowerUsingWhileLoop class
class PowerUsingWhileLoop {
    //defining the main function
    public static void main(String[] args) {
        //initializing the Scanner
       Scanner sc = new Scanner(System.in);
       //printing the instruction to take input from user
       System.out.print("Enter The Value Of Base:");
       //reading the value and storing that value to the new variable
       int base = sc.nextInt();
       //printing the instraction to take input from user
       System.out.print("Enter The Power Number :");
       //reading the value and storing that value to the new variable
       int power = sc.nextInt();
       //creating the variable and storing the value
       int value = 1;
       //creating the variable and storing the value
       int i = 1;
       //creating the while loop by giving an condition that
       // when i value is equal to the power value brake the loop
       while (i <= power) {
          //multiplying the value and base storing that coming value to the value variable
           value = value * base;
           // increment the value of i
           i++;
       //closing the while loop
        }
        //printing the value of base and value of value with instruction
        System.out.println("The Power Of" + base + " Is :" + value);
    //closing the main
    }
//closing the class
}
