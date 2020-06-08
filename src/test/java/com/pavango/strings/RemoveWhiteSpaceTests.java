package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveWhiteSpaceTests {
    @Test
    void shouldRemoveWhitespace() {
        RemoveWhiteSpace remove = new RemoveWhiteSpace();

        String removed = remove.removeSpace("Hi Pavan Gowda");

        Assertions.assertEquals("HiPavanGowda", removed);
    }
    @Test
    void shouldRemoveWhitespaceAtTheBeginingOfTheString() {
        RemoveWhiteSpace remove = new RemoveWhiteSpace();

        String removed = remove.removeSpace("  Pavan Gowda");

        Assertions.assertEquals("PavanGowda", removed);
    }
    @Test
    void shouldRemoveWhiteSpaceAtTheEndOfTheString() {
        RemoveWhiteSpace remove = new RemoveWhiteSpace();

        String removed = remove.removeSpace("Pavan Gowda    ");

        Assertions.assertEquals("PavanGowda", removed);
    }
    @Test
    void shouldNotRemoveAnyWhiteSpaceWhenTheirIsNuthingInTheString() {
        RemoveWhiteSpace remove = new RemoveWhiteSpace();

        String removed = remove.removeSpace(" ");

        Assertions.assertEquals("", removed);
    }
}
