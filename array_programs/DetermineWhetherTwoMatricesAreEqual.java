import java.util.Scanner;

class DetermineWhetherTwoMatricesAreEqual {
    public static boolean matricesAreEqual(int[][] matrixA, int[][] matrixB,
    int row, int column) {
        boolean matricesAreEqual = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrixA[i][j] != matrixB[i][j]) {
                    matricesAreEqual = false;
                    break;
                }
            }
        }
        return matricesAreEqual;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Row Value :");
        int row = sc.nextInt();
        System.out.print("Enter The Column Value :");
        int column = sc.nextInt();
        int[][] matrixA = new int[row][column];
        int[][] matrixB = new int[row][column];
        System.out.println();
        System.out.println("Enter 1st Matrix Elements :-");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter Value For (" + i + "," + j
                + ") Position :");
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter 2nd Matrix Elements :-");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter Value For (" + i + "," + j
                + ") Position :");
                matrixB[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        if (matricesAreEqual(matrixA, matrixB, row, column)) {
            System.out.println("Given Matrices are equal");
        } else {
            System.out.println("Matrices Are Not Equal");
        }
    }
}
