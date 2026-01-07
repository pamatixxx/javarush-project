package ru.javarush.java.core.level03.task20;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную возраста посетителя
        int visitorAge = 65;
        String ticketCategory = visitorAge < 7 ? "Детский" : visitorAge <= 17 ? "Подростковый" : visitorAge <= 64 ? "Взрослый" : "Пенсионный";
        System.out.println(ticketCategory);
    }
}