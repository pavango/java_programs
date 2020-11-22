package com.pavango.strings;

public class ReplaceTheGivenStringToOppositCase {
    public static String convertTheStringIntoOppositCase(String input) {
        String str1 = input;
        StringBuffer newStr = new StringBuffer(str1);
        for(int i = 0; i < str1.length(); i++) {
            if(Character.isLowerCase(str1.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            }
            else if(Character.isUpperCase(str1.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        StringBuffer sb = new StringBuffer(newStr);
      String convertedString = sb.toString();
        return convertedString;
    }
}
