package ru.javarush.java.core.level03.task19;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную currentHour, которая хранит текущий час (от 0 до 23)

        int currentHour = 22;
        String greetingMessage = currentHour<12?"Доброе утро":"Добрый день";
        // Используем тернарный оператор для выбора приветствия
        System.out.println(greetingMessage);
    }
}