package ru.javarush.java.core.level30.task04;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Исходные показания датчиков
        List<Integer> readings = List.of(3, 7, 2, 9, 4, 6, 8, 5);

        // Обрабатываем показания через Stream API:
        // 1) фильтруем нечётные,
        // 2) превращаем в строки вида "Odd: X",
        // 3) собираем в новый список
       List oddLabels = readings.stream().filter(s-> s%2!=0).map(el -> "Odd: " + el).toList();

        // Выводим получившийся список на экран
        System.out.println(oddLabels);
    }
}