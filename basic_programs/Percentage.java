import java.util.*;

class Percentage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Student Name:");
        String name = sc.nextLine();
        System.out.print("Enter Subject 1 Marks:");
        double subject1 = sc.nextDouble();
        System.out.print("Enter Subject 2 Marks:");
        double subject2 = sc.nextDouble();
        System.out.print("Enter Subject 3 Marks:");
        double subject3 = sc.nextDouble();
        System.out.print("Enter Subject 4 Marks:");
        double subject4 = sc.nextDouble();
        System.out.print("Enter Subject 5 Marks:");
        double subject5 = sc.nextDouble();
        System.out.print("Enter Subject 6 Marks:");
        double subject6 = sc.nextDouble();
        double obtaind = subject1 + subject2 + subject3 + subject4 + subject5 + subject6;
        double Percentage = (obtaind/600)* 100;
        System.out.print("The Percentage of " + name);
        System.out.println(" is: " + Percentage);
    }
}
