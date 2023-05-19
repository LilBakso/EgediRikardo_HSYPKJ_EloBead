package com.company;

public class Fighter extends Player {

    public Fighter(String name) {
        super(name, new Dice(6), (int)(Math.random()*3));
        this.setHealth(dice.Throw()+ dice.Throw());
    }

    public boolean isBlocking(){
        int block = dice.Throw();
            if (block > 3) {
                System.out.println("Harcos blokkolta az ütést");
                return true;
            }
            else{
                System.out.println("Harcos nem blokkolta az ütést");
                return false;
            }
    }
}
