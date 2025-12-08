package ru.javarush.java.core.level05.task07;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с консоли
        Scanner scanner = new Scanner(System.in);

        // Считываем большое число, введенное пользователем
        BigInteger treasureAmount = scanner.nextBigInteger();

        // Выводим количество цифр в числе
        System.out.println(String.valueOf(treasureAmount.abs()).length());
    }
}