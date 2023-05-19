package com.company;

public class Main {
	/*
	* Alapfeladat: Harcos és Varázsló egy három mezős pályán, ha ugyanoda lépnek csatáznak.
	* Kiegészítés:
	* 	Öröklődés:
	* 		Fighter class: más élet mennyiség. tud blokkolni ütéseket,
	* 		Wizard class: más élet mennyiség. ha nem harcol, akkor folyamatosan égeti a Harcost,
	* 	Interface:
	* 		Comparable<> használata a két karakter poziciójának összehasonlítására.
	*/

    public static void main(String[] args) throws InterruptedException {
    	Fighter fighter = new Fighter("H");
    	Wizard wizard = new Wizard("V");
	    Battlefield field = new Battlefield(fighter, wizard);

	    while(fighter.getHealth() > 0 && wizard.getHealth() > 0) {
			System.out.println("kör kezdete:");
			field.Fight();
			System.out.println(field.buildField(3, fighter, wizard));
			field.result(fighter, wizard);
	    	field.Move();
			Thread.sleep(1000);
		}
    }
}
