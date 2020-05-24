import java.util.Scanner;

class TableUseingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Table Number :");
        int tablenumber = sc.nextInt();
        int number = 1;
        while(number <= 10) {
            int total = number * tablenumber;
            System.out.println(tablenumber + " * " + number + " = " + total);
            number++;
        }
    }
}
