package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrimSpaceTests {
    @Test
    void shouldTrimSpaceBeforeStringCarector() {
        TrimSpace trimSpace = new TrimSpace();

        String trimd = trimSpace.trimSpace("    pavan");

        Assertions.assertEquals("pavan",trimd);
    }
    @Test
    void shouldTrimSpaceAfterStringCarector() {
        TrimSpace trimSpace = new TrimSpace();

        String trimd = trimSpace.trimSpace("pavan    ");

        Assertions.assertEquals("pavan",trimd);
    }
    @Test
    void shouldNegletMidalSpaceOfStringCarector() {
        TrimSpace trimSpace = new TrimSpace();

        String trimd = trimSpace.trimSpace("    pavan  gowda  ");

        Assertions.assertEquals("pavan  gowda",trimd);
    }
}
