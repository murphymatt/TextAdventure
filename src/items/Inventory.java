package items;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    // fields
    private Map<Item, Boolean> items;

    // constructor
    public Inventory() {
	items = new HashMap<>();
	Item keg = new Item("Keg", "beer");
	items.put(keg, false);
	Item phone = new Item("Phone", "yours");
	items.put(phone, true);
	Item water = new Item("Water", "thirsty");
	items.put(water, false);
	Item juice = new Item("Juice", "thirstier");
	items.put(juice, false);
    }

    // methods
    public void showInventory() {
	System.out.println("Items in your inventory: ");
	int i = 1;
	for (Item item : items.keySet()) {
	    if (items.get(item) == true) {
		System.out.println(i + ". " + item.getName());
		i++;
	    }
	}
    } // void showInventory()

    public void addItem(Item item) {
	items.put(item, true);
    } // void addItem(String item)

    public void use(String itemName) {
	for (Item item : items.keySet()) {
	    if (itemName.contains(item.getName())) {
		System.out.println(item.getDescription());
		System.out.println("You use " + item.getName() + ".");
		return;
	    }
	}
	System.out.println("There is no " + itemName + " to use.");
    } // void use(String item)

}
