package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReplaceWhiteSpaceTests {
    @Test
    void shouldReplaceWhiteSpaceBySpicalCharector() {
        ReplaceWhiteSpace replace = new ReplaceWhiteSpace();

        String replaced = replace.replaceSpace("pavan gowda", '*');

        Assertions.assertEquals("pavan*gowda", replaced);
    }
    @Test
    void shouldAllWhitespaceReplaceByGivenCharector() {
        ReplaceWhiteSpace replace = new ReplaceWhiteSpace();

        String replaced = replace.replaceSpace("pavan gowda is a good boy", '*');

        Assertions.assertEquals("pavan*gowda*is*a*good*boy", replaced);
    }
}
