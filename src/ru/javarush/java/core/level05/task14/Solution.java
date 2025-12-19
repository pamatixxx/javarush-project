package ru.javarush.java.core.level05.task14;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Стартовые очки здоровья
        int knightHp = 100;
        int dragonHp = 50;

        // Дракон загадывает скрытый максимум удара 2..20
        Random rand = new Random();
        int dragonMax = rand.nextInt(19) + 2;

        // Ввод силы удара рыцаря
        Scanner console = new Scanner(System.in);
        System.out.println("Битва началась! У рыцаря 100 жизней, у дракона 50 жизней.");

        // Основной боевой цикл
        while (true) {
            // Ход рыцаря: промах, если превышает скрытый максимум
            int userMax = console.nextInt();
            while (userMax < 1 || userMax > 20) {
                userMax = console.nextInt();
            }
            if (userMax > dragonMax) System.out.println("Промах");
            else dragonHp -= userMax;
            printLife(knightHp, dragonHp);
            // Проверяем смерть дракона
            if (dragonHp<=0){
                System.out.println("Рыцарь победил!");
                break;
            }

            // Ход дракона: первая голова атакует

            int sumAttackDragon = 0;
            sumAttackDragon+=rand.nextInt(10) + 1;
            sumAttackDragon+=rand.nextInt(10) + 1;
            knightHp-=sumAttackDragon;
            // Ход дракона: вторая голова атакует
            if (knightHp<= 0){
                System.out.println("Дракон победил!");
                break;
            }
            printLife(knightHp, dragonHp);
        }
    }


    public static void printLife(int knightHp, int dragonHp) {
        System.out.println("Жизни рыцаря: " + knightHp);
        System.out.println("Жизни дракона: " + dragonHp);
    }
}