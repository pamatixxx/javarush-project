package ru.javarush.java.core.level10.task09;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения числа с клавиатуры
        Scanner console = new Scanner(System.in);
        int day = console.nextInt();

        // Используем классический switch для определения дня недели
        switch (day) {
            case (1) -> System.out.println("Понедельник");
            case (2) -> System.out.println("Вторник");
            case (3) -> System.out.println("Среда");
            default -> System.out.println("Неизвестный день");
        }
    }
}