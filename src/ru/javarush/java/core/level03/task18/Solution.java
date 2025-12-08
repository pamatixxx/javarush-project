package ru.javarush.java.core.level03.task18;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную orderNumber и присваиваем ей значение

        int orderNumber = 5;
        String orderStatus = orderNumber%2==0?"Чётный":"Нечётный";
        // Используем тернарный оператор для определения чётности orderNumber
        System.out.println(orderStatus);
    }
}