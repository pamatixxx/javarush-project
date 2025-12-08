package ru.javarush.java.core.level06.task07;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную и присваиваем ей цену товара

        double productPrice = 1234.56789;
        // Форматируем число так, чтобы было ровно два знака после запятой
        System.out.println(String.format ("%.2f", productPrice));

        // Выводим отформатированное значение на экран

    }
}