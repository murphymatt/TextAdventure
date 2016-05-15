package environment;

import java.util.List;

import items.Item;

public class Bakery extends Room {

	public Bakery(String name, String description, Room north, Room south, Room east, Room west, List<Item> items,
			List<RoomObject> objects) {
		super(
				"Bakery", 
				"Theres a lot of dank kush here.", 
				null, null, null, null, 
				null, null);
		// TODO Auto-generated constructor stub
	}

}
