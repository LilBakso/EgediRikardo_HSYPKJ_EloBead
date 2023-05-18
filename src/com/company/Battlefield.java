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
    public static String buildField(int fieldsize,Player player1, Player player2){
        StringBuilder battlefield = new StringBuilder();

        for (int i = 0; i < fieldsize; i++){
            if(i == player1.getPosition() && i == player2.getPosition()) battlefield.append("X");
            else if (i == player1.getPosition()) battlefield.append("H");
            else if (i == player2.getPosition()) battlefield.append("V");
            else battlefield.append("_");
        }
        battlefield.append("-->\tHarcos élete:"+player1.getHealth()+"\tVarázsló élete:"+player2.getHealth());
        return  battlefield.toString();
    }
}
