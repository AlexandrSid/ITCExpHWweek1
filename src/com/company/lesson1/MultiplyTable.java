package com.company.lesson1;

import java.util.Scanner;

/**
 * 3. Напишите программу для вывода на экран таблицы умножения.
 */
public class MultiplyTable {
    public static void main(String[] args) {
//        drawPrimitiveTable();
        drawTable(collectLimits());
    }

    private static void drawPrimitiveTable() {
        int minA = 2;
        int maxA = 9;
        int minB = 2;
        int maxB = 9;

        for (int i = minA; i <= maxA; i++) {
            for (int j = minB; j <=maxB ; j++) {
                System.out.format("%2d ",i*j);
            }
            System.out.println();
        }
    }

    private static int[] collectLimits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer limits of table you want in format: \"minA maxA minB maxB\"");
        int minA = scanner.nextInt();
        int maxA = scanner.nextInt();
        int minB = scanner.nextInt();
        int maxB = scanner.nextInt();
        return new int[]{minA, maxA, minB, maxB};
    }

    private static void drawTable(int[] limits){
        for (int i = limits[0]; i <= limits[1]; i++) {
            for (int j = limits[2]; j <=limits[3] ; j++) {
                //тут я хотел подставлять величину разрядности максимального по модулю числа в таблице,
                //но забил делать вычисление максимального из углов без использования коллекций
                //поэтому там 5
                System.out.format("%5d ",i*j);
            }
            System.out.println();
        }
    }
}
