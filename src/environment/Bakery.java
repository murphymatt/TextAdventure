package environment;

import java.util.List;

import items.Item;

public class Bakery extends Room {

	private int kushCounter = 1;
	private boolean canLeave = false;

	public Bakery(String name, String description, int north, int south, int east, int west, List<Item> items,
			List<RoomObject> objects) {
		super(name, description, north, south, east, west, items, objects);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int goTo(String direction) {
		// user can only leave if the canLeave field is true
		if (canLeave) {
			if (direction.toLowerCase().contains("north")) {
				return north;
			} else if (direction.toLowerCase().contains("south")) {
				return south;
			} else if (direction.toLowerCase().contains("east")) {
				return east;
			} else if (direction.toLowerCase().contains("west")) {
				return west;
			} else {
				return -1;
			}
		} else {
			System.out.println("There are no open doors in this room. Try talking to the person in the corner.");
			return -1;
		}
	} // Room goTo(String direction)

	@Override
	public void talkTo(String object) {
		for (RoomObject obj : objects)
			if (object.contains(obj.getName())) {
				// after talking enough, user can leave
				if (obj.talkTo() == 1) {
					canLeave = true;
					objects.remove(0);
					setDescription("The room is still hazy. Something seems to be missing in the corner.");
				}
				return;
			}
		System.out.println("There is no " + object + " to talk to.");
	}

	@Override
	public int waitTurn() {
		if (kushCounter >= 5) {
			System.out.println("You asphyxiate and your mom picks you up and takes you home.");
			return -1;
		} else {
			kushCounter++;
			System.out.println("Inhale... exhale....");
			return 1;
		}
	}

}
