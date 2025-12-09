package ru.javarush.java.core.level17.task08;

public class AppleBasket extends Basket {
    @Override
    Apple getFruit() {
        return new Apple();
    }
}
