package ru.javarush.java.core.level06.task10;

public class Solution {
    public static void main(String[] args) {
        // Делим 1.0 на 0.0: в мире double это не ошибка, а положительная бесконечность
        double cosmicEvent = 1.0 / 0.0;

        // Выводим значение переменной (ожидается "Infinity")
        System.out.println(cosmicEvent);
        // Подтверждаем, что значение действительно бесконечность
        System.out.println(Double.isInfinite(cosmicEvent));

    }
}