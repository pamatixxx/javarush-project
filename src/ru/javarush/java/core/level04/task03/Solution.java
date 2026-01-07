package ru.javarush.java.core.level04.task03;

public class Solution {
    public static void main(String[] args) {
        // Инициализируем переменную для номера кресла
        int seat = 2;
        // Используем цикл while для перебора номеров кресел
        while (seat <= 10) {
            System.out.println(seat);
            seat += 2;
        }
    }
}