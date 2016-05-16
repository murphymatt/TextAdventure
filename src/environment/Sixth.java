package environment;

import java.util.List;

import items.Item;

/**
 * game ends upon enter sixth ave
 * @author mattmurphy
 *
 */
public class Sixth extends Room {

    public Sixth(String name, String description, int north, int south, int east, int west,
	    List<Item> items,
	    List<RoomObject> objects) {
	super(name, description, north, south, east, west, items, objects);
    }

}
