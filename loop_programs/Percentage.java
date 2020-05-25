//importing the Scanner class from java.utill package
import java.util.Scanner;

//defining class marks
class Marks {
    //defining the main function
    public static void main(String[] args) {
        //initializing the Scanner
        Scanner sc = new Scanner(System.in);
        //printing the instruction for user to give an number
        System.out.print("Enter The Total Number Of Subjects :");
        //reading the value and storing that value to the new variable
        int subjects = sc.nextInt();
        //cratering the variable
        int sub;
        //creating the variable and storing the value
        double obtained = 0;
        //creating an for loop by creating an variable  and storing an value
        // and giving an condition and increment the value of the variable
        for(sub = 0; sub < subjects; sub++){
            //storing the value of the sum of sub and 1 to the variable
            int subjectNumber = sub + 1;
            //printing the value of subjectNumber with instruction
            System.out.print("Subject " + subjectNumber + ":");
            //reading the value and storing that value to variable
            double marks = sc.nextDouble();
            //storing the value of the sum of obtained value and marks value to the obtained (variable)
            obtained = obtained + marks;
        //closing the for loop
        }
        //storing the value of multiplying the subjects value from the 100 to the total variable
        double total = subjects * 100;
        //storing  the obtained value is dividing by the total value
        //and coming value is multiplying by the 100 and storing the value to percentage variable
        double percentage = (obtained / total) * 100;
        //printing the value of percentage with instruction
        System.out.println("The Percentage Is :" + percentage);
    //closing the main block
    }
//closing the class block
}
