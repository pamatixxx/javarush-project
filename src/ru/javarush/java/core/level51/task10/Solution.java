package ru.javarush.java.core.level51.task10;

public class Solution {
    // Общая "рекламная строка" на билборде. Изначально показываем "Start".
    static String displayMessage = "Start";

    public static void main(String[] args) throws InterruptedException {
        int threadCount = 10;
        Thread[] threads = new Thread[threadCount];

        // Создаем 10 "агентств" — отдельных потоков
        for (int i = 0; i < threadCount; i++) {
            String threadName = "Thread-" + (i + 1);

            // Внутри потока: небольшая случайная пауза для усиления "гонки"
            threads[i] = new Thread(() -> {
                displayMessage = threadName;
            }, threadName);
        }

        // Запускаем все потоки почти одновременно
        for (Thread thread : threads) {
            thread.start();
        }

        // Дожидаемся завершения всех потоков

        for (Thread thread : threads) {
            thread.join();
        }
        // Печатаем итог: чье сообщение "успело" записаться последним
        System.out.println(displayMessage);
    }
}