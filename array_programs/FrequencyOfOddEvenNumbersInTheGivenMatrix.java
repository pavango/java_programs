import java.util.Scanner;

class FrequencyOfOddEvenNumbersInTheGivenMatrix {
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
            for (int j = 0; j < column; j++) {
                if ((matrix[i][j] % 2) == 0) {
                    evenNumber++;
                } else {
                    oddNumber++;
                }
            }
        }
        System.out.println("Frequency Of Odd Numbers In Given Matrix Is :"
        + oddNumber);
        System.out.println("Frequency Of Even Numbers In Given Matrix Is :"
        + evenNumber);
    }
}
