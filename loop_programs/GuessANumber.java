//importing Scanner class from java util package,
import java.util.Scanner;
//importing Random clss from java util package,
import java.util.Random;
// defining the class,
class GuessANumber {
    // creating an block of main function with string arguments,
    public static void main(String[] args) {
        // initializing the Scanner,
        Scanner sc = new Scanner(System.in);
        // creating an variable rand and storing an value,
        Random rand = new Random();
        //creating an final variable and reading an value,
        final int randamnumber = rand.nextInt(1000000);
        // creating an variable an storing an value,
        int guessingnumber = 0;
        // creating an variable an storing an value,
        int chanceNumber = 1;
        //creating an do while loop,
        do {
            // printing an insstaction,
            System.out.print("Guess The Number :");
            // reading the value of user input,
            guessingnumber = sc.nextInt();
            //createing if block and cheaking the condition,
            if (randamnumber == guessingnumber) {
                // printing an instartion,
                System.out.println("Your Guesse Is Right");
                //closing the if block,
            }
            // createing if block and cheaking an conditin,
            if (guessingnumber < randamnumber) {
                // printing an instartion,
                System.out.println("Too Less Try Again");
                //closing an if block,
            }
            //creating if block and creaking an condition,
            if (guessingnumber > randamnumber) {
                //printing an instartion,
                System.out.println("Too High Try Again ");
                //closing an if block,
            }
            // incrmenting the chanceNumber,
            chanceNumber++;
            //increment the loop by cheeking the condition,
        } while (guessingnumber != randamnumber);
        //giveing instartion of chance what user is takern yto complet the game,
        System.out.println("You Taken " + chanceNumber
        + " Chance To Guess The Number");
        //closing an main,
    }
    //closing an class.
}
