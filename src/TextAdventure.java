import java.io.IOException;
import java.net.URISyntaxException;

import environment.*;
import items.*;
import userInput.*;

public class TextAdventure {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// create initial setup
		Parser parser = new Parser();
		Inventory inventory = new Inventory();
		House fairgrounds = new House();
		Room current = fairgrounds.getRoom(1);

		int newRoomIndex;
		Command command;
		String subject;
		int turn = 1;
		int itemUseStatus;

		// print greet message
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
					if (current.waitTurn() == -1) {
						command.setAction(Action.QUIT);
					}
					break;
				case GO:
					newRoomIndex = current.goTo(subject);
					if (newRoomIndex != -1) {
						current = fairgrounds.getRoom(newRoomIndex);
						System.out.println(current.getDescription());
					} else {
						System.out.println("You cannot go that way.");
					}
					break;
				case TALK:
					current.talkTo(subject);
					break;
				case PICK:
					Item pickUp = current.pickUp(subject);
					if (pickUp != null) {
						inventory.addItem(pickUp);
					}
					break;
				case USE:
					itemUseStatus = inventory.use(subject);
					if(itemUseStatus == -1) {
						command.setAction(Action.QUIT);
					} else if (itemUseStatus == 1 && current.getClass().equals(Kitchen.class)) {
						((Kitchen) current).openSouth();
						System.out.println("You break down the door in the kitch, opening up the Porch to the south.");
					}
					break;
				case ATTACK:
					if (current.attack(subject) == -1) {
						command.setAction(Action.QUIT);
					}
					break;
				case LOOK:
					current.lookAt(subject);
					break;
				case INVENTORY:
					inventory.showInventory();
					break;
				case LOCATION:
					System.out.println("You are in the " + current.getName());
				case QUIT:
					break;
				}
			}
			System.out.println();
			if ((command != null && command.getAction() == Action.QUIT) || current.getClass().equals(Sixth.class)) {
				break;
			}
		}

		printScore();
	}

	public static void greet() {
		// welcome user
		System.out.println("Hello, welcome to our party text adventure.");
		System.out.println("Get ready for the time of your life.\n");
	}

	// prints ending score
	public static void printScore() {
		System.out.println("Score:  " + (int) Math.floor(Math.random() * 400));
	}
}
