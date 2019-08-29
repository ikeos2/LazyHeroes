package heroes;

import java.util.Random;

public class Warrior extends Hero{
	
	private String name;
	private int speed, attack, defense;
	private int maxHp, currentHp;
	
	int speedBuildUp;
	Random rand;
	
	public Warrior(String name, int hp, int attack, int defense, int speed) {
		this.speed = speed;
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.maxHp = hp;
		this.currentHp = hp;
		
		speedBuildUp = 0;
		rand = new Random();
	}
	
	public String getName() { return name; }
	
	public int attack() {
		int damage = rand.nextInt(attack) + 1;
		
		if(rand.nextInt(20) == 19) {
			damage *= 2;
		}
		return damage;
	}
	
	public void take_damage(int damage) {
		if(damage < 0) {
			currentHp += damage; // In case of healing
		} else {
			int totalDamage = damage - defense;
			currentHp -= (totalDamage < 0 ? 0 : totalDamage);
		}
	}
	
	public int getCurrentHealth() {
		return currentHp;
	}
	
	public int getMaxHealth() {
		return maxHp;
	}
	
	public boolean turn() {
		if (1.0 <= (speedBuildUp / speedMax)  ) {
			speedBuildUp -= speedMax;
			return true;
		} else {
			return false;
		}
		//return (1.0 <= (speedBuildUp / 100) ? true : false);
	}
	
	public int tick() {
		speedBuildUp += speed;
		
		if(currentHp <= 0) return -1;
		
		return 0;
	}
}
