package ru.javarush.java.core.level09.task15;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две строковые переменные с начальными значениями
        String first = "apple";
        String second = "banana";

        String temp  = "";
        // Сравниваем строки лексикографически:
        System.out.println(first.compareTo(second));
temp = first;
first = second;
second = temp;
        // Меняем значения переменных местами
        System.out.println(second.compareTo(first));

        // Повторяем сравнение после обмена

    }
}