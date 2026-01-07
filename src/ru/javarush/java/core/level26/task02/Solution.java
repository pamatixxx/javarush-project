package ru.javarush.java.core.level26.task02;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаем "картотеку" студентов: ключ — имя (String), значение — возраст (Integer)
        Map<String, Integer> card = new HashMap<>();
        card.put("Иван", 20);
        card.put("Мария", 21);
        card.put("Алексей", 19);

        // Добавляем три записи о студентах


        // Выводим полный список всех студентов и их возрастов
        System.out.println(card);
    }
}