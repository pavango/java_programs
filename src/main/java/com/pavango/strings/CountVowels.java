package com.pavango.strings;

public class CountVowels {
    public static int countVowelsInString(String input) {
        char[] charectoer = input.toCharArray();
        int vowels = 0;
        for (char ch : charectoer) {
            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'
            ||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') {
                vowels++;
            }
        }
        return vowels;
    }
}
