package ru.javarush.java.core.level15.task12;

public class SchoolStudent {
    private int currentAge;

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int potentialAge) {
        if (potentialAge>=0) this.currentAge = potentialAge;
        else System.out.println("Внимание! Возраст студента не может быть отрицательным. Значение не обновлено.");
    }

    public SchoolStudent(int currentAge) {
        this.currentAge = currentAge;
    }
}
