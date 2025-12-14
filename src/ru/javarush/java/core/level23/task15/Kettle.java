package ru.javarush.java.core.level23.task15;

public class Kettle extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("включить");
    }

    public void boil(){
        System.out.println("Вода закипела");
    }
}
