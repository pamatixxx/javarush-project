package ru.javarush.java.core.level04.task16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с клавиатуры

        Scanner scanner = new Scanner(System.in);
        // Переменная для хранения суммы всех продаж
        double salarySold = 0;

        // Бесконечный цикл для ввода данных
        while (true) {
            // Запрашиваем сумму продажи
            int sold = scanner.nextInt();
            // Считываем введенное число


            // Если введено отрицательное число, выходим из цикла
            if (sold < 0) {
                break;
            }else
                salarySold += sold;

        }
        System.out.println(salarySold);
    }
}