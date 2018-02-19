package com.codewars.oddcube;

public class FindOddCubes {
    public static int cubeOdd(int ... arr) {
        int sum = 0;
        for (int number: arr) {
            if (number %2 != 0) {
                number = number * number * number;
                sum += number;
            }
        }
        return sum;
    }
}
