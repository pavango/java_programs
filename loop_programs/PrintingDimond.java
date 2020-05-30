import java.util.Scanner;

class PrintingDimond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int number = sc.nextInt();
        for (int row = 0;row < number; row++) {
            int space = (number - row) - 1;
            for (int column = 0;column < space; column++) {
                System.out.print(" ");
            }
            int diamond = row + (row + 1);
            for(int column = 0;column < diamond;column++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int row = number - 1; row > 0; row--) {
            int space = number - row;
            for(int column = 0;column < space;column++){
                System.out.print(" ");
            }
            int diamond = row +(row - 1);
            for (int column = 0;column < diamond; column++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
