package ru.javarush.java.core.level10.task18;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную droneCommand и присваиваем ей значение "pause"
        String droneCommand = "pause";

        // Используем современное switch-выражение для определения статуса дрона
        String droneStatusMessage;
        switch (droneCommand) {
            case "start" -> droneStatusMessage = "Запуск!";
            case "stop" -> droneStatusMessage = "Остановка!";
            case "pause" -> droneStatusMessage = "Пауза...";
            default -> droneStatusMessage = "Неизвестная команда";
        }

        // Выводим сообщение о статусе дрона на экран
        System.out.println(droneStatusMessage);
    }
}