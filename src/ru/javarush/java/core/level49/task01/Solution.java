package ru.javarush.java.core.level49.task01;

import java.util.Arrays;
import java.util.function.Function;

public class Solution {
    public static void main(String[] args) {
        // Function принимает любую строку и возвращает её длину
        Function<String, Integer> function = s -> s.length();

        // Тестовые заголовки
        String[] titles = {"Stream", "Java", "Predicate"};

        // Выводим результаты в требуемом формате
        Arrays.stream(titles).forEach(t -> {
            System.out.println("Длина заголовка '" + t  +"': "+ function.apply(t));
        });
    }
}