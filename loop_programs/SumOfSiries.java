import java.util.Scanner;

class SumOfSiries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        double SumOfSiries = 0;
        for (int i = 1;i <= number;i++) {
            int number1 =i;
            double value = 1.0/number1;
            SumOfSiries = SumOfSiries + value;
        }
        System.out.println(SumOfSiries);
    }
}
