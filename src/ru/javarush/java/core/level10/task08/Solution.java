package ru.javarush.java.core.level10.task08;

public class Solution {
    public static void main(String[] args) {
        // Объявляем константу с модификатором final и присваиваем ей значение 100
        final int MAX_PLAYERS_ON_SERVER = 100;

        // Попытка изменить значение константы
        //  MAX_PLAYERS_ON_SERVER = 200; - нельзя поле final, неизменяемая переменная

        // Выводим значение константы на экран
        System.out.println(MAX_PLAYERS_ON_SERVER);
    }
}