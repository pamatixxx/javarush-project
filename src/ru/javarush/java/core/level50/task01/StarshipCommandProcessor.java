package ru.javarush.java.core.level50.task01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StarshipCommandProcessor implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Основной модуль Starship успешно активирован!");
    }
}
