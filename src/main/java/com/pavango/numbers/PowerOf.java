package com.pavango.numbers;

class PowerOf {
    public static int powerValue(int number, int power) {
        int powerValue = 1;
        for (int i = 1; i <= power; i++) {
            powerValue = powerValue * number;
        }
        return powerValue;
    }
}
