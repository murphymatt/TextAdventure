package environment;

import java.util.List;

import items.Item;

public class Bakery extends Room {
    
    public Bakery() {
	List<Item> items = new ArrayList<>();
	List<Object> objects = new ArrayList<>();
	super(
		"Bakery",
		"The room is very dank."
		+ "There is a strange filipino man in the corner",
		null, null, null, null,
		items, objects);
	// TODO Auto-generated constructor stub
    }

    // fields
    private String name = "Bakery";
    private String description = "The room is very dank."
    	+ " There is a strange filipino man in the corner.";
    
    private Room east = 

}
