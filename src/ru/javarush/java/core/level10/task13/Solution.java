package ru.javarush.java.core.level10.task13;

// Перечисление состояний светофора.
// Содержит ровно три значения: RED, YELLOW и GREEN.

enum TrafficSignalState{
    RED, YELLOW, GREEN
}


public class Solution {
    public static void main(String[] args) {
        // Создаём переменную типа TrafficSignalState и задаём начальное значение RED
        TrafficSignalState  trafficSignalState  = TrafficSignalState.RED;

        // Выводим текущее состояние светофора на экран
        System.out.println(trafficSignalState);
    }
}