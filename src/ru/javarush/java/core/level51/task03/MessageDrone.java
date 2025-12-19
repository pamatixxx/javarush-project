package ru.javarush.java.core.level51.task03;

public class MessageDrone implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from MessageDrone!");
    }
}
