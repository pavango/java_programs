package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckStingsAreAnagramOrNotTests {
    @Test
    void shouldCountVowelsInTheGivenString() {
        CheckStingsAreAnagramOrNot checkAnargamOrNot = new CheckStingsAreAnagramOrNot();

        boolean checked = checkAnargamOrNot.checkStingsAreFalseOrNot("Grab", "Brag");

        Assertions.assertEquals(true , checked);
    }
}
