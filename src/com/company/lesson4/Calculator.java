package com.company.lesson4;

/**
 * Реализуйте класс Calculator,
 * который будет содержать статические методы для операций вычитания, сложения, умножения, деления и взятия процента от числа.
 * Класс должен работать как с целыми числами, так и с дробями.
 */
public class Calculator {

    public static double subtraction(double from, double what) {
        return from - what;
    }

    public static int subtraction(int from, int what) {
        return from - what;
    }

    public static double addition(double... terms) {
        double result = 0;
        for(double d: terms){
        result += d;
        }
        return result;
    }

    public static int addition(int... terms) {
        int result = 0;
        for(int d: terms){
            result += d;
        }
        return result;
    }

    public static double multiplication(double... factors) {
        double result = 0;
        for(double d: factors){
            result *= d;
        }
        return result;
    }

    public static int multiplication(int... factors) {
        int result = 0;
        for(int d: factors){
            result *= d;
        }
        return result;
    }

    public static double division(double nominator, double denominator) {
        return nominator/denominator;
    }

    public static double division(int nominator, int denominator) {
        return ((double)nominator)/denominator;
    }


    public static double getPercent(double base, double percent) {
        return base/100*percent;
    }

    public static double getPercent(int base, int percent) {
        return ((double)base*percent)/100;
    }

    }
