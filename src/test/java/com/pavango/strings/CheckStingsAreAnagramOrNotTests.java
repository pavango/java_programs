package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckStingsAreAnagramOrNotTests {
    @Test
    void shouldCheckTheGivenStingIsAnagramOrNot() {
        CheckStingsAreAnagramOrNot checkAnargamOrNot = new CheckStingsAreAnagramOrNot();

        boolean checked = checkAnargamOrNot.checkStingsAreFalseOrNot("Grab", "Brag");

        Assertions.assertEquals(true , checked);
    }
}
