package Environment;

import java.util.List;

import Items.Inventory;
import Items.Item;

public class Room {

    // fields

    // associated descriptions of the room
    private String name;
    private String description;
    private Inventory userInventory;

    // adjacent rooms to current room
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    // user can pick up items
    private List<Item> items;

    // user can interact with objects
    private List<RoomObject> objects;

    // constructor
    public Room(String name, String description, Room north, Room south, Room east, Room west, List<Item> items,
	    List<RoomObject> objects) {
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
	System.out.println(description);
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
	for (RoomObject obj : objects)
	    if (obj.getName().equals(object)) {
		System.out.println("You talk to " + obj.getName() + ".");
		System.out.println(obj.getDescription());
		return;
	    }
	System.out.println("There is no " + object + " to talk to.");
    } // void talkTo(String object)

    public void pickUp(String item) {
	for (Item itm : items) {
	    if (itm.getName().equals(item)) {
		System.out.println("You picked up the " + item + ".");
		System.out.println(itm.getDescription());
		items.remove(item);
		userInventory.addItem(item);
		return;
	    }
	}
	System.out.println("There is no " + item + " in the " + name + ".");
    } // String pickUp(String item)

    public void attack(String object) {
	for (RoomObject obj : objects) {
	    if (obj.getName().equals(object)) {
		System.out.println("You attack " + object + ".");
		System.out.println("The " + obj.getName() + " is attacked");
		return;
	    }
	}
	System.out.println("There is no " + object + " to attack.");
    } // void attack(String object)

    public void lookAt(String object) {
	for (RoomObject obj : objects) {
	    if (obj.getName().equals(object)) {
		System.out.println("You look at " + object + ".");
		System.out.println(obj.getDescription());
		return;
	    }
	}
	System.out.println("There is no " + object + " in the room");
    } // void lookAt(String object)
}
