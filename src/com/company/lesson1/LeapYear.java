package com.company.lesson1;

import java.util.Scanner;

/**Дополнительное задание: Написать программу для определения является ли введенный пользователем год високосным.
 * Каждый 150-й год – високосный, а также любой год, который делится на 4.
 */
//Не знаю, в каком календаре високосные года соответствуют описанным параметрам, поэтому посчитаю для григорианского
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year e.g. 2020 and press ENTER");
        int year = scanner.nextInt();
        if(year%400==0 || year%100!=0 && year%4==0)
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");
    }
}
