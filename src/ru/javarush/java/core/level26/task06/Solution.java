package ru.javarush.java.core.level26.task06;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // TreeMap автоматически поддерживает сортировку ключей по алфавиту (естественный порядок String)
        Map<String, Integer> fruit = new TreeMap<>();
        fruit.put("pear", 6);
        fruit.put("apple", 2);
        fruit.put("banana", 4);
        // Проходим по записям: порядок уже алфавитный благодаря TreeMap
        fruit.forEach((name, count) -> {
            System.out.println("Фрукт: " + name + ", Количество: " + count);
        });
    }
}