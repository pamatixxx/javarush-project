package ru.javarush.java.core.level26.task05;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаём Map: ключ — название дня недели (String), значение — его номер (Integer)
        Map<String, Integer> map = new HashMap<>();
        // Добавляем элементы согласно условию задачи
        map.put("Monday", 1);
        map.put("Tuesday", 2);
        map.put("Wednesday", 3);

        // Проходим по всем парам ключ-значение и выводим в требуемом формате
        for (String name : map.keySet()) {
            System.out.println("День: " + name + ", Номер: " + map.get(name));
        }
        map.forEach((day, number) ->
                System.out.println("День: " + day + ", Номер: " + number)
        );

        map.entrySet().stream()
                .forEach(e -> System.out.println("День: " + e.getKey() + ", Номер: " + e.getValue()));

        map.forEach((k, v) -> System.out.printf("День: %s, Номер: %s%n", k, v));
    }
}