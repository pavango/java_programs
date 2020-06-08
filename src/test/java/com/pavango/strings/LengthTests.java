package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthTests {
    @Test
    void shouldFindlengthOfString() {
        Length findLength = new Length();

        int readLength = findLength.lengthOf("abcd");

        Assertions.assertEquals(4, readLength);
    }
    @Test
    void shouldFindlengthOfOneCharecter() {
        Length findLength = new Length();

        int readLength = findLength.lengthOf("a");

        Assertions.assertEquals(1, readLength);
    }
    @Test
    void shouldFindlengthOfEmteyString() {
        Length findLength = new Length();

        int readLength = findLength.lengthOf("");

        Assertions.assertEquals(0, readLength);
    }
    @Test
    void shouldFindLengthOfStringWhichContainsSpaces() {
        Length findLength = new Length();

        int readLength = findLength.lengthOf("a b c d");

        Assertions.assertEquals(7, readLength);
    }
    @Test
    void shouldFindLengthOfStringWhichContainsSpicalCarectors() {
        Length findLength = new Length();

        int readLength = findLength.lengthOf("  !@#$' '");

        Assertions.assertEquals(9, readLength);
    }
}
