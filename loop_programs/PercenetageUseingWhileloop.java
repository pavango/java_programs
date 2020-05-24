import java.util.Scanner;

class PercenetageUseingWhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Total Number Of Subjects :");
        int subjects = sc.nextInt();
        int sub = 1;
        double obtained = 0;
        while (sub <= subjects) {
            System.out.print("Subject " + sub + " : ");
            double marks = sc.nextDouble();
            obtained = obtained + marks;
            sub++;
        }
        double total = subjects * 100;
        double percentage = (obtained / total) * 100;
        System.out.println("The Percentage Is :" + percentage);
    }
}
