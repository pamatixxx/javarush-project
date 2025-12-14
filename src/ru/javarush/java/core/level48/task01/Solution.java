package ru.javarush.java.core.level48.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Компаратор, который сравнивает строки по их длине (короче — "меньше")
        Comparator<String> cmp = (a, b) -> a.length() - b.length();
        // Создаем список строк
        List<String> names = new ArrayList<>(Arrays.asList("cat", "elephant", "dog"));

        // Сортируем список с использованием нашего компаратора
        names.sort(cmp);

        // Выводим отсортированный список
        names.forEach(System.out::println);

    }
}