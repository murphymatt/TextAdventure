package environment;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import items.Item;

public class Room {

    // fields

    // associated descriptions of the room
    private String name;
    private String description;

    // adjacent rooms stored as indices to access in house array
    protected int north, south, east, west;

    // user can pick up items
    protected List<Item> items;

    // user can interact with objects
    protected List<RoomObject> objects;

    // constructor
    public Room(String name, String description, int north, int south, int east, int west, List<Item> items,
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

    /**
     * 
     * @param s,
     *            set description
     */
    public void setDescription(String s) {
	this.description = s;
    }

    /**
     * 
     * @return name of Room
     */
    public String getName() {
	return name;
    }

    /**
     * 
     * @return description of room
     */
    public String getDescription() {
	return description;
    }

    // user actions

    /**
     * waits a turn, state of room may change depending on the room
     * 
     * @throws URISyntaxException
     * @throws IOException
     */
    public int waitTurn() throws IOException, URISyntaxException {
	System.out.println("You wait while the people around you continue to party.");
	return 1;
    } // void waitTurn()

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
	    return south;
	} else if (direction.toLowerCase().contains("east")) {
	    return east;
	} else if (direction.toLowerCase().contains("west")) {
	    return west;
	} else {
	    return -1;
	}
    } // Room goTo(String direction)

    /**
     * Returns any available dialogue associated with object
     * 
     * @param object
     */
    public void talkTo(String object) {
	for (RoomObject obj : objects)
	    if (object.contains(obj.getName())) {
		obj.talkTo();
		return;
	    }
	System.out.println("There is no " + object + " to talk to.");
    } // void talkTo(String object)

    /**
     * adds item to user inventory if it exists in room
     * 
     * @param item
     */
    public Item pickUp(String item) {
	for (Item itm : items) {
	    if (item.contains(itm.getName())) {
		System.out.println("You picked up the " + itm.getName() + ".");
		System.out.println(itm.getDescription());
		items.remove(itm);
		return itm;
	    }
	}
	System.out.println("There is no " + item + " in " + name + ".");
	return null;
    } // String pickUp(String item)

    /**
     * allows the user to attack an object in the room if it exists
     * 
     * @param object
     */
    public int attack(String object) {
	for (RoomObject obj : objects) {
	    if (object.contains(obj.getName())) {
		int status = obj.attack();
		if (status == 1) {
		    objects.remove(obj);
		}
		return status;
	    }
	}
	System.out.println("There is no " + object + " to attack.");
	return 0;
    } // void attack(String object)

    /**
     * allows the user to identify the characteristics of an object in the room
     * 
     * @param object
     */
    public void lookAt(String object) {
	for (RoomObject obj : objects) {
	    if (object.contains(obj.getName())) {
		System.out.println("You look at " + object + ".");
		System.out.println(obj.getDescription());
		return;
	    }
	}
	System.out.println("There is no \'" + object + "\' in the room");
    } // void lookAt(String object)
}
