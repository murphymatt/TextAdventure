package items;

public class SoloCup extends Item {

	private int drinksTaken;

	public SoloCup(String name, String description) {
		super(name, description);
		this.drinksTaken = 0;
	}

	public int use() {
		drinksTaken++;
		System.out.println("Hydrating... ");
		if (drinksTaken >= 8) {
			System.out.println(
					"You are a champion." + " You pass out and wake up the next day feeling refreshed and healthy.");
			return -1;
		}
		return 1;
	}
}
