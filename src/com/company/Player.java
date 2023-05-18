package com.company;

public class Player {
    private int health;
    private int position;
    private String name;

    public Player(String name){
        this.name = name;
        this.health = (int)(Math.random()*7)+3;
        this.position = (int)(Math.random()*3);
    }

    public void Move(){
        this.position = (int)(Math.random()*3);
    }

    public boolean isFighting(Player enemy){
        return this.position == enemy.position;
    }

    public void Damage(Player enemy) {
        int damage = (int)(Math.random()*7);
        this.health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getPosition(){
        return position;
    }
}

