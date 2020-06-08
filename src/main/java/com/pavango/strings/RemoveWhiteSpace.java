package com.pavango.strings;

public class RemoveWhiteSpace {
    public static String removeSpace(String input){
        char[] charector = input.toCharArray();
        String output = "";
        for (char ch : charector) {
            if (ch  != ' ') {
                output += ch;
            }
        }
        return output;
    }
}
