package ru.javarush.java.core.level04.task07;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную N для хранения количества товаров
        int N = 7;

        // Переменная для хранения общей стоимости
        int totalСost = 0;

        // Используем цикл for для подсчета общей стоимости товаров
        for (int i = 1; i <= N; i++) {
            // Добавляем стоимость текущего товара (равную его порядковому номеру)
            totalСost+=i;
        }
        System.out.println(totalСost);
        // Выводим общую стоимость всех товаров

    }
}