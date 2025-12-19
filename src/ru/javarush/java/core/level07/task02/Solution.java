package ru.javarush.java.core.level07.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив строк с фиксированным размером 3
        String favoriteLanguages [] = new String[3];

        // Заполняем массив значениями "Java"
        for (int i = 0; i < favoriteLanguages.length; i++) {
            favoriteLanguages[i] = "Java";
        }

        // Выводим на экран количество элементов, которые способен хранить массив
        System.out.println(favoriteLanguages.length);
    }
}