package ru.javarush.java.core.level02.task12;

public class Solution {
    public static void main(String[] args) {
        // Очки приходят как текстовые строки с отрицательными числами
        String firstNum = "-10", secondNum = "-25";
        System.out.println(Integer.parseInt(firstNum) + Integer.parseInt(secondNum));
    }
}