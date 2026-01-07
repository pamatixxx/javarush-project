package ru.javarush.java.core.level50.task06;

import java.util.EventListener;

// Интерфейс для обработки магических импульсов
public interface MagicalPulseListener extends EventListener {
    void onMagicalPulse(MagicalPulseEvent pulse);
}