package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    	Fighter fighter = new Fighter("H");
    	Player varazslo = new Player("V");
	    Battlefield field = new Battlefield(fighter, varazslo);

	    while(fighter.getHealth() > 0 && varazslo.getHealth() > 0) {
			System.out.println("kör kezdete:");
			field.Fight();
			System.out.println(field.buildField(3, fighter, varazslo));
			field.result(fighter, varazslo);
	    	field.Move();
			Thread.sleep(1000);

		}
    }
}
