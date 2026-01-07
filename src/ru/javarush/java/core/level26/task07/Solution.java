package ru.javarush.java.core.level26.task07;

import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // TreeSet автоматически сортирует строки по алфавиту и не допускает дубликатов
        TreeSet<String> list = new TreeSet<>();
        list.add("Борис");
        list.add("Алексей");
        list.add("Виктор");
        // Выводим список участников в алфавитном порядке

        System.out.println(list);
    }
}