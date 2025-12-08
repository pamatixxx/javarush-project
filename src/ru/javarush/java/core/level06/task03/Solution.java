package ru.javarush.java.core.level06.task03;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа char для хранения загадочного символа руны
        char mysteryCharacter = 'Z';

        // Преобразуем символ в его числовой код (Unicode) и сохраняем в переменную decryptedCode
        int decryptedCode = mysteryCharacter;

        // Выводим результат исследования: строку и расшифрованный числовой код символа
        System.out.println("Код символа 'Z': " + decryptedCode);
    }
}