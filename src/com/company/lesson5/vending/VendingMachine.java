package com.company.lesson5.vending;

import java.util.Scanner;

/**
 * Перепишите проект с урока (вендинговый автомат) используя конструктор, перечисления и взаимодействие с пользователем.
 */
//конструктор и взаимодействие уже было, встроим ENUM в меню выбора действия
public class VendingMachine {

    private Drink[] drinks = new Drink[]{
            new Drink("Water", 10),
            new Drink("Gas Water", 15),
            new Drink("Baikal", 25),
            new Drink(),//типа пустые слоты в вендинге
            new Drink(),
            new Drink("CocaCola", 40),
            new Drink("RedBull", 55),
            new Drink("IceTea", 40),
            new Drink(),
            new Drink("Coffee", 50)
    };

    private String mainMenu =
            "*************************************\n" +
                    "   Для ознакомления с меню введите SHOW\n" +
                    "   Для пополнения счёта введите ADD\n" +
                    "   Для выбора напитка введите BUY\n" +
                    "   Для завершения работы введите EXIT\n" +
                    "*************************************";

    private int debit = 0;

    public void insertMoney() {
//        System.out.println("метод внесения денег на счёт");
        System.out.println("Ваш текщий баланс: " + getDebit());
        System.out.println("Введите сумму для пополнения");
        int debitInc = new Scanner(System.in).nextInt();
        this.debit += debitInc;//с геттерами и сеттерами совсем коряво выглядит
        System.out.format("Вы внесли %d, ваш текщий баланс составляет %d%n%n", debitInc, debit);
    }

    public void showMenu() {
//        System.out.println("Метод показа меню напитков");
        //for (Drink drink : getDrinks()) пришлось бы вводить счётчик
        for (int i = 0; i < getDrinks().length; i++) {
            Drink drink = drinks[i];
            if (drink.getName().equals("")) continue;
            System.out.format("Для выбора %s по цене %d введите %d%n", drink.getName(), drink.getCost(), i);
        }
        System.out.println();
    }

    public void choseDrink() {
//        System.out.println("Метод выбора напитка");
        if (debit <= 0) {
            System.out.println("Вы не поплнили счёт");//вообще могли бы сначала принять заказ и запросить сколько не хватает, но это сложность не для второго урока первой недели
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер написка");
        int drinkNumber = scanner.nextInt();
        if (drinkNumber >= drinks.length) {
            System.out.println("Такого напитка нет");
            return;
        }
        Drink selectedDrink = drinks[drinkNumber];
        if (selectedDrink.getCost() == 0) {
            System.out.println("Слот пуст, выберите что-то другое");
        } else if (selectedDrink.getCost() > debit) {
            System.out.println("недостаточно средств, пополните счёт на " + (selectedDrink.getCost() - debit) + "\n");
        } else {
            System.out.format(
                    "Покупка %s за %d, остаток на счету %d%n",
                    selectedDrink.getName().toUpperCase(),
                    selectedDrink.getCost(),
                    debit -= selectedDrink.getCost()
            );
        }

    }

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println(getMainMenu());
            Choice choice = Choice.valueOf(scanner.next().toUpperCase());//теперь с эксепшенами
            switch (choice) {
                case EXIT://Завершение работы
                    System.out.println("До свидания, не забудьте забрать ваши деньги " + debit);
                    break loop;
                case SHOW: //Показ меню
                    showMenu();
                    break;
                case ADD://Пополнение счёта
                    insertMoney();
                    break;
                case BUY://Выбор напитка
                    choseDrink();
                    break;
                default:
                    System.out.println("Некорректный выбор");
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
