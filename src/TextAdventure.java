import environment.Room;
import items.Inventory;
import userInput.Command;
import userInput.Parser;

public class TextAdventure {

    public static void main(String[] args) {
	// create initial setup
	Parser parser = new Parser();
	Inventory inventory = new Inventory();
	inventory.showInventory();
	Room current = new Bakery();
	
	Command command;
	String subject;
	
	// print greet message
	greet();
	
	// infinite loop for command input
	do {
	    command = parser.readInput();
	    switch(command.getAction()) {
	    string subject = command.getSubject();
	    // follow command
	    case WAIT:		current.waitTurn();
	    			break;
	    case GO:		current.goTo(subject);
	    			break;
	    case TALK:		current.talkTo(subject);
	    			break;
	    case PICKUP: 	current.pickUp(subject);
	    			break;
	    case USE:		inventory.use(subject);
	    			break;
	    case ATTACK:	current.attack(subject);
	    			break;
	    case LOOK:		current.lookAt(subject);
	    			break;
	    case INVENTORY:	inventory.showInventory();
	    			break;
	    case QUIT:		break;
	    }
	} while (command.getAction != QUIT);
	
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
