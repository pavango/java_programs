package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountPunctionsTests {
    @Test
    void shouldCountPunctionsInTheGivenString() {
        CountPunctuations countPunctions = new CountPunctuations();

        int counted = countPunctions.countPunctions("Good Morning! Mr. James Potter-Had your*breakfast?");

        Assertions.assertEquals(5 , counted);
    }
    @Test
    void shouldNegletAllTheSpaceInTheString() {
        CountPunctuations countPunctions = new CountPunctuations();

        int counted = countPunctions.countPunctions(" .    ;  :  !  -   _ * ?");

        Assertions.assertEquals(8 , counted);
    }
}
