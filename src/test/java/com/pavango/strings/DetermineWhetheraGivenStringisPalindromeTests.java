package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DetermineWhetheraGivenStringisPalindromeTests {
    @Test
    void shouldDetermaineTheGivenStringPalindrome() {
        DetermineWhetheraGivenStringisPalindrome determineWhetheraGivenStringisPalindrome = new DetermineWhetheraGivenStringisPalindrome();

        boolean replaced = determineWhetheraGivenStringisPalindrome.checkTheGivenStringIsPalindromOrNot("Kayak");

        Assertions.assertEquals(true, replaced);
    }
    @Test
    void shouldDetermaineTheGivenStringisNotAPalindrome() {
        DetermineWhetheraGivenStringisPalindrome determineWhetheraGivenStringisPalindrome = new DetermineWhetheraGivenStringisPalindrome();

        boolean replaced = determineWhetheraGivenStringisPalindrome.checkTheGivenStringIsPalindromOrNot("abbc");

        Assertions.assertEquals(false, replaced);
    }
}
