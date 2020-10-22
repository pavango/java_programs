import java.util.Scanner;

class IncrementingValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int exit = 0;
    do {
            System.out.print("Enter The Number :");
            int number = sc.nextInt();
            if (number > 0) {
                input++;
            }
            System.out.print("Give Any number To Continue Or Give 0 To Exit :");
            exit = sc.nextInt();
        } while (exit != 0);
        System.out.println("you given inputs " + input + " times");
    }
}
