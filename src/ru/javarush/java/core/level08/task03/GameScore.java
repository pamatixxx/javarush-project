package ru.javarush.java.core.level08.task03;

public class GameScore {
    // Приватный общий счет для всей игры — доступен только внутри класса
    private static int totalGameScore;

    // Увеличиваем счет на 1 каждый раз, когда игрок собирает монетку
    public static void collectCoin() {
        totalGameScore++;
    }

    // Выводим текущий общий счет на экран
    public static void displayCurrentScore() {
        System.out.println(totalGameScore);
    }

    public static void main(String[] args) {
        // Игрок собрал три монетки
        collectCoin();
        collectCoin();
        collectCoin();

        // Показываем текущий счет
        displayCurrentScore();
    }
}