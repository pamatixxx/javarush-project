package ru.javarush.java.core.level04.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения данных с консоли

        Scanner scanner = new Scanner(System.in);
        // Сумма всех введенных стоимостей
        int salary = 0;
        while (true) {
            int sc = scanner.nextInt();
            if (sc < 0) break;
            else salary += sc;
        }
        System.out.println(salary);
    }
}