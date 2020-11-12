package com.pavango.numbers;

class CheckLengthOfGivenNumber {
    public static int lengthOf(int number) {
        int number1 = number;
        int size = 0;
        do {
            number1 = number1 / 10;
            size++;
        } while (number1 != 0);
        return size;
    }
}
