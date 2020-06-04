import java.util.Scanner;

class ProgramToCalculateTheSubtractionOf2Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Row Number :");
        int row = sc.nextInt();
        System.out.print("Enter The Column Number :");
        int column = sc.nextInt();
        int[][] matrixA = new int[row][column];
        int[][] matrixB = new int[row][column];
        int[][] sum = new int[row][column];
        System.out.println();
        System.out.println("Enter 1st Matrix Values :-");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter Value For (" + i + "," + j
                + ") Position :");
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter 2nd Matrix Values :-");
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter Value For (" + i + "," + j
                + ") Position :");
                matrixB[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        System.out.println("The Subtraction Of 1st And 2nd Matrix Is :-");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
