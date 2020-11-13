package com.pavango.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReversNumberTests {
    @Test
    void shouldPrintTheGivenNumberInRevers() {
        ReversNumber reversNumber = new ReversNumber();

        int revers = reversNumber.reversNumber(4321);

        Assertions.assertEquals(1234, revers);
    }
}
