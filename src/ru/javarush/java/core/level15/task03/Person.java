package ru.javarush.java.core.level15.task03;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setMemberAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Ошибка: Возраст не может быть отрицательным. Значение не изменено.");
            return;
        }
        this.age = newAge;
    }

    public int getMemberAge() {
        return age;
    }

    public String getMemberName() {
        return name;
    }

    public void setMemberName(String name) {
        this.name = name;
    }
}
