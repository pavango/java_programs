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
    void shouldCheckNumberIsNotDisariumNumber(){
        CheckDisariumNumber disariumNumber = new CheckDisariumNumber();

        boolean checked = disariumNumber. disariumnumber(120);

        Assertions.assertEquals(false, checked);
    }
}
