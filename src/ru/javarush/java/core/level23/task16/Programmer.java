package ru.javarush.java.core.level23.task16;

public class Programmer extends Worker implements Reportable{

    public Programmer(String name) {
        super.employeeName = name;
    }

    public void work() {
        System.out.println("Программист пишет код");
    }

    public void report() {
        System.out.println("Программист сдаёт отчёт");
    }
}
