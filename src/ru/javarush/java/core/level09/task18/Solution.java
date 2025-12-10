package ru.javarush.java.core.level09.task18;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с исходной фразой
        StringBuilder builder = new StringBuilder("Привет, мир!");
        builder.insert(builder.indexOf(",") + 2, "Java ");
        // Находим позицию запятой
        System.out.println(builder);

        // В исходной строке после запятой стоит пробел,
        // поэтому вставляем после запятой и пробела (+2)


        // Вставляем подстроку "Java " (с пробелом в конце)


        // Выводим результат

    }
}