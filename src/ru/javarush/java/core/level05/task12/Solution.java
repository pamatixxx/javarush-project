package ru.javarush.java.core.level05.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int dragonHp = 50;
        int knightHits = 10;
        Scanner console = new Scanner(System.in);
        System.out.print("Вы напали на спящего дракона - дракон расстроился");

        // цикл боя
        while (knightHits > 0 && dragonHp > 0) {
            // Игрок указывает силу удара
            System.out.print("Сила удара (1-10): ");
            int powerHit = 0;

            while (powerHit<1 || powerHit>10){
                powerHit = console.nextInt();
            }

            // Если слишком сильно или слишком слабо - то промах
            dragonHp -= powerHit;
            knightHits--;

             if (dragonHp <= 0) {
                System.out.println("Дракон повержен!");
                break;
            }
        }
        if (knightHits == 0 && dragonHp > 0) System.out.println("Рыцарь проиграл!");
    }
}