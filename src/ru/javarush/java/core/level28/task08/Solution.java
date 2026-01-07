package ru.javarush.java.core.level28.task08;

import java.util.EnumMap;

// Перечисление дней недели
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class Solution {
    public static void main(String[] args) {
        // Специализированная карта для enum-ключей: работает быстро и экономит память
        EnumMap<Day, Integer> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.MON, 100);
        enumMap.put(Day.TUE, 120);
        enumMap.put(Day.SAT, 200);
        // Получаем цену на субботу и выводим на экран
        System.out.println(enumMap.get(Day.SAT));
    }
}