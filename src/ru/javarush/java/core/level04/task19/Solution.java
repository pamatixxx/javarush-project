package ru.javarush.java.core.level04.task19;

public class Solution {
    public static void main(String[] args) {
        int size = 8; // Размер игрового поля (8 строк и 8 столбцов)

        // Внешний цикл по строкам
        for (int i = 0; i < size; i++) {
            // Внутренний цикл по столбцам
            for (int j = 0; j < size; j++) {
                System.out.print(((i + j) % 2 == 0) ? "_" : "#");
            }
            System.out.println();
        }
    }
}