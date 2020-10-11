import java.util.Scanner;

class Distrubute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Maney Persons Are Their :");
        int persons = sc.nextInt();
        for (int mangoes = 1; mangoes <= persons; mangoes++) {
            System.out.println("Mango " + mangoes + " For " + mangoes +" person.\n");
        }
    }
}
