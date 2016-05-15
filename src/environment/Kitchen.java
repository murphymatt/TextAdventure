package environment;

import java.util.List;

import items.Item;

public class Kitchen extends Room {

	private boolean canGoSouth = false;

	public Kitchen(String name, String description, int north, int south, int east, int west, List<Item> items,
			List<RoomObject> objects) {
		super(name, description, north, south, east, west, items, objects);
		// TODO Auto-generated constructor stub
	}

	/**
	 * changes the room the user is in
	 * 
	 * @param direction
	 * @return new room for user to enter
	 */
	public int goTo(String direction) {
		if (direction.toLowerCase().contains("north")) {
			return north;
		} else if (direction.toLowerCase().contains("south")) {
			if (canGoSouth) {
				return south;
			} else {
				System.out.println("The door to the south seems to be boarded up.");
			}
		} else if (direction.toLowerCase().contains("east")) {
			return east;
		} else if (direction.toLowerCase().contains("west")) {
			return west;
		}
		return -1;

	} // Room goTo(String direction)
	
	public void openSouth() {
		this.canGoSouth = true;
	}

}
