package com.pavango.strings;

class DetermineWhetherOneStringisRotationofAnother {
    public static boolean checkGivenOneStringIsRotationOfAnother(String input_1, String input_2) {
        if(input_1.length() != input_2.length()) {
            return false;
        }
        else {
            input_1 = input_1.concat(input_1);
            if(input_1.indexOf(input_2) != -1) {
                return true;
            }
            else {
                return false;
            }

        }
    }
}
