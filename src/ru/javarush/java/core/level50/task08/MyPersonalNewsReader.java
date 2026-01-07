package ru.javarush.java.core.level50.task08;

public class MyPersonalNewsReader implements TechNewsSubscriber {
    @Override
    public void receiveBreakingNews(String latestNewsHeadline) {
        System.out.println("Новая лента: " + latestNewsHeadline);
    }
}
