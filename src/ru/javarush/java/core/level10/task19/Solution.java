package ru.javarush.java.core.level10.task19;

public class Solution {
    public static void main(String[] args) {
        // Числовой код дня недели
        int dayNumber = 2;

        // Новое switch-выражение (стрелочный синтаксис) возвращает строку
        String dayNameString = switch (dayNumber) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            default -> "Неизвестный день";
        };

        // Выводим результат на экран
        System.out.println(dayNameString);
    }
}