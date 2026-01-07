package ru.javarush.java.core.level05.task19;

public class Solution {
    public static void main(String[] args) {
        int size = 8; // Размер доски 8x8

        // Внешний цикл — по строкам
        for (int i = 0; i < size; i++) {
            int temp = 0;
            // Внутренний цикл — по клеткам строки
            for (int j = 0; j < size; j++) {
                System.out.print((i + j) % 2 == 0 ? "##" : "__");
            }
            // Чередуем клетки по сумме индексов: чётная — "##", нечётная — "__"
            System.out.println();

            // Перенос строки после каждой строки доски (без лишних пробелов)

        }
    }
}