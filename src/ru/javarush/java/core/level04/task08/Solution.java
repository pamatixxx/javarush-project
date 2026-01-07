package ru.javarush.java.core.level04.task08;

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        // Используем цикл for для одновременного изменения двух переменных
        for (int i = 1; i <= 5; i++) {
            System.out.println(x + " " + y);
            x++;
            y--;
        }
    }
}