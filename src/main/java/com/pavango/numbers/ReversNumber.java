package com.pavango.numbers;

class ReversNumber {
    public static int reversNumber(int number) {
        int reversNumber = 0;
        while (number != 0) {
            reversNumber = reversNumber * 10;
            reversNumber = reversNumber + (number % 10);
            number = number / 10;
        }
        return reversNumber;
    }
}
