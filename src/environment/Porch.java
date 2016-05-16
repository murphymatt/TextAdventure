package environment;

import java.util.List;

import items.Item;

/**
 * contains pm who warns user about travel
 * @author mattmurphy
 *
 */
public class Porch extends Room {

    public Porch(String name, String description, int north, int south, int east, int west,
	    List<Item> items,
	    List<RoomObject> objects) {
	super(name, description, north, south, east, west, items, objects);
    }

    /**
     * allows the user to talk to the person object on the porch.
     */
    @Override
    public void talkTo(String object) {
	for (RoomObject obj : objects)
	    if (object.contains(obj.getName())) {
		obj.talkTo();
		return;
	    }
	System.out.println("There is nobody to talk to by that name.");
    }

    /**
     * gives information to user about porch.
     * No dynamic changes.
     */
    public int waitTurn() {
	System.out.println(
		"The night is cold, there is a light on inside but you ignore it."
		+ " There is a person to your right.");
	return 0;
    }

}
