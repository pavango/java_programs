package com.pavango.strings;

public class Length {
    public static int lengthOf(String input) {
        char[] string = input.toCharArray();
        int numberOfCharactors = 0;
        for (char ch : string) {
            numberOfCharactors++;
        }
        return numberOfCharactors;
    }
}
