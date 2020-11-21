package com.pavango.strings;

import java.util.Arrays;

public class CheckStingsAreAnagramOrNot {
    public static boolean checkStingsAreFalseOrNot (String input1 , String input2) {
        String input_1 = input1.toLowerCase();
        String input_2 = input2.toLowerCase();
        if (input_1.length() != input_2.length()) {
            return false;
        }
        else {
            char[] string_1 = input_1.toCharArray();
            char[] string_2 = input_2.toCharArray();
            Arrays.sort(string_1);
            Arrays.sort(string_2);
            if(Arrays.equals(string_1, string_2) == true) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
