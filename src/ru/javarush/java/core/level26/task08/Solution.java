package ru.javarush.java.core.level26.task08;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // Исходный список с повторами
        List list = new ArrayList();
        list.add("яблоко");
        list.add("груша");
        list.add("яблоко");
        list.add("слива");
        list.add("груша");
        // Используем Set для удаления дубликатов.
        TreeSet<String> set = new TreeSet(list);
        System.out.println(set);
        // Выводим итоговый набор уникальных товаров

    }
}