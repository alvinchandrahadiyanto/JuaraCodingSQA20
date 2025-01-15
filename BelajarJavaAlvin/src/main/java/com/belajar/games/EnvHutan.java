package com.belajar.games;

public class EnvHutan {

    public static void main(String[] args) {

        Hero kagura = new Hero(
                "Kagura",
                100,
                100,
                new Skill(
                        10,
                        20,
                        30));

        Hero nana = new Hero(
                "Nana",
                100,
                100,
                new Skill(
                        5,
                        10,
                        15));

        System.out.println("Health NANA BEFORE: " + nana.getBlood());
        System.out.println("Health KAGURA BEFORE: " + kagura.getBlood());
        System.out.println("KAGURA MANA BEFORE: " + kagura.getMana());
        kagura.attack(3, nana);
        kagura.attack(3, nana);
        kagura.attack(3, nana);
        kagura.attack(2, nana);
        kagura.attack(1, nana);
        System.out.println("Health NANA AFTER: " + nana.getBlood());
        System.out.println("Health KAGURA AFTER: " + kagura.getBlood());
        System.out.println("KAGURA MANA AFTER: " + kagura.getMana());
    }
}
