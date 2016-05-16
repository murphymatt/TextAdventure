package items;

/**
 * item user can pick up in game room
 * @author mattmurphy
 *
 */
public class SoloCup extends Item {

    // field
    private int drinksTaken;

    // constructor
    public SoloCup(String name, String description) {
	super(name, description);
	this.drinksTaken = 0;
    }

    // if user uses the cup more than 5 times, the game ends
    public int use() {
	drinksTaken++;
	System.out.println("Hydrating... ");
	if (drinksTaken >= 6) {
	    System.out.println(
		    "You are feeling sick." + 
	    " You pass out and wake up the next day feeling refreshed and healthy.");
	    return -1;
	}
	return 1;
    }
}
