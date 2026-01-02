package ru.javarush.java.core.level07.task07;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив с быстрой инициализацией

        int[] itemPrices = {5, 7, 2, 9};
        // Переменная для хранения суммы

        int sum = 0;
        // Суммируем все элементы массива
        for (int i = 0; i < itemPrices.length; i++) {
           sum+= itemPrices[i];
        }

        // Выводим итоговую сумму на экран
        System.out.println(sum);
    }
}