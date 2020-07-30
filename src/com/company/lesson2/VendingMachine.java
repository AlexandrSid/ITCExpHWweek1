package com.company.lesson2;

import java.util.Scanner;

/**
 * Реализовать программу «Вендинговый автомат», которая позволит:
 * <p>
 * Посмотреть меню напитков
 * Внести деньги на внутренний счет
 * Выбрать номер напитка и получить его, если на счету достаточно средств.
 * Программа должна обрабатывать следующие ситуации:
 * <p>
 * Пользователь не внес деньги
 * Пользователь выбрал более дорогой напиток, чем внесено денег
 * Пользователь выбрал несуществующий номер напитка
 * У напитка должна быть цена и название.
 */
public class VendingMachine {

    private Drink[] drinks = new Drink[]{
            new Drink("Water", 10),
            new Drink("Gas Water", 15),
            new Drink("Baikal", 25),
            new Drink("CocaCola", 40),
            new Drink("RedBull", 55),
            new Drink("IceTea", 40),
            new Drink("Coffee", 50)
    };

    private String mainMenu =
            "*************************************\n" +
            "   Для ознакомления с меню введите 1\n" +
            "   Для пополнения счёта введите 2\n" +
            "   Для выбора напитка введите 3\n" +
            "   Для завершения работы введите 0\n" +
            "*************************************";

    private int debit = 0;

    public void insertMoney() {
    }

    public void showMenu() {
    }

    public void choseDrink() {
    }

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println(getMainMenu());
            int chose = scanner.nextInt();
            switch (chose) {
                case (0)://Завершение работы
                    System.out.println("До свидания, не забудьте забрать ваши деньги " + debit);
                    break loop;
                case (1)://Показ меню
                case (2)://Пополнение счёта
                case (3)://Выбор напитка
            }
        }
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public String getMainMenu() {
        return mainMenu;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }
}
