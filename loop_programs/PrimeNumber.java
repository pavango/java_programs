import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primenumber = true;
        System.out.print("Enter The Number :");
        int number = sc.nextInt();
        for (int i = 2; i < number; i++) {
            int value = number % i;
            if (value == 0) {
                primenumber = false;
                break;
            }
        }
        if (primenumber) {
            System.out.println("It Is a PrimeNumber");
        } else {
            System.out.println("It is not a PrimeNumber");
        }
    }
}
