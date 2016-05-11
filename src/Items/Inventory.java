package Items;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

	Map<String, Boolean> items;

	public Inventory() {
		items = new HashMap<>();
		items.put("keg", false);
		items.put("person", false);
		items.put("phone", false);
		items.put("water", false);
		items.put("juice", false);
		items.put("peter michael", false);
		items.put("dildo", false);
	}

	public void printItems() {
		System.out.println("Items in your inventory: ");
		int i = 1;
		for (String item : items.keySet()) {
			if (items.get(item) == true) {
				System.out.println(i + ". " + item);
				i++;
			}
		}
	}
	
	public void use(String item) {
		if (items.containsKey(item)) {
			System.out.println("using " + item);
		} else {
			System.out.println("There is no " + item + " to use.");
		}
	} // void use (String item)
}
