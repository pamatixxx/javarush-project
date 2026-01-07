package ru.javarush.java.core.level48.task04;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Исходный список водных объектов
        List<String> waterBodies = List.of("река", "море", "озеро", "ручей", "пруд");

        // Используем Stream API:
        List<String> result = waterBodies.stream().map(String::toUpperCase).filter(s -> s.length()>4).toList();

        // Выводим итоговый список на экран
        result.forEach(System.out::println);

    }
}