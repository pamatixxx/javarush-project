package ru.javarush.java.core.level15.task20;

public class UserProfile {
    private String userIdentifier;

    public UserProfile() {
        System.out.println("Создан профиль без имени.");
    }

    public UserProfile(String initialName) {
        System.out.println( "Создан профиль с именем: " + initialName);
    }

    {
        userIdentifier = "DEFAULT_REG_ID";
        System.out.println("Временный ID пользователя присвоен.");
    }
}
