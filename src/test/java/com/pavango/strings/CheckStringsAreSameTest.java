package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckStringsAreSameTest {
    @Test
    void shouldCheckGivenStringIsSame() {
        CheckStringsAreSame checkStringsAreSame = new CheckStringsAreSame();

        boolean cheaked = checkStringsAreSame.checkStringsIsSame("hi","hi");

        Assertions.assertEquals(true , cheaked);
    }
    @Test
    void shouldCheckGivenStringIsSameOrNot() {
        CheckStringsAreSame checkStringsAreSame = new CheckStringsAreSame();

        boolean cheaked = checkStringsAreSame.checkStringsIsSame("hi","hi pavan");

        Assertions.assertEquals(false , cheaked);
    }
}
