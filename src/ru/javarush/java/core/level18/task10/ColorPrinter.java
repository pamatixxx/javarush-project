package ru.javarush.java.core.level18.task10;

public class ColorPrinter extends Printer{

    @Override
    public void print(int i) {
        super.print(i);
    }

    @Override
    public void print(String message) {
        System.out.println("Цветная строка: " + message);
    }
}
