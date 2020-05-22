import java.util.Scanner;

class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Total Number Of Subjects :");
        int subjects = sc.nextInt();
        int sub;
        double obtained = 0;
        for(sub = 0; sub < subjects; sub++){
            int subjectNumber = sub + 1;
            System.out.print("Subject " + subjectNumber + ":");
            double marks = sc.nextDouble();
            obtained = obtained + marks;
        }
        double total = subjects * 100;
        double percentage = (obtained / total) * 100;
        System.out.println("The Percentage Is :" + percentage);
    }
}
