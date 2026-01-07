package ru.javarush.java.core.level50.task08;

import java.util.ArrayList;

public class TechNewsAgency {
    ArrayList<TechNewsSubscriber> subscribers = new ArrayList<>();

    public void subscribe(TechNewsSubscriber subscriber) {
        subscribers.add(subscriber);
    }


    public void unsubscribe(TechNewsSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void broadcastNews(String newContent) {
    subscribers.forEach(subscriber -> subscriber.receiveBreakingNews(newContent));
    }
}
