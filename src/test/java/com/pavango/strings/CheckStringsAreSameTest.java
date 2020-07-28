package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckGivenStringIsAnagramTests {
    @Test
    void shouldCheckGivenStringIsSame() {
        CheckStringsAreSame checkStringsAreSame = new CheckStringsAreSame();

        boolean cheaked = checkStringsAreSame.checkStringIsAnagram("hi","ih");

        Assertions.assertEquals(true , cheaked);
    }
}
