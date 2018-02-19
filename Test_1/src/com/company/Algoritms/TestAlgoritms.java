package com.company.Algoritms;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

public class TestAlgoritms {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        Algoritms.bubbleSortingInIncreasingOrder(array);
        for (int number : array) {
            System.out.println(number);
        }
        Algoritms.bubbleSortingInDecreasingOrder(array);
        for (int number : array) {
            System.out.println(number);
        }
        /// Поменять местами значения без использования 3-й переменной
        int a = 2;
        int b = 3;
        a = -a - b;
        b = -a - b;
        a = -a - b;
        System.out.println("a = " + a + " b = " + b);

        System.out.println(Algoritms.factorial(5)); // Факториал

        Algoritms.reverseArray(array);
        for (int number : array) {
            System.out.println(number);
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(10);
        arrayList.add(11);

        Algoritms.binarySearch(arrayList, 7);
    }
}
