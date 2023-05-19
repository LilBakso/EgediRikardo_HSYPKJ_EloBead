package com.company;

public class Fighter extends Player {

    public Fighter(String name) {
        super(name, new Dice(6), (int)(Math.random()*3));
        this.setHealth(dice.Throw()+ dice.Throw());
    }

    public boolean isBlocking(){
        int block = dice.Throw();
        return block > 3;
    }
}
