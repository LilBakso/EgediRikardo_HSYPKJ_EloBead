package com.company;

public class Battlefield {
    private Player player1;
    private Player player2;
    private int fieldsize;

    public Battlefield(){
        player1 = new Player("Harcos");
        player2 = new Player("Varazslo");
        fieldsize = 3;
    }
}
