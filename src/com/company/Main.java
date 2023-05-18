package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    	Player harcos = new Player("H");
    	Player varazslo = new Player("V");
	    Battlefield field = new Battlefield(harcos, varazslo);

	    while(harcos.getHealth() > 0 && varazslo.getHealth() > 0) {
			System.out.println("kör kezdete:");
			field.Fight();
			System.out.println(field.buildField(3, harcos, varazslo));
			field.result(harcos, varazslo);
	    	field.Move();
			Thread.sleep(1000);
		}
    }
}
