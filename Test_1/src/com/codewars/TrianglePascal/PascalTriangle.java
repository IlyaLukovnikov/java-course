package com.codewars.TrianglePascal;

import java.util.Arrays;

public class PascalTriangle {
    private int depth;
    private int[][] triangle;


// Создание треугольника в зависимотси от глубины
    public PascalTriangle(int depth) {
        this.depth = depth;
        switch (depth) {
            case 0: depth = 0;
            break;

            case 1: {
                triangle = new int[][]{{1}};
                break;
            }
            case 2: {
                triangle = new int[][]{ {1}, {1, 1} };
                break;
            }
            default: {
                triangle = new int[depth][];
                triangle[0] = new int[]{1};
                triangle[1] = new int[]{1, 1};
                for (int i = 2; i < depth; i++) {
                    triangle[i] = new int[i + 1];
                    triangle[i][0] = 1;
                    for (int j = 1; j < i; j++) {
                        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                    }
                    triangle[i][i] = 1;
                }
                break;
            }
        }
    }
    public  void printTriangle() {
        for (int i = 0; i < depth; i++) {
            System.out.println(Arrays.toString(triangle[i]));
        }
    }

    public static void main(String[] args) {
        PascalTriangle triangle = new PascalTriangle(4);
        triangle.printTriangle();
    }
}
