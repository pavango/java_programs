import java.util.Scanner;

class CheckGivenMatrixIsSparseMatrix {
    public static boolean sparseMatrix(int[][] matrix, int row, int column) {
        int zeroos = 0;
        int numbers = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    zeroos++;
                } else {
                    numbers++;
                }
            }
        }
        return numbers < zeroos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Value :");
        int row = sc.nextInt();
        System.out.print("Enter column Value :");
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
        if (sparseMatrix(matrix, row, column)) {
            System.out.println("Given Matrix Is A Sparse Matrix");
        } else {
            System.out.println("Given Matrix Is Not A Sparse Matrix");
        }
    }
}
