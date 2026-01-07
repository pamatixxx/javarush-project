package ru.javarush.java.core.level09.task07;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные с заданными значениями
        String itemName = "Яблоки"; // Название товара
        int itemCount = 7; // Количество товара
        double itemWeight = 1.234; // Вес товара

        // Форматируем строку отчёта с помощью String.format


        // Выводим форматированную строку на консоль
        System.out.println(String.format("Товар: [%-10s] | Кол-во: [%4d] | Вес: [%5.2f кг]",itemName, itemCount, itemWeight));
    }
}