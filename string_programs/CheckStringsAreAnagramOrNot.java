import java.util.*;

class CheckStringsAreAnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String :");
        String input_1 = sc.nextLine();
        System.out.print("Enter Second String :");
        String input_2 = sc.nextLine();
        input_1 = input_1.toLowerCase();
        input_2 = input_2.toLowerCase();
        if (input_1.length() != input_2.length()) {
            System.out.println("Given Strings Are Not an Anagram.");
        }
        else {
            char[] string_1 = input_1.toCharArray();
            char[] string_2 = input_2.toCharArray();
            Arrays.sort(string_1);
            Arrays.sort(string_2);
            if(Arrays.equals(string_1, string_2) == true) {
                System.out.println("Given Strings Are Anagram.");
            }
            else {
                System.out.println("Given Strings Are Not an Anagram.");
            }
        }
    }
}
