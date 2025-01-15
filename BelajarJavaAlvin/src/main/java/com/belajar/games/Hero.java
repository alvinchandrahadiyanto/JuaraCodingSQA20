package com.belajar.games;

public class Hero {
    private String name;
    private int mana;
    private int blood;
    private int xPosition = 0;
    private int yPosition = 0;
    private Skill skill;

    Hero(String name, int mana, int blood, Skill skill) {
        this.name = name;
        this.mana = mana;
        this.blood = blood;
        this.skill = skill;
    }

    void run(int xPosition, int yPosition) {
        this.xPosition += xPosition;
        this.yPosition += yPosition;
    }

    void hit(int decrementValue) {
        blood -= decrementValue;
    }

    void decreaseMana(int decrease) {
        mana -= decrease;
    }

    void attack(int code, Hero target) {
        if (code == 1) {
            // pakai skill 1
            if (this.mana>=skill.getSkill1()){
                target.damage(target, skill.getSkill1());
                decreaseMana(skill.getSkill1());
            }else {
                System.out.println(this.name+" mana less than "+ skill.getSkill1());
            }
        } else if (code == 2) {
            // pakai skill 2
            if (this.mana>=skill.getSkill2()){
                target.damage(target, skill.getSkill2());
                decreaseMana(skill.getSkill2());
            }else {
                System.out.println(this.name+" mana less than "+ skill.getSkill2());
            }
        } else {
            // pakai skill 3
            if (this.mana>=skill.getSkill3()){
                target.damage(target, skill.getSkill3());
                decreaseMana(skill.getSkill3());
            }else {
                System.out.println(this.name+" mana less than "+ skill.getSkill3());
            }
        }
    }

    void damage(Hero target, int hitDamage) {
        target.hit(hitDamage);
    }

    public int getBlood() {
        return blood;
    }

    public int getMana() {
        return mana;
    }
}