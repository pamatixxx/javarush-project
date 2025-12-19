package ru.javarush.java.core.level06.task04;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную secretSpellCode типа int и присваиваем ей значение 8364
        int secretSpellCode = 8364;

        // Явно приводим число secretSpellCode к типу char и сохраняем в revealedSymbol
        char revealedSymbol = (char) secretSpellCode;

        // Выводим символ, соответствующий коду 8364
        System.out.println("Символ с кодом 8364: " + revealedSymbol);

        // Объявляем переменную enigmaticLetter типа char и присваиваем ей символ 'Ж'

        char enigmaticLetter = 'Ж';


        // Явно приводим символ enigmaticLetter к типу int и сохраняем в numericEssenceOfLetter
        int numericEssenceOfLetter = (int) enigmaticLetter;

        // Выводим числовой код символа 'Ж'
        System.out.println("Код символа 'Ж': " + numericEssenceOfLetter);
    }
}