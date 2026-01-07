package ru.javarush.java.core.level50.task08;

public class Solution {
    public static void main(String[] args) {
        // Тестируем систему подписки и рассылки
        TechNewsAgency agency = new TechNewsAgency();
        MyPersonalNewsReader myReader = new MyPersonalNewsReader();

        // Подписываем ридер на агентство новостей
        agency.subscribe(myReader);

        // Появилась сенсационная новость — рассылаем всем подписчикам
        agency.broadcastNews("Java 25: Эра нового кода!");
    }
}