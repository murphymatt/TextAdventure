package environment;

import java.util.List;

import items.Item;

/**
 * game room, contains one object and one item
 * No unique methods
 * @author mattmurphy
 *
 */
public class Game extends Room {

    public Game(String name, String description, int north, int south, int east, int west,
	    List<Item> items,
	    List<RoomObject> objects) {
	super(name, description, north, south, east, west, items, objects);
    }

}
