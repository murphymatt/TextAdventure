package environment;

import java.util.List;

import items.Item;

public class Bakery extends Room {

    private int kushCounter = 1;
    
    public Bakery(String name, String description, int north, int south, int east, int west, List<Item> items,
	    List<RoomObject> objects) {
	super(name, description, north, south, east, west, items, objects);
	// TODO Auto-generated constructor stub
    }

    @Override
    public void waitTurn() {
	if (kushCounter >= 5) {
	    System.out.println("You suffocate and die.");
	} else {
	    kushCounter++;
	    System.out.println("You breath in the sweet nectar of kush");
	}
    }

}
