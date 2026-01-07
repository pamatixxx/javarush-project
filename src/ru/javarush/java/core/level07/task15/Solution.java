package ru.javarush.java.core.level07.task15;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Создаем зубчатый массив с заданными значениями
        // Первая строка массива
        // Вторая строка массива
        // Третья строка массива
        int[][] miniGameScores = {{1, 2}, {3, 4, 5}, {6}};
        // Переменная для хранения суммы всех элементов массива
        int miniGameScoresSize = (int) Arrays.stream(miniGameScores)
                .flatMapToInt(Arrays::stream)
                .sum();
        // Выводим итоговую сумму на экран
        System.out.println(miniGameScoresSize);
    }
}