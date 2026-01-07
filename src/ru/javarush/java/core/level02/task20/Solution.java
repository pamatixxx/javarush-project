package ru.javarush.java.core.level02.task20;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения данных с консоли
        Scanner scanner = new Scanner(System.in);

        // Считываем имя пользователя (строка)
        String userName = scanner.nextLine();

        // Считываем возраст пользователя (целое число)
        int userAge = scanner.nextInt();

        // Выводим отформатированную визитную карточку

        System.out.println("Меня зовут " + userName + ", мне " + userAge + " лет.");
    }
}