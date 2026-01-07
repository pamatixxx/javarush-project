package ru.javarush.java.core.level14.task05;

public class Car {
    String carBrand;
    int productionYear;

    public Car(String carBrand, int productionYear) {
        this.carBrand = carBrand;
        this.productionYear = productionYear;
    }

    public void displayDetails() {
        System.out.println("Марка: " + this.carBrand + ", год выпуска: " + this.productionYear);
    }
}
