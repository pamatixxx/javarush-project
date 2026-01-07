package ru.javarush.java.core.level48.task07;

public class Solution {
    // Метод greeter возвращает "инструкцию" (лямбду), которая запоминает имя
    // и позже, при вызове run(), выводит приветствие.
    public static Runnable greeter(String name) {
        // Лямбда захватывает значение параметра name (замыкание)
        return () -> System.out.println("Привет, " + name);
    }

    public static void main(String[] args) {
        // Готовим приветствие для "Анна", но пока не печатаем — только создаём задачу
        Runnable r =  greeter("Анна");
        // Выполняем подготовленную задачу: теперь прозвучит приветствие
        r.run();
    }
}