package ru.javarush.java.core.level10.task17;

public class Solution {
    public static void main(String[] args) {
        // Числовой код HTTP-статуса
        int httpStatusCode = 200;

        // Новый синтаксис switch-выражения:
        String responseMessage;
        switch (httpStatusCode) {
            case 200 -> responseMessage = "OK";
            case 400, 404 -> responseMessage = "Ошибка клиента";
            case 500 -> responseMessage = "Ошибка сервера";
            default -> responseMessage = "Неизвестный код";
        }

        // Вывод результата на экран
        System.out.println(responseMessage);
    }
}