package ru.javarush.java.core.level26.task01;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список (реализация ArrayList) для хранения названий фруктов
        List fruit = new ArrayList<>();
        fruit.add("Яблоко");
        fruit.add("Банан");
        fruit.add("Груша");
        // Добавляем фрукты в заданном порядке
        System.out.println(fruit);

        // Выводим весь список: метод toString() у коллекции показывает все элементы

    }
}