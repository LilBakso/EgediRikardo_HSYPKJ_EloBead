package com.company;

public class Battlefield {
    private Fighter fighter;
    private Player player2;

    public Battlefield(Fighter fighter, Player player2){
        this.fighter = fighter;
        this.player2 = player2;
    }

    public void Move(){
        fighter.Move();
        player2.Move();
    }

    public void Fight(){
        if (fighter.isFighting(player2)){
            System.out.println("Harc!");
            if (!fighter.isBlocking()){
                player2.Damage(fighter);
            }
            fighter.Damage(player2);
        }
    }

    public static String buildField(int fieldsize,Player player1, Player player2){
        StringBuilder battlefield = new StringBuilder();

        for (int i = 0; i < fieldsize; i++){
            if(i == player1.getPosition() && i == player2.getPosition()) battlefield.append("X");
            else if (i == player1.getPosition()) battlefield.append("F");
            else if (i == player2.getPosition()) battlefield.append("W");
            else battlefield.append("_");
        }
        battlefield.append("-->\t"+player1.getName()+" élete:"+player1.getHealth()+"\t"+player2.getName()+" élete:"+player2.getHealth());
        return  battlefield.toString();
    }

    public void result(Player player1, Player player2){
        if(player1.getHealth()<=0 && player2.getHealth() <= 0) System.out.println("Mindkét karakter meghalt!");
        else if (player1.getHealth() > 0 && player2.getHealth() < 0) System.out.println("Harcos nyert!");
        else if (player1.getHealth() < 0 && player2.getHealth() > 0) System.out.println("Varázsló nyert!");
        else System.out.println("A harc folytatódik\n");

    }
}
