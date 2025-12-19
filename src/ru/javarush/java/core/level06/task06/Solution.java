package ru.javarush.java.core.level06.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести сумму платежа
        System.out.println("Введите сумму платежа");
        double customerPayment = scanner.nextDouble();

        // Считываем введенное значение и сохраняем его в переменную типа double
        // Подтверждаем полученную сумму, выводя её на экран
        System.out.println("Внесено средств: " + customerPayment);
    }
}