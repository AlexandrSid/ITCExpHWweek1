package com.company.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 2. Запросить у пользователя целое число N, создать двумерный массив размером N на N.
 * Заполнить его случайными числами и вывести на экран сумму диагоналей массива.
 */
public class Grid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер двумерного массива");
        int n = scanner.nextInt();
        Random random = new Random();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = random.nextInt(10);

            }
        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(Arrays.toString(grid[i]));
//        }

        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += grid[i][i];
            sum += grid[i][grid.length - i - 1];
        }

        System.out.println(sum);
    }
}
