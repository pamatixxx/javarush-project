package ru.javarush.java.core.level03.task14;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем переменные согласно условию задачи
        boolean ticketsOnSale = false, haveMoneyForTicket = true, concertNotCanceled = false;

        // Первое логическое выражение без дополнительных скобок

        boolean canBuy = ticketsOnSale || haveMoneyForTicket && concertNotCanceled;
        // Второе логическое выражение с добавлением скобок

        boolean canBuyWithNewMeaning = (ticketsOnSale || haveMoneyForTicket) && concertNotCanceled;
        // Выводим результаты обоих выражений на экран

        System.out.println(canBuy);
        System.out.println(canBuyWithNewMeaning);
    }
}