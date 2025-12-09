package ru.javarush.java.core.level09.task20;

public class Solution {
    public static void main(String[] args) {
        // Инициализация стартовой фразы в StringBuilder
        StringBuilder builder = new StringBuilder("Я люблю Java!");
        builder.delete(builder.indexOf("люблю"), builder.indexOf("люблю") + 5);
        builder.replace(builder.indexOf("Java"), builder.indexOf("Java") + 4, "программирование");
        // Удаление слова "люблю" с сохранением пробелов
        System.out.println(builder);
    }
}