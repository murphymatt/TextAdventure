package environment;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import items.Item;

/**
 * second room player enters in adventure.
 * Only available after talking to PM 5 times.
 * 
 * contains a hammer object
 * @author mattmurphy
 *
 */
public class Dance extends Room {

    // constructor
    public Dance(String name, String description, int north, int south, int east, int west, List<Item> items,
	    List<RoomObject> objects) {
	super(name, description, north, south, east, west, items, objects);
    }

    /**
     * waiting in room turns on background music for the game.
     */
    @Override
    public int waitTurn() throws IOException, URISyntaxException {
	System.out
		.println("Loud EDM from 2009 plays, people are grinding and dancing. You remember middle school love.");
	if (Desktop.isDesktopSupported()) {
	    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
	}
	return 0;
    }

}
