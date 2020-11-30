import java.util.Scanner;

class FindtheDuplicateCharactersinGivenString {
    public static void main(String[] args) {
        System.out.print("Enter The String :");
        Scanner sv = new Scanner(System.in);
        String input = sv.nextLine();
        int count;
        char string[] = input.toCharArray();
        System.out.print("Duplicate Characters In a Given String :");
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';
                }
            }
            if(count > 1 && string[i] != '0') {
                System.out.print(string[i] + " ");
            }
        }
        System.out.println();
    }
}
