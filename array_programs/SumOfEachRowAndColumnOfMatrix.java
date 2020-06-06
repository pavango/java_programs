import java.util.Scanner;

class SumOfEachRowAndColumnOfMatrix {
    public static int[][] readMatrix(int row, int column) {
        Scanner sc = new Scanner(System.in);
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
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Row Value :");
        int row = sc.nextInt();
        System.out.print("Enter The Column Value :");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        int oddNumber = 0;
        int evenNumber = 0;
        matrix = readMatrix(row, column);
        for (int i = 0; i < row; i++) {
            int sumOfRow = 0;
            int sumOfColumn = 0;
            for (int j = 0; j < column; j++) {
                sumOfRow = sumOfRow + matrix[i][j];
                sumOfColumn = sumOfColumn + matrix[j][i];
            }
            System.out.println("Sum of Row " + i + " :" + sumOfRow);
            System.out.println("Sum of column " + i + " :" + sumOfColumn);
        }
    }
}
