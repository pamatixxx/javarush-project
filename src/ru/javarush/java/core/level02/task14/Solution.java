package ru.javarush.java.core.level02.task14;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную projectName и задаем ей исходное название проекта
        String projectName = "Java";
        String newProjectName = projectName;

        // Изменяем значение копии названия проекта
        newProjectName = "Java Programming";
        System.out.println(projectName);
        System.out.println(newProjectName);

    }
}