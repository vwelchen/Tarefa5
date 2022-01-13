package Flyweight;

class CounterTerrorist implements Player {
	// Intr�nseco
	private final String TASK;

	// Extr�nseco
	private String weapon;

	public CounterTerrorist() {
		TASK = "DEFUSE THE BOMB";
	}

	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void mission() {
		System.out.println("\nCounter Terrorist | Weapon " + weapon + " | " + TASK);
	}
}
