package Environment;

import java.util.List;

import Items.Inventory;

public class Room {

	// fields
	
	// associated descriptions of the room
	String name;
	String description;
	Inventory userInventory;
	
	// adjacent rooms to current room
	Room north;
	Room south;
	Room east;
	Room west;
	
	// user can pick up items
	List<String> items;
	
	// user can interact with objects
	List<String> objects;
	
	// constructor
	public Room(String name, String description, 
			Room north, Room south, Room east, Room west,
			List<String> items, List<String> objects) {
		this.name = name;
		this.description = description;
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
		this.items = items;
		this.objects = objects;
	}
	
	// methods
	public void describeRoom() {
		System.out.println("The room is rather " + description + ".");
	} // void describeRoom()
	
	// user actions
	
	public void waitTurn() {
		System.out.println("You wait while the people around you continue to party.");
	} // void waitTurn()
	
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
	
	public void talkTo(String object) {
		if (this.objects.contains(object)) {
			System.out.println("You talk to " + object + ".");
		} else {
			System.out.println("There is no " + object + " to talk to.");
		}
	} // void talkTo(String object)
	
	public void pickUp(String item) {
		if (items.contains(item)) {
			System.out.println("You picked up the " + item + ".");
			items.remove(item);
			userInventory.addItem(item);
		} else {
			System.out.println("There is no " + item + " in the " + name + ".");
		}
	} // String pickUp(String item)
	
	public void attack(String object) {
		if (this.objects.contains(object)) {
			System.out.println("You attack " + object + ".");
		} else {
			System.out.println("There is no " + object + " to attack.");
		}
	} // void attack(String object)
	
	public void lookAt(String object) {
		if (this.objects.contains(object)) {
			System.out.println("You look at " + object + ".");
		} else {
			System.out.println("There is no " + object + " in the room");
		}
	} // void lookAt(String object)
	
}
