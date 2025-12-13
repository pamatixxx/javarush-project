package ru.javarush.java.core.level28.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем изменяемый список с исходными названиями животных
       List<String> animalList = new ArrayList<>(Arrays.asList( "cat", "elephant", "dog", "tiger", "rat", "lion"));

        // Удаляем все строки, длина которых меньше 4 символов
        animalList.removeIf(s -> s.length() < 4);
        // removeIf принимает условие (Predicate): если возвращает true — элемент удаляется
        System.out.println(animalList);

        // Выводим обновленный список после фильтрации

    }
}