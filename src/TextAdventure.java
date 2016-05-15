import environment.*;
import items.*;
import userInput.*;

public class TextAdventure {

	public static void main(String[] args) {
		// create initial setup
		Parser parser = new Parser();
		Inventory inventory = new Inventory();
		Room current = new Bakery("Room", "First", null, null, null, null, null, null);

		Room newRoom;
		Command command;
		String subject;
		int turn = 1;

		// print greet message
		greet();

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
					current.waitTurn();
					break;
				case GO:
					newRoom = current.goTo(subject);
					if (newRoom != null) { 
						current = newRoom;
						current.describeRoom();
					}
					break;
				case TALK:
					current.talkTo(subject);
					break;
				case PICKUP:
					Item pickUp = current.pickUp(subject);
					if (pickUp != null) { inventory.addItem(pickUp); }
					break;
				case USE:
					inventory.use(subject);
					break;
				case ATTACK:
					current.attack(subject);
					break;
				case LOOK:
					current.lookAt(subject);
					break;
				case INVENTORY:
					inventory.showInventory();
					break;
				case QUIT:
					break;
				}
			}
			System.out.println();
			if (command != null && command.getAction() == Action.QUIT) { break; }
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
		System.out.println("Score:  ");
	}
}
