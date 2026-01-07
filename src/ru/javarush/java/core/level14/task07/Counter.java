package ru.javarush.java.core.level14.task07;

public class Counter {
    int currentValue;


    public void increment(){
        this.currentValue++;
    }

    public void printValue(){
        System.out.println(this.currentValue);
    }
}
