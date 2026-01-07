package ru.javarush.java.core.level07.task16;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Создаем зубчатый массив с заданным количеством элементов в каждой строке
        // Зона A: три датчика
        // Зона B: два датчика
        // Зона C: четыре датчика
        int[][] zoneTemperatures = {{22, 25, 20}, {276, 21}, {22, 25, 20, 15}};
        // Инициализируем переменную для хранения максимального значения
        int max = Arrays.stream(zoneTemperatures).flatMapToInt(Arrays::stream).max()
                .getAsInt();

        // Проходим по всем элементам зубчатого массива


        // Обновляем максимальное значение, если текущая температура больше


        // Выводим максимальное значение температуры на экран
        System.out.println(max);

    }
}