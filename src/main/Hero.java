package main;

public interface Hero {
	static final int speedMax = 100;
	
	public String getName();
	
	public int attack();
	
	public void take_damage(int damage);
	
	public int getHealth();
	
	public boolean turn();
	
	public int tick();
}
