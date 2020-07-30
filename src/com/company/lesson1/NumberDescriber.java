package com.company.lesson1;

import java.util.Scanner;

/**
 * 2. Напишите программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
 */
public class NumberDescriber {
    //Пусть на этот раз число будет типа int
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number to describe");
        int number = scanner.nextInt();

        String zeroRelativeIdentifier;
        String evenIdentifier;

        if (number == 0) {
            zeroRelativeIdentifier = "equals zero";
        } else if (number > 0) {
            zeroRelativeIdentifier = "is positive";
        } else {
            zeroRelativeIdentifier = "is negative";
        }

        evenIdentifier = (number%2==0)?"even":"odd";

        System.out.println(String.format("The number %d %s, %s",number, zeroRelativeIdentifier, evenIdentifier));
    }
}
