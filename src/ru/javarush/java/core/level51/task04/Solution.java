package ru.javarush.java.core.level51.task04;

// Класс с точкой входа программы
public class Solution {
    public static void main(String[] args) {
        // Создаем "план действий" для стажёра — объект, реализующий Runnable
        TaskExecutor executor = new TaskExecutor();
        Thread thread = new Thread(executor);
        // "Нанимаем" рабочего — создаем новый поток и передаем ему план действий
        thread.start();
    }
}