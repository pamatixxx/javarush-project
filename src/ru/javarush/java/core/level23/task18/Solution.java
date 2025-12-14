package ru.javarush.java.core.level23.task18;

public class Solution {
    // Осмысленные имена полей
    public int count = 10;
    public String text = "Привет";

    // Переименованный метод: чётко указывает, что выводит сообщение


    public static void main(String[] args) {
        // Создаем объект и вызываем метод для демонстрации результата
        Solution app = new Solution();
        app.printMessage();
    }

    private void printMessage() {
        System.out.println(text + " " + count);
    }
}