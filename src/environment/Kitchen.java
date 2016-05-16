package environment;

import java.util.List;

import items.Item;

/**
 * contains a door to the south that can only be accessed after using hammer
 * contains a keg and water
 * @author mattmurphy
 *
 */
public class Kitchen extends Room {

    private boolean canGoSouth;

    public Kitchen(String name, String description, int north, int south, int east, int west,
	    List<Item> items,
	    List<RoomObject> objects) {
	super(name, description, north, south, east, west, items, objects);
	canGoSouth = false;
    }

    /**
     * changes the room the user is in
     * user cannot go south until they use the hammer
     * 
     * @param direction
     * @return new room for user to enter
     */
    public int goTo(String direction) {
	if (direction.toLowerCase().contains("north")) {
	    return north;
	} else if (direction.toLowerCase().contains("south")) {
	    //user needs to use hammer object to call openSouth()
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

    /**
     * allows the user to travel south
     */
    public void openSouth() {
	this.canGoSouth = true;
    }

}
