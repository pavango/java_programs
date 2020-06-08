package com.pavango.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTests {
    @Test
    void shouldAdd2And1() {
        Calculator calculator = new Calculator();

        double addition = calculator.add(2.0, 1.0);

        Assertions.assertEquals(3.0, addition);
    }

    @Test
    void shouldAdd100And200() {
        Calculator calculator = new Calculator();

            double addition = calculator.add(100, 200);

        Assertions.assertEquals(300.0, addition);
    }

    @Test
    void shouldAddNegetiveNumbars() {
        Calculator calculator = new Calculator();

        double addition = calculator.add(-1, -2);

        Assertions.assertEquals(-3, addition);
    }
    @Test
    void shouldeAdd0AndNumbrs(){
        Calculator calculator = new Calculator();

        double addition = calculator.add(0, 4);

        Assertions.assertEquals(4, addition);
    }
}
