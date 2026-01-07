package ru.javarush.java.core.level04.task15;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с клавиатуры
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        // Просим пользователя ввести целое число больше 1
        while (num<=1){
          num =  scanner.nextInt();
        }

        boolean neProstoe = false;
        // Проверяем, является ли число простым


        // Цикл для поиска первого делителя числа n
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) { // Если n делится на i без остатка
                // Выводим первый найденный делитель
                System.out.println(i);
                // Устанавливаем флаг, что число не простое
                neProstoe = true;
                // Завершаем цикл, так как делитель найден
                break;
            }
        }

        // Если делитель не найден, выводим, что число простое
        if (!neProstoe) {
            System.out.println("Число простое");
        }
    }
}