package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReplaceTheGivenStringToOppositCaseTests {
    @Test
    void shouldRplaceTheGivenStringIntoOppositeCase() {
        ReplaceTheGivenStringToOppositCase replaceTheStringToOppositCase = new ReplaceTheGivenStringToOppositCase();

        String replaced = replaceTheStringToOppositCase.convertTheStringIntoOppositCase("Great Power");

        Assertions.assertEquals("gREAT pOWER" , replaced);
    }
}
