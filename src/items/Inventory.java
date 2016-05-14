package items;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    // fields
    private Map<String, Boolean> items;

    // constructor
    public Inventory() {
	items = new HashMap<>();
	items.put("keg", false);
	items.put("person", false);
	items.put("phone", true);
	items.put("water", false);
	items.put("juice", false);
	items.put("peter michael", false);
	items.put("dildo", false);
    }

    // methods
    public void showInventory() {
	System.out.println("Items in your inventory: ");
	int i = 1;
	for (String item : items.keySet()) {
	    if (items.get(item) == true) {
		System.out.println(i + ". " + item);
		i++;
	    }
	}
	System.out.println();
    } // void showInventory()

    public void addItem(String item) {
	items.put(item, true);
    } // void addItem(String item)

    public void use(String item) {
	if (items.containsKey(item)) {
	    System.out.println("You use " + item + ".");
	} else {
	    System.out.println("There is no " + item + " to use.");
	}
    } // void use(String item)

}
