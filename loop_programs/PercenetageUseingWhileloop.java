//importing the scanner class from java.util package
import java.util.Scanner;
//creating the class block with class name
class PercenetageUseingWhileloop {
    //createing the main function withstring argumnets
    public static void main(String[] args) {
        //createing the sc veriable and storing an value
        Scanner sc = new Scanner(System.in);
        //printing the instartion for user to give an number
        System.out.print("Enter The Total Number Of Subjects :");
        //reading the value and storing that value to the new veriable
        int subjects = sc.nextInt();
        //cerateing the veriableand storing the value
        int sub = 1;
        //creating an veriable and storig an value
        double obtained = 0;
        //createing an while loop with an condition(when sub value is equal to subjects)then loop will break
        while (sub <= subjects) {
            //printing the value of sub with instartion
            System.out.print("Subject " + sub + " : ");
            //reading the value and storing thatvalue to new veriable
            double marks = sc.nextDouble();
            // storing the value of the sum of obtained and marks to obtained veriable
            obtained = obtained + marks;
            //incrementing the value of sub
            sub++;
        //closing the while loop
        }
        //storeing the value of the multipleying the subjects and 100 to veriable total
        double total = subjects * 100;
        //storeing the value of the divideing teh obtained value by total value and it
        double percentage = (obtained / total) * 100;
        //printing the value of percentage with instraction
        System.out.println("The Percentage Is :" + percentage);
    }
}
