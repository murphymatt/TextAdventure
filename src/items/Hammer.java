package items;

/**
 * hammer class used as a key to advance onto porch
 * @author mattmurphy
 *
 */
public class Hammer extends Item {

    // constructor
    public Hammer(String name, String description) {
	super(name, description);
	// TODO Auto-generated constructor stub
    }

    /**
     * @return progressive item status.
     * When used in kitchen, allows user to progress south.
     */
    @Override
    public int use() {
	System.out.println("You use the hammer to try to break down every door in sight.");
	return 1;
    }

}
