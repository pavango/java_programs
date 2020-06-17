package com.pavango.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountWordsInStringTests{
    @Test
    void shouldtrimSpaceBeforeAndAfterTheStringCarector() {
        CountWordsInString countWordsInString = new CountWordsInString();

        int counted = countWordsInString.countWordsOfString("       pavan    ");

        Assertions.assertEquals(1, counted);
    }
    @Test
    void shouldCountWordsByNegletingAllTheSpaceInStringcarector() {
        CountWordsInString countWordsInString = new CountWordsInString();

        int counted = countWordsInString.countWordsOfString("       pavan  Gowda   is  a  good  boy  ");

        Assertions.assertEquals(6, counted);
    }
}
