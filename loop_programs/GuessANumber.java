import java.util.Scanner;
import java.util.Random;

class GuessANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        final int randamnumber = rand.nextInt(9999999);
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
