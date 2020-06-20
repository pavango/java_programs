package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountVowelsTests {
    @Test
    void shouldCountVowelsInTheGivenString() {
        CountVowels countVowels = new CountVowels();

        int counted = countVowels.countVowelsInString("a e i o u g o l");

        Assertions.assertEquals(6 , counted);
    }
    @Test
    void shouldNegletAllTheSpaceInTheString() {
        CountVowels countVowels = new CountVowels();

        int counted = countVowels.countVowelsInString("     a    e  i");

        Assertions.assertEquals(3 , counted);
    }
    @Test
    void shouldCountCapitalVowelsInTheString() {
        CountVowels countVowels = new CountVowels();

        int counted = countVowels.countVowelsInString("     A    E  O I O U");

        Assertions.assertEquals(6 , counted);
    }
}
