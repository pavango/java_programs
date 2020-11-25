package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DetermineWhetherOneStringisRotationofAnotherTests {
    @Test
    void shouldDetermineWhetherOneStringisRotationofAnotherTests() {
        DetermineWhetherOneStringisRotationofAnother determineWhetherOneStringisRotationofAnother = new DetermineWhetherOneStringisRotationofAnother();

        boolean checked = determineWhetherOneStringisRotationofAnother.checkGivenOneStringIsRotationOfAnother("abcde", "deabc");

        Assertions.assertEquals(true, checked);
    }
    @Test
    void shouldDetermineWhetherOneStringisRotationofAnotherOrNotTests() {
        DetermineWhetherOneStringisRotationofAnother determineWhetherOneStringisRotationofAnother = new DetermineWhetherOneStringisRotationofAnother();

        boolean checked = determineWhetherOneStringisRotationofAnother.checkGivenOneStringIsRotationOfAnother("abcde", "dbcae");

        Assertions.assertEquals(false, checked);
    }
}
