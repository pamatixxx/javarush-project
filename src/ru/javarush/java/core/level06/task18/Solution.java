package ru.javarush.java.core.level06.task18;

public class Solution {
    public static void main(String[] args) {
        // Исходный символ агента — часть шифра
        char secretAgentLetter = 'G';

        // Явно приводим char к int, получаем числовой код символа

        int numericCode = secretAgentLetter;
        System.out.println(numericCode);

        // Явно приводим int обратно к char, восстанавливаем символ
        char decodedAgentLetter = (char) numericCode;
        System.out.println(decodedAgentLetter);
    }
}