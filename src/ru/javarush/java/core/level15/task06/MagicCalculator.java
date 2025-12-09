package ru.javarush.java.core.level15.task06;

public class MagicCalculator {
    int firstNumber;
    int secondNumber;

    public MagicCalculator() {
    }


    private void displayInternalResult(int sum) {
        System.out.println("Внутренний результат: "  + sum);
    }

    public int addNumbers(int i, int y) {
        int sum = i+y;
        displayInternalResult(sum);;
        return sum;
    }
}
