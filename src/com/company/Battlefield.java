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

    public void Move(){
        player1.Move();
        player2.Move();
    }

    public void Fight(){
        if (player1.isFighting(player2)){
            player1.Damage(player2);
            player2.Damage(player1);
        }
    }
    public int getSize(){
        return fieldsize;
    }
}
