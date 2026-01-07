package ru.javarush.java.core.level18.task06;

public class Multiplier {
//    public int multiply(int i, int i1) {
//        return Integer.parseInt(String.valueOf(multiplyUniversal(i, i1)));
//    }
//
//    public int multiply(double i, double i1) {
//        return Integer.parseInt(String.valueOf(multiplyUniversal(i, i1)));
//    }


    public int multiply(int a, int b) {
        return a*b;
    }

    public double multiply(double a, double b) {
        return  a*b;
    }

    public <V extends Number> double multiplyUniversal(V i, V i1) {
        return i.doubleValue() * i1.doubleValue();
    }
}
