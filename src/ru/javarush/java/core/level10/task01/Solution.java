package ru.javarush.java.core.level10.task01;

public class Solution {
    public static void main(String[] args) {
        // Строковое представление очков игрока (например, считано из файла)
        String playerScoreText = "500";

        // Преобразуем строку в int, используя класс-обёртку Integer
        int actualPlayerScore = Integer.parseInt(playerScoreText);

        // Выводим результат, чтобы проверить успешность преобразования
        System.out.println(actualPlayerScore);
    }
}