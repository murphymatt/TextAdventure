package environment;

import java.util.List;

import items.Item;

public class Bakery extends Room {
	
	int i = 0;
	
	public Bakery(String name, String description, Room north, Room south, Room east, Room west, List<Item> items,
			List<RoomObject> objects) {
		super(
				"Bakery", 
				"Theres a lot of dank kush here.", 
				null, null, null, null, 
				null, null);
	}
	
	@Override
	public void waitTurn() {
		if (i >= 5) { System.out.println("You suffocate and die."); }
		else { 
			i++;
			System.out.println("You breath in the sweet nectar of kush"); 
		}
	}

}
