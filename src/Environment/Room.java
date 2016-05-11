package Environment;

import java.util.List;

public class Room {

	// fields
	String name;
	String description;
	Room north;
	Room south;
	Room east;
	Room west;
	List<String> items;
	
	// constructor
	public Room(String name, String description, Room north, Room south, Room east, Room west) {
		this.name = name;
		this.description = description;
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
	}
	
	// methods
	public void describeRoom() {
		System.out.println("The room is rather " + description + ".");
	} // void describeRoom()
	
	public Room goTo(String direction) {
		if (direction.equals("north")) {
			return north;
		} else if (direction.equals("south")) {
			return south;
		} else if (direction.equals("east")) {
			return east;
		} else if (direction.equals("west")) {
			return west;
		} else {
			return null;
		}
	} // Room goTo(String direction)
	
	public String pickUp(String item) {
		if (items.contains(item)) {
			System.out.println("You picked up the " + item + ".");
			items.remove(item);
			return item;
		} else {
			System.out.println("There is no " + item + " in the " + name + ".");
			return null;
		}
	} // String pickUp(String item)
}
