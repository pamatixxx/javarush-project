package ru.javarush.java.core.level07.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив длиной 10 элементов
        int[] roundScores = new int[10];

        // Заполняем массив числами от 1 до 10 с помощью цикла
        for (int i = 1; i < 11; i++) {
            roundScores[i - 1] = i;
        }


        // Выводим все элементы массива в одну строку, разделяя их пробелом
        for (int i = 0; i < roundScores.length; i++) {
            System.out.print(
                    (i == roundScores.length - 1)
                            ? roundScores[i]
                            : roundScores[i] + " "
            );
        }// Выводим текущий элемент массива

        // Добавляем пробел между элементами, кроме последнего


    }
}