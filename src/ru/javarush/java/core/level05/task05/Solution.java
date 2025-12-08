package ru.javarush.java.core.level05.task05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем сканер для чтения числа с консоли

        Scanner scanner = new Scanner(System.in);
        int pyramidHeight = scanner.nextInt();
        // Строим обелиск строка за строкой
        for (int row = 1; row <= pyramidHeight; row++) {
            // Количество пробелов слева: уменьшается от (N - 1) до 0

            // Количество звездочек: растет по формуле (2 * row - 1)


            // Печатаем пробелы для выравнивания
            for (int x = 0; x < pyramidHeight - row; x++) {
                System.out.print(" ");
            }
            // Печатаем звездочки
            for (int y = 0; y < 2 * row - 1; y++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}