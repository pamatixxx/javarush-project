package ru.javarush.java.core.level48.task04;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        // Исходный список водных объектов
        List<String> waterBodies = List.of("река", "море", "озеро", "ручей", "пруд");

        // Используем Stream API:
        List result = waterBodies.stream().map(String::toUpperCase).filter(s -> s.length()>4).collect(Collectors.toList());

        // Выводим итоговый список на экран
        result.forEach(System.out::println);

    }
}