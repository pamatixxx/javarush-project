package ru.javarush.java.core.level12.task02;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список строк (названия фруктов)
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        // Добавляем исходные фрукты в заданном порядке

        fruits.set(1, "Груша");

        // Заменяем второй элемент ("Банан") на "Груша"


        // Удаляем первый элемент ("Яблоко")
        fruits.remove(0);

        // Выводим оставшиеся фрукты, каждый на новой строке

        System.out.println(Arrays.stream(fruits.toArray()).toList());
    }
}