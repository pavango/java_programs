import java.util.Scanner;

class PrintingPeramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter The Number :");
        int number = sc.nextInt();
        for (int row = 0;row < number; row++) {
            int space = number - row-1;
            for (int column = 0;column < space; column++) {
                System.out.print(" ");
            }
            int pyramid = row + (row + 1);
            for(int column = 0;column < pyramid;column++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
