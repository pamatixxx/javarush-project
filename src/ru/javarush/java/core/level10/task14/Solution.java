package ru.javarush.java.core.level10.task14;

// Перечисление с четырьмя временами года
enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;
}

public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа Season и присваиваем ей значение SUMMER
        Season season = Season.SUMMER;

        // Для каждого сезона выводим свое жизнерадостное сообщение

        switch (season){
            case SUMMER -> System.out.println("Лето — время отпусков!");
            case WINTER -> System.out.println("Пора кататься на лыжах!");
            case SPRING -> System.out.println("Выйди на улицу, цветы пахнут!");
            case AUTUMN -> System.out.println("Листья осыпаются с деревьев!");
        }
    }
}