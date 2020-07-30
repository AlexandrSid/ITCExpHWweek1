package com.company.lesson1;

import java.util.Scanner;

/** 4. Напишите программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
  */
public class Progression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0 for Arithmetical progression or 1 for Geometrical one");
        int typeIdentifier = scanner.nextInt();

        //раз уж про switch рассказали в лекции...
        switch (typeIdentifier){
            case (0):
                System.out.println("You have chosen Arithmetical Progression \n Enter FIRST ELEMENT, COMMON DIFFERENCE, and NUMBER of elements to show separate with space \ne.g.: 1,24 3,23 15");
                break;
            case (1):
                System.out.println("You have chosen Geometrical Progression \nEnter FIRST ELEMENT, COMMON RATIO, and NUMBER of elements to show separate with space \ne.g.: 1,24 3,23 15");
                break;
            default:
                System.out.println("Unexpected value, restart the program");
        }

        //точки в качестве разделителя целой и дробной части не работают
        double base = scanner.nextDouble();
        double factor = scanner.nextDouble();
        int number = scanner.nextInt();


        if (typeIdentifier == 0)
        for (int j = number; j > 0 ; j--) {
            System.out.println(base);
            base += factor;
        }
        if (typeIdentifier == 1)
        for (int j = number; j > 0 ; j--) {
            System.out.println(base);
            base *= factor;
        }
    }
}
