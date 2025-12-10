package ru.javarush.java.core.level23.task08;

public class OverloadDemo {


    public void print(int t) {
        System.out.println("int: " + t);
    }

    public void print(double d) {
        System.out.println("double: " + d);
    }
}
