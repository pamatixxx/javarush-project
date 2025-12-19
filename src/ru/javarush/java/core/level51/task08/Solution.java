package ru.javarush.java.core.level51.task08;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        // Создаем три независимых "робота" с разными задачами и временем выполнения
        Thread runner1 = new Thread(new TaskRunner("runner1", 500), "runner1");
        Thread runner2 = new Thread(new TaskRunner("runner2", 1000),"runner2");
        Thread runner3 = new Thread(new TaskRunner("runner3", 2000),"runner3");

        // Устанавливаем каждому потоку уникальный приоритет
        runner1.setPriority(Thread.MAX_PRIORITY);
        runner2.setPriority(Thread.NORM_PRIORITY);
        runner3.setPriority(Thread.MIN_PRIORITY);

        // Запускаем все потоки — гарантируем, что каждый робот начнет выполнение своей задачи

        runner1.start();
        runner2.start();
        runner3.start();

        // Ждем завершения всех потоков, чтобы программа не завершилась раньше времени
    }
}

// Класс-исполнитель задачи, реализует логику одного "робота"
class TaskRunner implements Runnable {
    private final String taskName;   // название задачи
    private final long durationMs;   // время выполнения в миллисекундах

    // В конструктор передаем название задачи и время выполнения
    public TaskRunner(String taskName, long durationMs) {
        this.taskName = taskName;
        this.durationMs = durationMs;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread(); // получаем текущий поток для имени и приоритета

        // Сообщение о старте с указанием имени потока и его приоритета
        System.out.println(current.getName() + ": старт задачи " + taskName + " (приоритет " + current.getPriority() + ")");

        try {
            // Имитируем выполнение задачи
            Thread.sleep(durationMs);
        } catch (InterruptedException e) {
            // В учебной задаче просто сообщаем о прерывании и завершаем работу
            System.out.println(current.getName() + ": задача " + taskName + " прервана");
            return;
        }

        // Сообщение о завершении задачи
        System.out.println(current.getName() + ": завершена задача " + taskName);
    }
}