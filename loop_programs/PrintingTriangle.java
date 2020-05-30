import java.util.Scanner;

class PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter The Number :");
        int number = sc.nextInt();
        for (int row = 0;row < number; row++) {
            for (int column = 0;column < row; column++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
