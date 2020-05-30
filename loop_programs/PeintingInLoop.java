import java.util.Scanner;

class PeintingInLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int number = sc.nextInt();
        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                System.out.print("*");
            }
            System.out.print( " \n");
        }
    }
}
