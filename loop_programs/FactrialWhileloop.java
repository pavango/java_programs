//importing the Scanner class from util packages,
import java.util.Scanner;

// defining the class FactrialWhileloop,
class FactrialWhileloop {
    //defining the  main fumnction,
    public static void main(String[] args) {
        //initializing the Scanner variable,
        Scanner sc = new Scanner(System.in);
        //printing an instartion to give an number,
        System.out.print("Enter The Factorial Number :");
        // reading an new value,
        int factorialnumber = sc.nextInt();
        //creating an new veariable and giving an value,
        int factorial = 1;
        // crating an new vareiable and giving an value,
        int number = 1;
        // creating an for while loop with creating an variable and storing an value condition and,
        while (number <= factorialnumber) {
            // incrementing the variable value,
            number++;
            //closing the loop,
        }
        //printing the value of factorial number and factorial with instruction,
        System.out.println("The Factorial Of " + factorialnumber + "! Is "
        + factorial);
    //closing the main block,
    }
//closing the class block.
}
