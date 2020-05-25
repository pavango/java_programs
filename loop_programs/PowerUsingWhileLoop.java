// importing the Scanner class form java.utill package
import java.util.Scanner;
//defaining the PowerUsingWhileLoop class
class PowerUsingWhileLoop {
    //defining the main function
    public static void main(String[] args) {
        //printing the instartion for user to give an number
       Scanner sc = new Scanner(System.in);
       //printing the instraction to take input from user
       System.out.print("Enter The Value Of Base:");
       //reading the value and storing that value to the new veriable
       int base = sc.nextInt();
       //printing the instraction to take input from user
       System.out.print("Enter The Power Number :");
       //reading the value and storing that value to the new veriable
       int power = sc.nextInt();
       //createing the variable and storeing the value
       int value = 1;
       //createing the veriable and storeing the value
       int i = 1;
       //createing the while loop by giveing an condition that
       // when i value is equal to the power value beake the loop
       while (i <= power) {
          //multipleying the value and base storeing that commingvalue to the value veriable
           value = value * base;
           // incrementing the value of i
           i++;
       //closeing the while loop
        }
        //printing the value of base and value of value with instraction
        System.out.println("The Power Of" + base + " Is :" + value);
    //closeing the main
    }
//closeing the class
}
