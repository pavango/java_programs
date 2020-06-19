package com.pavango.strings;

public class CountPunctuations {
    public static int countPunctions(String input) {
        char[] charectoer = input.toCharArray();
        int punctions = 0;
        for (char ch : charectoer) {
            if (ch == '!'||ch == ','||ch == ';'||ch == '"'||ch == '.'
            ||ch == '-'||ch == '?'||ch == '*'||ch == ':'||ch == '_') {
                punctions++;
            }
        }
        return punctions;
    }
}
