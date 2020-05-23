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
                System.out.println("you Guessed it right");
            }
            if (guessingnumber < randamnumber) {
                System.out.println("too less try again");
            }
            if (guessingnumber > randamnumber) {
                System.out.println("Too high try again ");
            }
        } while (guessingnumber != randamnumber);


    }
}
