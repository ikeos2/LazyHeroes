package main;

import heroes.Hero;

public class TeamBattle {
	
	private Hero[] combineAndSortTeams(Hero[] TeamA, Hero[] TeamB) {
		Hero[] arr = new Hero[TeamA.length + TeamB.length];
		
		int i = 0;
		for(Hero h : TeamA) {
			arr[i++] = h;
		}
		for(Hero h : TeamB) {
			arr[i++] = h;
		}
		
		//Sort heroes slowest to fastest
		for(Hero element : arr) {
			
		}
		
		return arr;
	}
	
	public static int TeamBattle(Hero[] TeamA, Hero[] TeamB) {
		
		/**
		 * create list of all heroes, sorted by slowest hero first. 
		 * 
		 * while forever {
		 * 		for each hero (tick) { 
	 * 				if hero dead, remove from list.
	 * 				If no heroes left from this team, other team wins
		 * 		}
		 * 
		 * 		for each hero (turn) {
		 * 			if hero can take a turn, do so
		 * 			Have hero attack corresponding hero in slot, then the next, until all are dead
		 * 		}
		 * 
		 * }
		 * 
		 */
		
		Hero[] allHeroes = ArrayUtils.addAll(TeamA, TeamB);
		
		return 0;
	}
}

