package environment;

import java.util.List;

import items.Item;

public class Kitchen extends Room {

    public Kitchen(String name, String description, int north, int south, int east, int west, List<Item> items,
	    List<RoomObject> objects) {
	super(name, description, north, south, east, west, items, objects);
	// TODO Auto-generated constructor stub
    }

}
