import java.io.IOException;
import java.net.URISyntaxException;

import environment.*;
import items.*;
import userInput.*;

public class TextAdventure {

    /**
     * driver for program
     * @param args
     * @throws IOException
     * @throws URISyntaxException
     */
    public static void main(String[] args) throws IOException, URISyntaxException {
	// create initial setup
	Parser parser = new Parser();
	Inventory inventory = new Inventory();
	House fairgrounds = new House();
	Room current = fairgrounds.getRoom(1);

	// variables subject to change based on user input
	int newRoomIndex;
	Command command;
	String subject;
	int turn = 1;
	int itemUseStatus;

	// print greet message an initial environment.
	greet();
	System.out.println(current.getDescription());

	// infinite loop for command input
	while (true) {

	    // set up user input
	    System.out.print(turn++ + ":  ");
	    command = parser.readInput();

	    if (command != null) {
		subject = command.getSubject();

		switch (command.getAction()) {
		// follow command
		case WAIT:
		    // if wait returns consequences, end game
		    if (current.waitTurn() == -1) { command.setAction(Action.QUIT); }
		    break;
		case GO:
		    // set next index and check if valid
		    newRoomIndex = current.goTo(subject);
		    if (newRoomIndex != -1) {
			current = fairgrounds.getRoom(newRoomIndex);
			System.out.println(current.getDescription());
		    } else { System.out.println("You cannot go that way."); }
		    break;
		case TALK:
		    current.talkTo(subject);
		    break;
		case PICK:
		    // add item to inventory if available
		    Item pickUp = current.pickUp(subject);
		    if (pickUp != null) { inventory.addItem(pickUp); }
		    break;
		case USE:
		    // find itemstatus from using item
		    itemUseStatus = inventory.use(subject);
		    // if using item breaks player, end game
		    if (itemUseStatus == -1) { command.setAction(Action.QUIT); }
		    // in the case of using the hammer in the kitchen, open the kitchen door
		    else if (itemUseStatus == 1 && current.getClass().equals(Kitchen.class)) {
			((Kitchen) current).openSouth();
			System.out.println("You break down the door in the kitch, "
				+ "opening up the Porch to the south.");
		    }
		    break;
		case ATTACK:
		    // if attacking the object hurts the user, end the game
		    if (current.attack(subject) == -1) { command.setAction(Action.QUIT); }
		    break;
		case LOOK:
		    // lets the user observe an object
		    current.lookAt(subject);
		    break;
		case INVENTORY:
		    // lists the items in the player's inventory
		    inventory.showInventory();
		    break;
		case LOCATION:
		    // displays the location the user is in.
		    System.out.println("You are in the " + current.getName());
		case QUIT:
		    break;
		}
	    }
	    System.out.println();
	    // game ends if Action is QUIT or the player enters Sixth street
	    if ((command != null && command.getAction() == Action.QUIT) ||
		    current.getClass().equals(Sixth.class)) {
		break;
	    }
	}

	printScore();
    }

    /**
     * greeting message to the user to introduce them to game
     */
    public static void greet() {
	// welcome user
	System.out.println("Hello, welcome to our party text adventure.");
	System.out.println("Get ready for the time of your life.\n");
    }

    /**
     * prints the ending score to the user.
     */
    public static void printScore() {
	System.out.println("Score:  " + (int) Math.floor(Math.random() * 400));
    }
}
