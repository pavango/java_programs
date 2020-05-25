//importing the Scanner class from util package
import java.util.Scanner;

//defining the class Factorial
class Factorial {
    //defining  the  main function
    public static void main(String[] args) {
        //initializing Scanner
        Scanner sc = new Scanner(System.in);
        //giving an instruction to user to give input
        System.out.print("Enter The Factorial Number :");
        //reading an new value and storing to new variable
        int factorialnumber = sc.nextInt();
        //creating new variable and storing an value
        int factorial = 1;
        //creating an for loop with createing an variable and storing an value condition and incrementing the veriable value
        for (int number = 0; number < factorialnumber; number++) {
            //storing an value of right side to lift side variable
            factorial = factorial * (number + 1);
            //closing the for loop block
        }
        //printing an  value of factorial number and factorial with an instruction
        System.out.println("The Factorial Value Of " + factorialnumber
        + "! Is :" + factorial);
        //closing the min block
    }
//closing the class block
}
