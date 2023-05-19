package com.company;

public class Player {
    protected Dice d6;
    protected int health;
    protected int position;
    protected String name;

    public Player(String name){
        this(name, new Dice(6), (int)(Math.random()*3));
    }
    public Player(String name, Dice dice, int position){
        this.name = name;
        this.d6 = dice;
        this.health = d6.Throw()+3;
        this.position = position;
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

