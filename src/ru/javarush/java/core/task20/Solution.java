package ru.javarush.java.core.task20;

import java.time.LocalDate;
import java.time.Period;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект LocalDate для даты постройки здания: 20 марта 2000 года
        LocalDate date =  LocalDate.of(2000, 3, 20);
        
        // Получаем текущую дату
        LocalDate now = LocalDate.now();
        
        // Вычисляем полный период между датой постройки и сегодняшним днем
        Period.between(now,date);
        
        // Форматируем и выводим результат в формате "Возраст: X лет, Y месяцев, Z дней"

    }
}