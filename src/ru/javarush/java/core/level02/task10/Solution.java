package ru.javarush.java.core.level02.task10;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа int для хранения номера рейса
        int numFlight = 3;
        String cityState = "Днепр";

        String infoFlight = "Рейс " + numFlight + " до " + cityState;
        // Объединяем номер рейса и город назначения в одну строку с помощью оператора +
        System.out.println(infoFlight);

    }
}