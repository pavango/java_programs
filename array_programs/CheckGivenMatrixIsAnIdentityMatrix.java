import java.util.Scanner;

class CheckGivenMatrixIsAnIdentityMatrix {
    public static boolean identityMatrix(int[][] matrix, int matrixSize) {
        boolean identityMatrix = true;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j && matrix[i][j] != 1) {
                    identityMatrix = false;
                    break;
                }
                if (i != j && matrix[i][j] != 0) {
                    identityMatrix = false;
                    break;
                }
            }
        }
        return identityMatrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Matrix size :");
        int matrixSize = sc.nextInt();
        int[][] matrix = new int[matrixSize][matrixSize];
        System.out.println();
        System.out.println("Enter Matrix Elements :-");
        System.out.println();
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print("Enter Value For (" + i + "," + j
                + ") Position :");
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean x = identityMatrix(matrix, matrixSize);
        if (x) {
            System.out.println("It is a Identity Matrix");
        } else {
            System.out.println("It is Not a Identity Matrix");
        }
    }
}
