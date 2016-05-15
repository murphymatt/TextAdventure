import environment.Room;
import items.Inventory;
import items.Item;
import userInput.Action;
import userInput.Command;
import userInput.Parser;

public class TextAdventure {

	public static void main(String[] args) {
		// create initial setup
		Parser parser = new Parser();
		Inventory inventory = new Inventory();
		inventory.showInventory();
		Room current = new Room("Room", "First", null, null, null, null, null, null);

		Command command;
		String subject;

		// print greet message
		greet();

		// infinite loop for command input
		while (true) {
			command = parser.readInput();
			if (command != null) {
				subject = command.getSubject();

				switch (command.getAction()) {
				// follow command
				case WAIT:
					current.waitTurn();
					break;
				case GO:
					current.goTo(subject);
					break;
				case TALK:
					current.talkTo(subject);
					break;
				case PICKUP:
					Item pickUp = current.pickUp(subject);
					if (pickUp != null) {
						inventory.addItem(pickUp);
					}
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
			if (command != null && command.getAction() == Action.QUIT) { break; }
		}

		printScore();
	}

	public static void greet() {
		// welcome user
		System.out.println("Hello, welcome to our party text adventure.");
		System.out.println("Get ready for the time of your life.\n");
	}

	public static void printScore() {
		System.out.println("Score:  ");
	}
}
