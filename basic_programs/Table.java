import java.util.Scanner;

class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Table Number :");
        int tablenumber = sc.nextInt();
        for(int number = 0; number < 10; number++) {
            int multiplier = number + 1;
            int total = multiplier * tablenumber;
            System.out.println(tablenumber + " * " + multiplier + " = " + total);
        }
    }
}
