package ru.javarush.java.core.level26.task04;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список (ArrayList) для названий фильмов
        List filmList = new ArrayList();
        // Добавляем фильмы в список
        filmList.add("Титаник");
        filmList.add("Матрица");
        filmList.add("Интерстеллар");
        // по ошибке добавили снова
        filmList.add("Матрица");
        // Ищем первое вхождение "Матрица"
        System.out.println(filmList.indexOf("Матрица"));

        // Проверяем наличие "Аватар" в списке
        System.out.println(filmList.contains("Аватар"));
        // contains возвращает true/false


        // Очищаем список
        filmList.removeAll(filmList);

        // Выводим содержимое списка после очистки — должен быть пустым: []
        System.out.println(filmList);
    }
}