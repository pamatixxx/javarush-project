package ru.javarush.java.core.level07.task12;

public class Solution {
    public static void main(String[] args) {
        // Создаем двумерный массив для хранения показаний (2 строки, 5 столбцов)
        int[][] sensorData = new int[2][5];
        // Начальное значение для заполнения массива
        int count = 10;

        // Заполняем массив по строкам, слева направо
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                sensorData[i][j] = count;
                count++;
            }
        }


        // Выводим массив в виде таблицы
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 1 && j == 4)
                    System.out.print(sensorData[i][j]);
                else
                    System.out.print(sensorData[i][j] + " ");
            }
            System.out.println();
        }
    }
}