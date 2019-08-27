package main;

public class Warrior implements Hero{
	
	private String name;
	private int speed, attack, defense;
	private int hp;
	
	int speedBuildUp;
	
	public Warrior(String name, int attack, int defense, int speed) {
		this.speed = speed;
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.hp = 100;
		
		speedBuildUp = 0;
	}
	
	public String getName() { return name; }
	
	public int attack() {
		return attack;
	}
	
	public void take_damage(int damage) {
		hp -= damage - defense;
	}
	
	public int getHealth() {
		return hp;
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
		
		if(hp <= 0) return -1;
		
		return 0;
	}
}
