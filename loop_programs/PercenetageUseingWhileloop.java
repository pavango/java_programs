//importing the scanner class from java.util package
import java.util.Scanner;
//deafening class PercenetageUseingWhileloop
class PercenetageUseingWhileloop {
    //deafening main function
    public static void main(String[] args) {
        //initializing the Scanner
        Scanner sc = new Scanner(System.in);
        //printing the instruction for user to give an number
        System.out.print("Enter The Total Number Of Subjects :");
        //reading the value and storing that value to the new variable
        int subjects = sc.nextInt();
        //cratering the variable and storing the value
        int sub = 1;
        //creating an variable and storing an value
        double obtained = 0;
        //creating an while loop with an condition(when sub value is equal to subjects)then loop will break
        while (sub <= subjects) {
            //printing the value of sub with instruction
            System.out.print("Subject " + sub + " : ");
            //reading the value and storing that value to new variable
            double marks = sc.nextDouble();
            // storing the value of the sum of obtained and marks to obtained variable
            obtained = obtained + marks;
            //increment the value of sub
            sub++;
        //closing the while loop
        }
        //storing the value of the multiplying the subjects and 100 to variable total
        double total = subjects * 100;
        //storing the value of dividing the obtained value by total value and it
        double percentage = (obtained / total) * 100;
        //printing the value of percentage with instruction
        System.out.println("The Percentage Is :" + percentage);
    }
}
