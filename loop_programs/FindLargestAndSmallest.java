import java.util.Scanner;

class FindLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        int i = 0;
        do {
            System.out.print("Enter The Number :");
            int number = sc.nextInt();
            if (number > largestNumber) {
                largestNumber =  number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            System.out.print("Give Any number To Continue Or Give 0 To Exit :");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("The  Largest Number is :" + largestNumber);
        System.out.println("The  Smallest Number is :" + smallestNumber);
    }
}
