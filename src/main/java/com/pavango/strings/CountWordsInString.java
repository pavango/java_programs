package com.pavango.strings;

public class CountWordsInString {
    public static int countWordsOfString(String input) {
        int count = 0;
       char ch[] = new char[input.length()];
       for(int i = 0;i < input.length();i++) {
            ch[i] = input.charAt(i);
           if( ((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
               count++;
            }
        }
       return count;
    }
}
