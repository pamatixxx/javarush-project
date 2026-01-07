package ru.javarush.java.core.level15.task10;

public class StudentProfile {
    private int studentAge;

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public StudentProfile(int studentAge) {
        this.studentAge = studentAge;
    }
}
