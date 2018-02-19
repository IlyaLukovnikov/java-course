package com.company.Algoritms;

import java.util.ArrayList;

/**
 * Реализация сортировки пузырьком
 */
public class Algoritms {

    /**
     * Сортировка числе в порядке возрастания
     * @param array Неотсортированный массив
     */
    public static void bubbleSortingInIncreasingOrder(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * Сортировка чисел в порядке убывания
     * @param array Неотсортированный массив
     */
    public static void bubbleSortingInDecreasingOrder(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * Поиск факториала x * (x - 1) * (x - 2) * ... * 1
     */
    public static int factorial (int x) {
        if (x == 1)
            return 1;
        return x * factorial(x - 1);
    }

    /**
     * Переворачивает массив в обратном порядке
     * @param array начальный массив
     */
    public static void reverseArray(int[] array) {
        int temp;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    /**
     * Реализует бинарный поиск в отсортированном массиве
     * @param arrayList Отсортированный массив по возрастанию
     * @param value Значение, которое надо найти
     */
    public static int binarySearch (ArrayList<Integer> arrayList, int value) {
        int begin = 0;
        int end = arrayList.size() - 1;

        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (value == arrayList.get(middle)) {
                System.out.println("Value " + value + " is located at index " + middle);
                return 0;

            }
            else if (value > arrayList.get(middle)) {
                begin = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return 1;
    }
}
