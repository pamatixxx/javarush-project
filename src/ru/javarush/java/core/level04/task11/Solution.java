package ru.javarush.java.core.level04.task11;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // переменная для хранения выбранного пункта меню
        int choice = 0;

        // Используем do-while, чтобы меню показывалось хотя бы один раз и повторялось до выбора "Выйти"
        do {
            // Печатаем меню в каждом цикле
            System.out.println("Меню:");
            System.out.println("1. Вывести приветствие");
            System.out.println("2. Выйти");
            // Считываем номер выбранного пункта
            choice = scanner.nextInt();

            // Обработка выбора
            if (choice == 2) {
                break;
            }
            System.out.println("Привет!");
            // При выборе 2 цикл завершится благодаря условию while ниже
            // Для других значений просто снова покажем меню
        } while (!(choice == 2));
    }
}