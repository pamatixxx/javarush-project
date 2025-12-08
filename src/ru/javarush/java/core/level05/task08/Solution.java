package ru.javarush.java.core.level05.task08;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаём Scanner для чтения данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Считываем три целых числа — длительности трёх путей в минутах
        int first = scanner.nextInt(), second = scanner.nextInt(), third = scanner.nextInt();

        List<Integer> list = Arrays.asList(first,second,third);
        Collections.sort(list);
        // Определяем минимальную длительность среди трёх значений
        System.out.println(list.get(0));
    }
}