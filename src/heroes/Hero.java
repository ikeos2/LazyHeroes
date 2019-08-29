package heroes;

public interface Hero {
	/**
	 * This is the universal time it takes to make a "turn"
	 * Each hero builds up their own speed and when they reach this magic number,
	 * they may take a turn.
	 */
	static final int speedMax = 100;
	
	/**
	 * Should just return the heroes name
	 * @return
	 */
	public String getName();
	
	/**
	 * The current amount of health a hero has
	 * @return The current amount of health a hero has
	 */
	public int getCurrentHealth();
	
	/**
	 * The maximum amount of health this hero can have
	 * @return hero's max health stat
	 */
	public int getMaxHealth();
	
	/**
	 * When called, this hero should calculate what attack it will make against
	 * a random opponent, return the raw value
	 * @return amount of damage to be dealt against opponent
	 */
	public int attack();
	
	/**
	 * Given the amount of damage, calculate how much this character should have applied
	 * based on *whatever*. Default is HP -= damage - defense, with a floor of 0.
	 * @param damage amount of damage hero is receiving
	 */
	public void take_damage(int damage);
	
	/**
	 * Used by main game loop to determine if this character is eligible to take turn
	 * this round. If so, returns true. Other game logic should be put in tick.
	 * 
	 * A hero is eligible to take a turn once their speed has exceeded the "maxSpeed"
	 * variable.
	 * 
	 * TODO: Maybe merge turn and tick into the same thing?
	 * @return
	 */
	public boolean turn();
	
	/**
	 * In addition to determining if the hero is currently alive or not,
	 * this method should be used to run any other game logic calculations
	 * for this hero.
	 * @return If the hero is currently alive or not(hp > 0)
	 */
	public int tick();
}
