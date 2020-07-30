package com.company.lesson1;

import java.util.Scanner;
/**
 * 1. Напишите программу для поиска минимального из двух чисел.
 */
public class MinNumFinder {
//    Предположим, что программа будет сравнивать double, запятая как разделитель целой и дробной части, и что данные вводятся корректно
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double first = scanner.nextDouble();
        System.out.println("Enter second number");
        double second = scanner.nextDouble();

        if (first==second){
            System.out.println("Numbers are equals");
        }else if (first>second){
            System.out.println(String.format("first (%f) is greater than second(%f)", first, second ));
        }else {
            System.out.println(String.format("second (%f) is greater than first(%f)", second, first ));
        }

    }
}
