package com.pavango.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerOfTests {
    @Test
    void shouldGivePowerValueToTheGivenNumber() {
        PowerOf powerOf = new PowerOf();

        int value = powerOf.powerValue(4, 10);

        Assertions.assertEquals(1048576, value);
    }
}
