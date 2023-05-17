package com.company;

public class Battlefield {
    private Player player1;
    private Player player2;

    public Battlefield(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
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
}
