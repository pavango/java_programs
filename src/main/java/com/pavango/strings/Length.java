package com.pavango.strings;

public class Length {
    public static int lengthOf(String a) {
        char[] string = a.toCharArray();
        int numberOfCharactors = 0;
        for (char ch : string) {
            numberOfCharactors++;
        }
        return numberOfCharactors;
    }
}
