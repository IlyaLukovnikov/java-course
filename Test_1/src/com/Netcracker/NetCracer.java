package com.Netcracker;



public class NetCracer {

    public static void main(String[] args) {

        float a[] = {5, 7, 32, -2, -4, 53, 54};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.println(a[i]);
                break;
            }
        }

    }
}
