package com.company.lesson3;

import java.util.Arrays;
import java.util.Random;

/** 1. Реализовать алгоритм сортировки массива пузырьком и попытаться его оптимизировать.
 * Оптимизацию будем "считать" количеством итераций цикла
 */

public class BubbleSort {
    static int[] arrayToSort;

    static {
        arrayToSort = new int[50];
        final Random random = new Random();
        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i]=random.nextInt(100);
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayToSort));

        for (int i = 0; i < arrayToSort.length; i++) {
//            for (int j = 0; j < arrayToSort.length; j++) {//обычная версия
            for (int j = i; j < arrayToSort.length; j++) {//оптимизированная версия
                if(arrayToSort[i] > arrayToSort[j]){
                    int minMax = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = minMax;
                }
            }
        }

        System.out.println(Arrays.toString(arrayToSort));

//        Arrays.sort(arrayToSort);//самая оптимизированная))

    }
}
