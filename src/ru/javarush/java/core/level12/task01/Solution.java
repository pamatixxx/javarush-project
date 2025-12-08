package ru.javarush.java.core.level12.task01;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список для хранения числовых идентификаторов артефактов
        ArrayList<Integer> list = new ArrayList<>();

        // Добавляем идентификатор 42 в список
        list.add(42);

        // Получаем первый элемент списка по индексу 0
        System.out.println(list.get(0));

        // Выводим значение первого элемента на экран
    }
}