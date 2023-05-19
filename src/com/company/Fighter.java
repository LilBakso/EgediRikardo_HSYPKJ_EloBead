package com.company;

public class Fighter extends Player {

    public Fighter(String name) {
        super(name, new Dice(6), (int)(Math.random()*3));
        this.setHealth(d6.Throw()+ d6.Throw());
    }

    public boolean isBlocking(){
        int block = d6.Throw();
            if (block > 5) {
                System.out.println("Harcos blokkolta az ütést!");
                return true;
            }
            else{
                System.out.println("Harcos nem tudta blokkolni az ütést");
                return false;
            }
    }

    @Override
    public int getHealth() {
        return health;
    }
}
