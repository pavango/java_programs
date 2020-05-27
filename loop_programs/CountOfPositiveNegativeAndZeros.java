import java.util.Scanner;

class CountOfPositiveNegativeAndZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveNumbers = 0;
        int negetiveNumbers = 0;
        int zeros = 0;
        int i = 0;
        do {
            System.out.print("Enter The Number :");
            int number = sc.nextInt();
            if (number > 0) {
                positiveNumbers++;
            } else if (number < 0) {
                negetiveNumbers++;
            } else {
                zeros++;
            }
            System.out.print("Give Any number To Continue Or Give 0 To Exit :");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("In Given Numbers Positive Numbers Are "
        + positiveNumbers);
        System.out.println("In Given Numbers Negative Numbers Are "
        + negetiveNumbers);
        System.out.println("In Given Numbers Zeros Are " + zeros);
    }
}
