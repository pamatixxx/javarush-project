package ru.javarush.java.core.level05.task01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);
        // Запрашиваем у пользователя высоту лестницы
        int height = scanner.nextInt();

        // Внешний цикл — по количеству ступеней (строк)
        for (int i = 0; i < height ; i++) {
            // Внутренний цикл — печатает нужное количество символов '#'
            for (int j = 0; j <= i ; j++) {
                System.out.print("#");
            }
            System.out.println();// Переход на новую строку после каждой ступеньки

        }
    }
}