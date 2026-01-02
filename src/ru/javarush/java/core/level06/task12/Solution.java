package ru.javarush.java.core.level06.task12;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную actualFrequency и присваиваем ей значение 0.1 + 0.2

        double actualFrequency = 0.1 + 0.2;
        // Объявляем переменную targetFrequency и присваиваем ей значение 0.3
        double targetFrequency = 0.3;

        // Объявляем переменную tolerance и задаем ей значение 0.000001
        double tolerance = 0.000001;

        // Вычисляем абсолютную разницу между actualFrequency и targetFrequency
        double absolute = Math.abs(actualFrequency - targetFrequency);

        // Сравниваем разницу с допуском и выводим соответствующее сообщение

        if (absolute < tolerance) {
            System.out.println("Лазер откалиброван с допустимой точностью");
        } else {
            System.out.println("Требуется дополнительная калибровка");
        }
    }
}