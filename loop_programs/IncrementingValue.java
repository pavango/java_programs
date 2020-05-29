import java.util.Scanner;

class IncrementingValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int i = 0;
    do {
            System.out.print("Enter The Number :");
            int number = sc.nextInt();
            if (number > 0){
                x++;
            }
            System.out.print("Give Any number To Continue Or Give 0 To Exit :");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("you given inputs " + x + " times");
    }
}
