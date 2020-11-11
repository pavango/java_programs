package com.pavango.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AreaOfCircleTests{
    @Test
    void shouldCalculateAreaOfCircleRedius(){
        AreaOfCircle areaOfCircle = new AreaOfCircle();

        double area = areaOfCircle. areaOfCircle( 4 );

        Assertions.assertEquals(50.24, area);
    }
}
