package userInput;

import java.util.Scanner;

import environment.Room;
import items.Inventory;

public class Parser {

    Room currentRoom;
    Inventory userInventory;
    Scanner in;

    public Parser() {
	in = new Scanner(System.in);
    }

    public Command readInput() {
	//user inputs text
	// TODO: fix NullPointerException
	String input = in.nextLine().toLowerCase();
	
	Action action;
	String subject;
	
	// choose command based on inputted text
	if (input.contains("wait")) {
	    action = Action.WAIT;
	} else if (input.contains("go")) {
	    action = Action.GO;
	} else if (input.contains("talk to")) {
	    action = Action.TALK;
	} else if (input.contains("pick up")) {
	    action = Action.PICKUP;
	} else if (input.contains("use")) {
	    action = Action.USE;
	} else if (input.contains("attack")) {
	    action = Action.ATTACK;
	} else if (input.contains("look")) {
	    action = Action.LOOK;
	} else if (input.contains("inventory")) {
	    action = Action.INVENTORY;
	} else if (input.contains("where") || input.contains("location")) {
		action = Action.LOCATION;
	} else if (input.contains("quit")) {
	    action = Action.QUIT;
	} else {
	    System.out.println("Sorry, I don't what \'" + input + "\' means.");
	    return null;
	}
	
	subject = input.substring(action.toString().length());
	return new Command(action, subject);
    }
}
