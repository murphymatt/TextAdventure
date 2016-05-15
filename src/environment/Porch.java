package environment;

import java.util.List;

import items.Item;

public class Porch extends Room {

	public Porch(String name, String description, int north, int south, int east, int west, List<Item> items,
			List<RoomObject> objects) {
		super(name, description, north, south, east, west, items, objects);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void talkTo(String object) {
		for (RoomObject obj : objects)
			if (object.contains(obj.getName())) {
				// after talking enough, user can leave
				obj.talkTo();
				return;
			}
		System.out.println("There is nobody to talk to.");
	}
	
	public int waitTurn() {
		System.out.println("The night is cold, there is a light on inside but you ignore it. There is a person to your right.");
		return 0;
	}

}
