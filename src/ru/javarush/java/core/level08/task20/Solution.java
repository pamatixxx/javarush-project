package ru.javarush.java.core.level08.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаём новую запись об ученике
        SchoolStudent newPupil = new SchoolStudent();

        // Имя можно присвоить напрямую — поле публичное
        newPupil.studentName = "Мария";

        // Возраст задаётся только через публичный метод (инкапсуляция)
        newPupil.setStudentAge(17);

        // Выведем аккуратный профиль ученика
        newPupil.displayStudentProfile();

        // Попытка прямого изменения приватного поля — это нарушение инкапсуляции.

        //newPupil.studentAge = 16; - тут будет ошибка , инкапсуляция
    }
}

// Класс описывает ученика школы
class SchoolStudent {
    public String studentName;
    // Имя ученика доступно всем — публичное поле


    // Возраст ученика — чувствительная информация, скрытая от прямого доступа
    private int studentAge;

    // Публичный метод позволяет корректно установить возраст
    public void setStudentAge(int ageToSet) {
        this.studentAge = ageToSet;
    }

    // Аккуратно выводим профиль ученика

    public void displayStudentProfile() {
        System.out.println(this.studentName + " " + this.studentAge);
    }
}