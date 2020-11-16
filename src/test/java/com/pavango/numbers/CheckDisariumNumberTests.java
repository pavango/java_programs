package com.pavango.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckDisariumNumberTests {
    @Test
    void shouldCheckNumberIsDisariumNumber() {
        CheckDisariumNumber disariumNumber = new CheckDisariumNumber();

        boolean checked = disariumNumber. disariumnumber(89);

        Assertions.assertEquals(true, checked);
    }
    @Test
    void shouldCheckNumberIsNotDisariumNumber() {
        CheckDisariumNumber disariumNumber = new CheckDisariumNumber();

        boolean checked = disariumNumber. disariumnumber(120);

        Assertions.assertEquals(false, checked);
    }
    @Test
    void shouldCheckTheLengthOfTheGivenNumber() {
        CheckDisariumNumber lengthOfGivenNumber = new CheckDisariumNumber();

        int checked = lengthOfGivenNumber.lengthOf(784536);

        Assertions.assertEquals(6, checked);
    }
    @Test
    void shouldGivePowerValueToTheGivenNumber() {
        CheckDisariumNumber powerOf = new CheckDisariumNumber();

        int value = powerOf.powerOf(4, 10);

        Assertions.assertEquals(1048576, value);
    }
    @Test
    void shouldGiveCubeDigitsValueToTheGivenNumber() {
        CheckDisariumNumber cubeOf = new CheckDisariumNumber();

        int value = cubeOf.getPowerOfDigits(45);

        Assertions.assertEquals(29, value);
    }
}
