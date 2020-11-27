package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RevarsGivenStringTests {
    @Test
    void shouldReverseTheGivenString () {
        RevarsGivenString revarsString = new RevarsGivenString();

        String revarsed = revarsString.revarsTheString("Dream big");

        Assertions.assertEquals("gib maerD" ,revarsed);
    }
}
