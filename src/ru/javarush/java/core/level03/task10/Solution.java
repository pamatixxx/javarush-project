package ru.javarush.java.core.level03.task10;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и присваиваем счёт нашей команды и соперника
        int ourScore = 12, opponentScore = 10;
        boolean weWon = ourScore > opponentScore ? true : false;

        // weWon — результат логического сравнения: true, если наш счёт больше

        System.out.println(weWon);
    }
}