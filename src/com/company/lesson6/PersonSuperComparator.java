package com.company.lesson6;

import java.util.Comparator;

/**
 * Напишите класс PersonSuperComparator, который имплементит Comparator,
 * но умеет сравнивать по двум параметрам: возраст и имя.
 * Класс Person теперь содержит два поля int age и String name.
 */

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age + o1.name.compareTo(o2.name);
//        или что подразумевлось под "сравнивать по двум параметрам"?
//        имплементит компаратор - переопределяет compare,
//        если нуен выбор, нужен другой компаратор
    }
}
