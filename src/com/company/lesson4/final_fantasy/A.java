package com.company.lesson4.final_fantasy;

/** Поэкспериментируйте с ключевым словом final
 *
 */
public class A {
    {
        final A a1 = new A();
        A a2 = new A();
//        a1 = a2;
        a2 = a1;
    }

    final void method(){

    }
}
