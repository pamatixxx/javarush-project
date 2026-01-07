package ru.javarush.java.core.level50.task05;

import java.util.EventObject;

public class MagicalPulseEvent extends EventObject {
    private String pulse;

    public MagicalPulseEvent(Object source, String message) {
        super(source);
        pulse = message;

    }

    public String getPulseMessage() {
     return pulse;
    }
}
