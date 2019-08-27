package main;

public class Game {

	public final static boolean OUTPUT = true;
	public final static boolean STATS = true;
	
	public static void main(String[] args) {
		
		Hero Good = new Warrior("Dudley Do Right", 10, 5, 10);
		Hero Villian = new Warrior("Wrongly Not Correct", 7, 5, 20);
		
		Battle(Good, Villian);
	}
	
	public static int Battle(Hero A, Hero B) {
		
		while(true) {			

			if(STATS) { 
				String a_block = A.getName() + ": " +  A.getHealth() + "/100";
				String b_block = B.getName() + ": " +  B.getHealth() + "/100";
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
				if(OUTPUT) { System.out.println(A.getName() + " attacks " + B.getName()); }
				B.take_damage(A.attack());
			}
			if(B.turn()) {
				if(OUTPUT) { System.out.println(B.getName() + " attacks " + A.getName()); }
				A.take_damage(B.attack());
			}
		}
	}

}
