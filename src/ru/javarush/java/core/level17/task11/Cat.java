package ru.javarush.java.core.level17.task11;

public class Cat extends Animal{
    String name = "Кошка";

    void printNames(){
        System.out.println(name);
        System.out.println(super.name);
    }
}
