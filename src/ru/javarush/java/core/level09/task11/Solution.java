package ru.javarush.java.core.level09.task11;

public class Solution {
    public static void main(String[] args) {
        // Исходная строка
        String word = "programming";

        // Извлечение подстроки "gram" с помощью метода substring()
        System.out.println(word.substring(word.indexOf("gram"), word.indexOf("gram") + 4));
    }
}