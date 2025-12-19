package ru.javarush.java.core.level48.task08;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список строк — нашу общую "доску мыслей"
        List<String> words = new ArrayList<>();

        // Лямбда-выражение типа Runnable.
        Runnable runnable = () -> words.add("Hello");
        // Запускаем действие
        runnable.run();

        // Выводим содержимое списка. Ожидаемый результат: [Hello]

        System.out.println(words);
    }
}