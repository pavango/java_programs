import java.util.Scanner;

class FindingDuplicatElementsOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Numbers :");
        int size = sc.nextInt();
        int[] numbersArray = new int[size];
        final int visited = -1;
        System.out.print("Enter The Original array Elements :");
        for (int i = 0; i < size; i++) {
            numbersArray[i] = sc.nextInt();
        }
        System.out.print("Duplicate elements in given array Is :");
        for (int j = 0; j < size; j++) {
            if (numbersArray[j] == visited) {
                continue;
            }
            boolean found = false;
            for (int k = j + 1; k < size; k++) {
                if (numbersArray[j] == numbersArray[k]) {
                    numbersArray[k] = visited;
                    if (!found) {
                        System.out.print(numbersArray[j] + " ");
                    }
                    found = true;
                }
            }
        }
        System.out.println();
    }
}
