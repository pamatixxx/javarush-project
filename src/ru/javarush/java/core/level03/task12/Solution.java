package ru.javarush.java.core.level03.task12;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную roomTemperature типа int
        int roomTemperature = 14;
        boolean isComfortable= (roomTemperature >= 20 && roomTemperature <= 25) ? true : false;
        System.out.println(isComfortable);

    }
}