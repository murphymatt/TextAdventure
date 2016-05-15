package items;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

	// fields
	private Map<Item, Boolean> items;

	// constructor
	public Inventory() {
		items = new HashMap<>();
		Item phone = new Phone("phone", "You can call your mom if you want.");
		items.put(phone, true);
		Item water = new Water("water", "It's your trusty water bottle that you left in the kitchen.");
		items.put(water, false);
		Item cup = new SoloCup("cup", "It is filled with nutritious fluids.");
		items.put(cup, false);
		Item hammer = new Hammer("hammer", "You can use it to break things.");
		items.put(hammer, false);
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

	public int use(String itemName) {
		for (Item item : items.keySet()) {
			if (itemName.contains(item.getName())) {
				return item.use();
			}
		}
		System.out.println("There is no " + itemName + " to use.");
		return 0;
	} // void use(String item)

}
