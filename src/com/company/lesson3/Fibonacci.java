package com.company.lesson3;

import java.util.Scanner;

/**Реализовать расчет и вывод в консоль последовательности чисел Фибоначчи до указанного пользователем N, посредством рекурсии
  */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько элементов последовательноти фиботачи отобразить (начиная с 3его)?");
        int n = scanner.nextInt();

        calculateAndShowFibonacci(n);
    }

    private static void calculateAndShowFibonacci(int n) {
        long first = 1;
        long second = 1;
        calculateAndShowNextElement(first,second,n);
    }

    private static void calculateAndShowNextElement(long beforeLast, long last, int howManyLeft) {//если оставить int, то 47й элемент переполняет int
        if (howManyLeft==0) return;
        long currentElement = beforeLast+last;
        System.out.print(currentElement + " ");
        calculateAndShowNextElement(last, currentElement, howManyLeft-1);
    }
}
