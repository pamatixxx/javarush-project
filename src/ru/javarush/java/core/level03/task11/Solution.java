package ru.javarush.java.core.level03.task11;

public class Solution {
    public static void main(String[] args) {
        // Исходные условия (можно менять для проверки разных вариантов)
        boolean isSunny = false, isWeekend = false;

        // В парк идём только если одновременно солнечно И выходные
        boolean canGoToPark = (isSunny == true && isWeekend == true) ? true : false;

        // Остаёмся дома, если НЕ солнечно ИЛИ НЕ выходные
        boolean canStayHome = (isSunny != true || isWeekend != true) ? true : false;

        // Вывод значений на экран
        System.out.println(canGoToPark);
        System.out.println(canStayHome);
    }
}