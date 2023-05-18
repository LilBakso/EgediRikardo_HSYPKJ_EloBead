package com.company;

public class Player {
    private Dice d6;
    private int health;
    private int position;
    private String name;

    public Player(String name){
        this.name = name;
        this.d6 = new Dice(6);
        this.health = d6.Throw()+3;
        this.position = (int)(Math.random()*3);
    }

    public void Move(){
        this.position = (int)(Math.random()*3);
    }

    public boolean isFighting(Player enemy){
        return this.position == enemy.position;
    }

    public void Damage(Player enemy) {
        int damage = d6.Throw();
        enemy.setHealth(enemy.getHealth()-damage);
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPosition(){
        return position;
    }
}

