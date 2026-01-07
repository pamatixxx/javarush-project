package ru.javarush.java.core.level28.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем изменяемый список с начальными значениями
        List<Integer> list = new ArrayList<>(Arrays.asList(5, -3, 8, -1, 0, 4, -7));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer n = iterator.next();
            if (n < 0){
                iterator.remove();
            }
        }

        System.out.println(list);
        // Обходим список с помощью Iterator, чтобы безопасно удалять элементы во время обхода


        // Выводим обновленный список без отрицательных чисел

    }
}