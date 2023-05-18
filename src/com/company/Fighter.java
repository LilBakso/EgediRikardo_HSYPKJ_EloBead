package com.company;

//Warrior hp kétszeres + block esély

public class Fighter extends Player {
    private int health;
    private Dice dice;
    private int block;

    public Fighter(String name) {
        super(name);
        this.dice = new Dice(6);
        this.health = 2*dice.Throw();
    }

    public boolean isBlocking(){
        int block = dice.Throw();
            if (block > 3) {
                System.out.println("Harcos blokkolta az ütést!");
                return true;
            }
            else{
                System.out.println("Harcos nem tudta blokkolni az ütést");
            }
        return false;
    }

}
