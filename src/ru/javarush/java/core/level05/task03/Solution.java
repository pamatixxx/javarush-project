package ru.javarush.java.core.level05.task03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {


        // Просим пользователя ввести строку (послание)
        Scanner scanner = new Scanner(System.in);
        String magicMessage = scanner.nextLine();
        // Разворачиваем строку с помощью цикла for

        System.out.println(new StringBuilder(magicMessage).reverse());
        // Выводим инвертированную строку

    }
}