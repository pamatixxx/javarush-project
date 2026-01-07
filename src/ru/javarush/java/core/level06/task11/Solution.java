package ru.javarush.java.core.level06.task11;

public class Solution {
    public static void main(String[] args) {
        // Вычисляем квадратный корень из -1 с помощью Math.sqrt
        double mysticAnomaly = Math.sqrt(-1);

        // Выводим значение mysticAnomaly на экран
        System.out.println(mysticAnomaly);

        // Проверяем, является ли mysticAnomaly NaN (Not a Number)
        // Выводим результат проверки на экран
        System.out.println(Double.isNaN(mysticAnomaly));
    }
}