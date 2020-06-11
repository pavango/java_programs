import java.util.Scanner;

class GueasingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int midPoint = 0;
        int minimumValue = 0;
        int maximumvalue = Integer.MAX_VALUE;
        int chanceNumber = 1;
        do {
            midPoint = (minimumValue + maximumvalue) / 2;
            System.out.println("Is This Your Number :" + midPoint);
            System.out.println("Give 1 if Number is Too High");
            System.out.println("Give 2 if Number is Too Low");
            System.out.println("Give 3 If Number Is Correct");
            number = sc.nextInt();
            if(number == 1) {
                maximumvalue = midPoint;
            }
            if (number == 2) {
                minimumValue = midPoint;
            }
            chanceNumber++;
        } while (number != 3);
        System.out.println("This Is Your Number :" + midPoint);
        System.out.println("You Taken " + chanceNumber
        + " Chance To Guess The Number");
    }
}
