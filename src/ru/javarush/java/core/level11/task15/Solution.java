package ru.javarush.java.core.level11.task15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {

    public static void extractFirstLineFromData(String dataFile) throws FileNotFoundException, IOException {
        // Создаем FileReader для чтения файла
        FileReader reader = new FileReader(dataFile);
        
        // Оборачиваем FileReader в BufferedReader для построчного чтения
        BufferedReader bufferedReader = new BufferedReader(reader);
        
        // Читаем первую строку из файла
        bufferedReader.readLine();
    }

    public static void main(String[] args) {
        
    }
}