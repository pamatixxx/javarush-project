package ru.javarush.java.core.level03.task16;

public class Solution {
    public static void main(String[] args) {
        // Исходные данные
        int yourAge = 25;
        boolean hasJob = true, hasCreditHistory = false, hasGuarantor = true;

        // Кредит одобрят, если (возраст > 21 и есть работа) ИЛИ (есть кредитная история и поручитель)
        System.out.println(yourAge>21 && hasJob || (hasCreditHistory && hasGuarantor));

        // Кредит одобрят, если (возраст > 21) И (есть работа ИЛИ кредитная история) И (есть поручитель)
        System.out.println(yourAge>21 && (hasJob ||hasCreditHistory) && hasGuarantor);
    }
}