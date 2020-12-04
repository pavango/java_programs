package com .pavango.strings;

public class RevarsGivenString {
    public static String revarsTheString (String input) {
        String reversedStr = "";
        for(int i = input.length()-1; i >= 0; i--){
            reversedStr = reversedStr + input.charAt(i);
        }
        return reversedStr;
    }
}
