package main;

import heroes.Hero;
import heroes.Warrior;

public class Game {

	public final static boolean OUTPUT = true;
	public final static boolean STATS = true;
	
	public static void main(String[] args) {
		
		Hero Good = new Warrior("Dudley Do Right", 100, 10, 5, 10);
		Hero Villian = new Warrior("Wrongly Not Correct", 125, 7, 5, 20);
		
		Battle(Good, Villian);
	}
	
	public static int Battle(Hero A, Hero B) {
		
		while(true) {			

			if(STATS) { 
				String a_block = A.getName() + ": " +  A.getCurrentHealth() + "/" + A.getMaxHealth();
				String b_block = B.getName() + ": " +  B.getCurrentHealth() + "/" + B.getMaxHealth();
				System.out.println(a_block + "\n" + b_block); 
			}
		
			if (A.tick() < 0) {
				if(OUTPUT) { System.out.println(A.getName() + " has defeated " + B.getName()); }
				return 1; 
			}
			if (B.tick() < 0) { 
				if(OUTPUT) { System.out.println(A.getName() + " has defeated " + B.getName()); }
				return -1;
			}
			
			if(A.turn()) {
				int damage = A.attack();
				if(OUTPUT) { System.out.println(A.getName() + " attacks " + B.getName() + " for " + damage); }
				B.take_damage(damage);
			}
			if(B.turn()) {
				int damage = B.attack();
				if(OUTPUT) { System.out.println(B.getName() + " attacks " + A.getName() + " for " + damage); }
				A.take_damage(damage);
			}
		}
	}

}
