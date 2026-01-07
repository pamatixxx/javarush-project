package ru.javarush.java.core.level15.task05;

public class UserCard {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserCard(String userName) {
        this.userName = userName;
    }
}
