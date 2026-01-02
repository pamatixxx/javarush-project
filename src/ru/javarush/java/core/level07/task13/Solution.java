package ru.javarush.java.core.level07.task13;

public class Solution {
    public static void main(String[] args) {
        // Создаем зубчатый массив (каждая "строка" может иметь свою длину)
        int[][] playerAchievements = {{1,2},{1,2,3,4},{1}};
                // 1-й уровень: 2 достижения
                // 2-й уровень: 4 достижения
                // 3-й (бонусный) уровень: 1 достижение

        // Выводим каждую строку массива на отдельной строке
        for (int i = 0; i < playerAchievements.length; i++) {
            for (int j = 0; j < playerAchievements[i].length; j++) {
                System.out.print(playerAchievements[i][j] + " ");
            }
            System.out.println();
        }
    }
}