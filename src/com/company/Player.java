package com.company;

public class Player implements Comparable<Player>{
    protected Dice dice;
    protected int health;
    protected int position;
    protected String name;

    public Player(String name){
        this(name, new Dice(6), (int)(Math.random()*3));
    }
    public Player(String name, Dice dice, int position){
        this.name = name;
        this.dice = dice;
        this.health = dice.Throw()+3;
        this.position = position;
    }

    public void Move(){
        this.position = (int)(Math.random()*3);
    }

    public void Damage(Player enemy) {
        int damage = dice.Throw();
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

    @Override
    public int compareTo(Player player) {
        return this.getPosition() - player.getPosition();
    }
}

