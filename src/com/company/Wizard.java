package com.company;

public class Wizard extends Player{

    public Wizard(String name) {
        super(name, new Dice(4), (int)(Math.random()*3));
        this.setHealth(dice.Throw());
    }
    public void damageOverTime(Player enemy){
            enemy.setHealth(enemy.getHealth()-1);
    }
}
