package ru.javarush.java.core.level11.task16;

public class Solution {

    // Метод для преобразования строки в число с пробросом исключения NumberFormatException
    public static int convertToGoldAmount(String playerInput)  throws NumberFormatException{
        // Используем Integer.parseInt для преобразования строки в число
        return Integer.parseInt(playerInput);
    }

    public static void main(String[] args) {
        // Пробуем преобразовать некорректную строку в число
        try {
            convertToGoldAmount("adfa");
        }catch (NumberFormatException e){
            System.out.println("Игрок ввел неверное значение. Ошибка преобразования числа.");
        }
    }
}