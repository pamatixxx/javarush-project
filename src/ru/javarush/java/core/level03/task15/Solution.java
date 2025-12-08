package ru.javarush.java.core.level03.task15;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем переменные для условий допуска

        boolean hasInvitation = true, dressCodeMet = false, passwordIsCorrect = true;
        // Основное логическое выражение без дополнительных скобок
        boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect;

        // Выражение с группировкой первых двух условий
        boolean firsGrouped =  (hasInvitation && dressCodeMet) && passwordIsCorrect;

        // Выражение с группировкой последних двух условий
        boolean secondGrouped = hasInvitation && (dressCodeMet && passwordIsCorrect);

        // Выводим результаты всех трёх выражений на экран
        System.out.println(admitted);
        System.out.println(firsGrouped);
        System.out.println(secondGrouped);

    }
}