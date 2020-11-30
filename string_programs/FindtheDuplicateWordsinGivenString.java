import java.util.Scanner;

class FindtheDuplicateWordsinGivenString {
    public static void main(String[] args) {
        System.out.print("Enter The Words :");
        Scanner sv = new Scanner(System.in);
        String input = sv.nextLine();
        String string = input.toLowerCase();
        String words[] = string.split(" ");
        System.out.print("Duplicate Words In a Given String : ");
        for(int i = 0; i < words.length; i++) {
            int count = 1;
            for(int j = i + 1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if(count > 1 && words[i] != "0")
                System.out.print(words[i] +" ");
        }
        System.out.println();
    }
}
