import java.util.Scanner;

class DisplayUpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Row Value :");
        int row = sc.nextInt();
        System.out.print("Enter The Column Value :");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println();
        System.out.println("Enter Matrix Elements :-");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter Value For (" + i + "," + j
                + ") Position :");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Upper Triangular Matrix Is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j < i) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
