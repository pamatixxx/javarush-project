package ru.javarush.java.core.level07.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем массив фиксированной длины 3 для любимых фильмов
        String [] favoriteMovies = new String[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        // Создаем Scanner для чтения строк с клавиатуры


        // Считываем три названия фильмов и сохраняем по порядку в массив
        for (int i = 0; i < 3 ;i++){
            favoriteMovies[i] = reader.readLine();
        }


        // Выводим фильмы в обратном порядке: третий, второй, первый
        for (int i = favoriteMovies.length-1; i >=0 ; i--) {
            System.out.println(favoriteMovies[i]);
        }

    }
}