package com.company;

import java.util.Random;

public class Dice {
    private int side;
    private Random random;

    public Dice(int side){
        this.side = side;
        random = new Random();
    }

    public int Throw(){
        return random.nextInt(side) +1;
    }
}
