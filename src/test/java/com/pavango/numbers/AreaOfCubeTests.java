package com.pavango.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AreaOfCubeTests {
    @Test
    void shouldCalculateAreaOfCubeside() {
        AreaOfCube areaOfCube = new AreaOfCube();

        double area = areaOfCube. areaOfCube( 8 );

        Assertions.assertEquals(384.0, area);
    }
    @Test
    void shouldCalculateAresOfCubeWithNegetivevalue() {
        AreaOfCube areaOfCube = new AreaOfCube();

        double area = areaOfCube. areaOfCube( -5 );

        Assertions.assertEquals(150.0, area);
    }
}
