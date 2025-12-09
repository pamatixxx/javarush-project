package ru.javarush.java.core.level15.task15;

public class ApplicationConfiguration {
    public static final String APPLICATION_DEFAULT_LANGUAGE;


    static {
        APPLICATION_DEFAULT_LANGUAGE = System.getenv("APP_LANG") != null ? System.getenv("APP_LANG") : "en";
    }
}
