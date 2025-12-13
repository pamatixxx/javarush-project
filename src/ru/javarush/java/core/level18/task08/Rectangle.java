package ru.javarush.java.core.level18.task08;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width) {
        this.width = width;
        this.height = width;
    }
}
