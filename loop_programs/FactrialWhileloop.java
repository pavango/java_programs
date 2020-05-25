//importing the Scanner class from util packages
import java.util.Scanner;

// defaining the class FactrialWhileloop
class FactrialWhileloop {
    //defining the  main fumnction
    public static void main(String[] args) {
        //initionalizing the Scanner veriable
        Scanner sc = new Scanner(System.in);
        //printing an instartion to give an number
        System.out.print("Enter The Factorial Number :");
        // readin an new value
        int factorialnumber = sc.nextInt();
        //creating an new veriable and giveing an value
        int factorial = 1;
        // cerating an new vereiable and giveing an value
        int number = 1;
        // creating an for while loop with ceratingan veriable and storing an value condition and
        while (number <= factorialnumber) {
            // incrementing the veriable value
            number++;
            //closing the loop
        }
        //printing the value of factorialnumber and factorial with instraction
        System.out.println("The Factorial Of " + factorialnumber + "! Is "
        + factorial);
    //closing the main block
    }
//closing the class block
}
