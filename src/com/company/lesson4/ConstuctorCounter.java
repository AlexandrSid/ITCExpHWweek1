package com.company.lesson4;

/**Реализуйте класс в конструкторе которого будет счетчик количества создаваемых объектов. Напишите метод для получения информации о количестве.
 *
 */

public class ConstuctorCounter {

    static int counter = 0;

    public ConstuctorCounter() {
        counter++;
    }

    public static int getNumberOfCreatedObjects(){
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(getNumberOfCreatedObjects());
        new ConstuctorCounter();
        System.out.println(getNumberOfCreatedObjects());
        new ConstuctorCounter();
        new ConstuctorCounter();
        System.out.println(getNumberOfCreatedObjects());

    }
}
