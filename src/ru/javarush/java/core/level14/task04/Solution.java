package ru.javarush.java.core.level14.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаем два объекта Student и сразу инициализируем их поля через конструктор
        Student first = new Student("Анна", 2022);
        Student second = new Student("Иван", 2023);

        // Выводим информацию о каждом студенте в заданном формате
        System.out.println(format(first));
        System.out.println(format(second));

    }

    public static String format(Student student) {
        return "Имя: " + student.studentName + ", год поступления: " + student.enrollmentYear;
    }
}
