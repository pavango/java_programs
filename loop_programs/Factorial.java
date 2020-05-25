//importing the Scanner class from util package
import java.util.Scanner;

//defining the clss Factorial
class Factorial {
    //defining  the  main function
    public static void main(String[] args) {
        //initionalizing Scanner
        Scanner sc = new Scanner(System.in);
        //giving an instruction to user to give input
        System.out.print("Enter The Factorial Number :");
        //reading an new value and storing to new variable
        int factorialnumber = sc.nextInt();
        //creating new variable and storing an value
        int factorial = 1;
        //creating an for loop with cerateing an veriable and storing an value condition and incrementing the veriable value
        for (int number = 0; number < factorialnumber; number++) {
            //storing an value of right side to lift side variable
            factorial = factorial * (number + 1);
            //closing the for loop block
        }
        //printing an  value of factorialnumber and factorial with an instartion
        System.out.println("The Factorial Value Of " + factorialnumber
        + "! Is :" + factorial);
        //closing the min block
    }
//closing the class block
}
