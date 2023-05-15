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

    public void Show(){
        System.out.println(name+"\t"+health+"\t"+position);
    }

    public boolean isFighting(Player enemy){
        return this.position == enemy.position;
    }

    public void Fight(Player enemy) {
        int damage = (int)(Math.random()*7);
        this.health -= damage;
    }
}
