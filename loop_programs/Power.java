//importing the Scanner class fromjava.utill package
import java.util.Scanner;
//defining class power
class Power {
    //defining main function with string arguments
    public static void main(String[] args) {
        //createing the sc veriable and storing an value
       Scanner sc = new Scanner(System.in);
       //printing the instartion for user to give an number
       System.out.println("Enter The Value Of Base:");
       //reading the value and storing that value to the new veriable
       int base = sc.nextInt();
       //printing the instartion for user to give an number
       System.out.println("Enter The Power Number :");
       //reading the value and storing that value to the new veriable
       int power = sc.nextInt();
       //cerateing the veriable and storing the value
       int value = 1;
       //createing an for loop by createing an veriable  and storeing an value
       // and giveing an condition and incrementing the value of the veriable
       for (int i = 1; i <= power; i++ ) {
           // multipleying the value of value and value of base and storeing
           //that comming value to value veriable
           value = value * base;
       //closing the for loop
        }
        // printing the value of base and value of value with instraction
        System.out.println("The Power Of" + base + " Is :" + value);
    //closeing the main block
    }
//closeing the class block
}
