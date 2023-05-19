package com.company;

public class Battlefield {
    private Fighter fighter;
    private Wizard wizard;

    public Battlefield(Fighter fighter, Wizard wizard){
        this.fighter = fighter;
        this.wizard = wizard;
    }

    public void Move(){
        fighter.Move();
        wizard.Move();
    }

    public void Fight(){
        if (fighter.isFighting(wizard)){
            System.out.println("Harc!");
            if (!fighter.isBlocking()){
                wizard.Damage(fighter);
            }
            fighter.Damage(wizard);
        }
        else{
            System.out.println("ÉGETÉS!!!");
            wizard.damageOverTime(fighter);
        }
    }

    public static String buildField(int fieldsize,Fighter fighter, Wizard wizard){
        StringBuilder battlefield = new StringBuilder();

        for (int i = 0; i < fieldsize; i++){
            if(i == fighter.getPosition() && i == wizard.getPosition()) battlefield.append("X");
            else if (i == fighter.getPosition()) battlefield.append("F");
            else if (i == wizard.getPosition()) battlefield.append("W");
            else battlefield.append("_");
        }
        battlefield.append("-->\t"+fighter.getName()+" élete:"+fighter.getHealth()+"\t"+wizard.getName()+" élete:"+wizard.getHealth());
        return  battlefield.toString();
    }

    public void result(Fighter fighter, Wizard wizard){
        if(fighter.getHealth()<=0 && wizard.getHealth() <= 0) System.out.println("Mindkét karakter meghalt!");
        else if (fighter.getHealth() > 0 && wizard.getHealth() <= 0) System.out.println("Harcos nyert!");
        else if (fighter.getHealth() <= 0 && wizard.getHealth() > 0) System.out.println("Varázsló nyert!");
        else System.out.println("A harc folytatódik\n");
    }
}
