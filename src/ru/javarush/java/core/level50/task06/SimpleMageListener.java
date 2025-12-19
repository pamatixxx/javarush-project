package ru.javarush.java.core.level50.task06;

// Класс, реализующий интерфейс MagicalPulseListener
public class SimpleMageListener implements MagicalPulseListener {

    @Override
    public void onMagicalPulse(MagicalPulseEvent pulse) {
        System.out.println("Магический импульс получен: " + pulse.getMessage());
    }
}