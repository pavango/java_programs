package com.pavango.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckLengthOfGivenNumberTests {
    @Test
    void shouldCheckTheLengthOfGivenNumber() {
        CheckLengthOfGivenNumber lengthOfGivenNumber = new CheckLengthOfGivenNumber();

        int checked = lengthOfGivenNumber.lengthOf(784536);

        Assertions.assertEquals(6, checked);
    }
}
