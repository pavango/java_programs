package com.pavango.strings;

public class ReplaceWhiteSpace {
    public static String replaceSpace(String input1, char input2){
        char[] charector = input1.toCharArray();
        String output = "";
        for (char ch : charector) {
            if (ch  == ' ') {
                ch = input2;
            }
            output += ch;
        }
        return output;
    }
}
