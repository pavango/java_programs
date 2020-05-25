//importing the Scanner class from java.utill package
import java.util.Scanner;

//creating the class marks
class Marks {
    //creating an block of mainfunction with string arguments
    public static void main(String[] args) {
        //createing the sc veriable and storing an value
        Scanner sc = new Scanner(System.in);
        //printing the instartion for user to give an number
        System.out.print("Enter The Total Number Of Subjects :");
        //reading the value and storing that value to the new veriable
        int subjects = sc.nextInt();
        //cerateing the veriable
        int sub;
        //createing the variable and storeing the value
        double obtained = 0;
        //createing an for loop by createing an veriable  and storeing an value
        // and giveing an condition and incrementing the value of the veriable
        for(sub = 0; sub < subjects; sub++){
            //storeing the value of the sum of sub and 1 to the variable
            int subjectNumber = sub + 1;
            //printing the value of subjectNumber with instraction
            System.out.print("Subject " + subjectNumber + ":");
            //reading the value and storing that value to veriable
            double marks = sc.nextDouble();
            //storing the value of the sum of obtaind value and marks value to the obtaind(veriable)
            obtained = obtained + marks;
        //closeing the for loop
        }
        //storing the value of multipleyingthe subjects value from the 100 to the totale veriable
        double total = subjects * 100;
        //storeing  the obtained value is divideing by the total vaue
        //and comeing value is multipleying by the 100 and storeing the value to percentage veriable
        double percentage = (obtained / total) * 100;
        //printing the value of percentage with instraction
        System.out.println("The Percentage Is :" + percentage);
    //closeing the main block
    }
//closeing the class block
}
