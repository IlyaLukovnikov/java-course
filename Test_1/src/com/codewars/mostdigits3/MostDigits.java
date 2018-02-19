package com.codewars.mostdigits3;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            // Преобразуем число по модулю в строку и находим ее длину
            if (Integer.toString(Math.abs(numbers[i])).length() >
                    Integer.toString(Math.abs(numbers[max])).length()) {
                max = i;
            }
        }

        return numbers[max];
    }
}
