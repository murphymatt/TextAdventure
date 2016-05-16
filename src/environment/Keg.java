package environment;

/**
 * 
 * @author mattmurphy
 *
 * Simple room object class, attacking object quits game.
 */
public class Keg extends RoomObject {

    public Keg(String name, String description) {
	super(name, description);
    }

    @Override
    public int talkTo() {
	System.out.println("You pour out your dreams and woes to the keg, but it does not respond...");
	return 0;
    }

    @Override
    public int attack() {
	System.out.println("You break your foot. Your mother comes and takes you to the hospital.");
	return -1;
    }

}
