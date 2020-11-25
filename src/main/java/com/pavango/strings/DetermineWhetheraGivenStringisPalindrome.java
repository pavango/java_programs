package com.pavango.strings;

class DetermineWhetheraGivenStringisPalindrome {
    public static boolean checkTheGivenStringIsPalindromOrNot(String input){
       boolean flag = true;
       input = input.toLowerCase();
       for(int i = 0; i < input.length()/2; i++) {
           if(input.charAt(i) != input.charAt(input.length()-i-1)){
               flag = false;
               break;
           }
       }
       if(flag)
            return true;
       else
        return false;
    }
}
