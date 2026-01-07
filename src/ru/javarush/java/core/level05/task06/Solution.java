package ru.javarush.java.core.level05.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строки с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Проверяем палиндром двумя указателями: с начала и с конца
        String polly = scanner.nextLine();
        boolean flag = polly.equals(new StringBuilder(polly).reverse().toString()) ? true :false;

        if (flag) System.out.println("YES");
        else System.out.println("NO");

    }
}