package ru.javarush.java.core.level07.task08;

import java.util.Arrays;
import java.util.OptionalInt;

public class Solution {
    public static void main(String[] args) {
        // Быстрая инициализация массива с 6 элементами температур

        int[] hourlyTemperatures = {3, 11, 7, 4, 15, 2};
        // Предполагаем, что первый элемент массива является максимальным

        OptionalInt max = Arrays.stream(hourlyTemperatures).max();
        // Проходим по всем элементам массива, начиная со второго
        // Если текущая температура больше сохранённой максимальной
        // Обновляем максимальную температуру

        // Выводим найденную максимальную температуру
        System.out.println(max.getAsInt());
    }
}