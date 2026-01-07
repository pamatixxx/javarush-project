package ru.javarush.java.core.level49.task02;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {
        // Исходные числовые показатели
        List<Integer> metrics = List.of(3, 8, 15, 22, 7);

        // Predicate: отбираем только значимые показатели (> 10)
        Predicate<Integer> predicate = s -> s > 10;

        // Function: превращаем число в строку "Число: X"
        Function<Integer, String> function = s -> "Число: " + s;

        // Consumer: выводим строку на экран (немедленно для каждого элемента)
        Consumer<String> consumer = System.out::println;

        // Проходим по списку: фильтрация -> преобразование -> вывод
        for (Integer metric : metrics) {
            if (predicate.test(metric)){
                consumer.accept(function.apply(metric));
            }
        }

        // Supplier: генерация бонусного числа в диапазоне [1; 100]
        Supplier<Integer> supplier = () -> 1 + new Random().nextInt(100);


        // Выводим результат бонуса (используем тот же Consumer для единообразия)
        consumer.accept("Бонусное число: " + supplier.get());

    }
}