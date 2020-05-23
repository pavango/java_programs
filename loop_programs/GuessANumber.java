import java.util.Scanner;

class GuessANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int randamnumber = 77;
        int guessingnumber = 0;
        do {
            System.out.println("Guess The Number :");
            guessingnumber = sc.nextInt();
            if (randamnumber == guessingnumber) {
                System.out.println("Your Guesse Is Right");
            }
            if (guessingnumber < randamnumber) {
                System.out.println("Too Less Try Again");
            }
            if (guessingnumber > randamnumber) {
                System.out.println("Too High Try Again ");
            }
        } while (guessingnumber != randamnumber);


    }
}
