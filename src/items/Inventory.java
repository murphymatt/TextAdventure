package items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * inventory. Contains a list of items that the user has picked up
 * 
 * @author mattmurphy
 *
 */
public class Inventory {

    // fields
    private List<Item> items;

    // constructor
    public Inventory() {
	items = new ArrayList<>();
	Item phone = new Phone("phone", "You can call your mom if you want.");
	items.add(phone);
    }

    // methods
    /**
     * lists the items in the users inventory
     */
    public void showInventory() {
	System.out.println("Items in your inventory: ");
	int i = 1;
	for (Item item : items) {
	    System.out.println(i++ + ". " + item.getName());
	}
    } // void showInventory()

    /**
     * adds item to the player's inventory
     * 
     * @param item
     */
    public void addItem(Item item) {
	items.add(item);
    } // void addItem(String item)

    /**
     * uses the an item if inside the inventory
     * @param itemName
     * @return
     */
    public int use(String itemName) {
	for (Item item : items) {
	    if (itemName.contains(item.getName())) {
		return item.use();
	    }
	}
	System.out.println("There is no " + itemName + " to use.");
	return 0;
    } // void use(String item)

}
