package userInput;

import java.util.Scanner;

public class Parser {

    // field
    Scanner in;

    // constructor
    public Parser() {
	in = new Scanner(System.in);
    }

    // method
    /**
     * reads input from user
     * @return command, created from action enum and subject substring from user input
     */
    public Command readInput() {
	//user inputs text
	String input = in.nextLine().toLowerCase();
	
	Action action;
	String subject;
	
	// choose command based on inputted text
	// 
	if (input.contains("wait")) {
	    action = Action.WAIT;
	} else if (input.contains("go")) {
	    action = Action.GO;
	} else if (input.contains("talk")) {
	    action = Action.TALK;
	} else if (input.contains("pick") || input.contains("take") || input.contains("grab")) {
	    action = Action.PICK;
	} else if (input.contains("use")) {
	    action = Action.USE;
	} else if (input.contains("attack") || input.contains("hunt") || input.contains("fight")) {
	    action = Action.ATTACK;
	} else if (input.contains("look")) {
	    action = Action.LOOK;
	} else if (input.contains("inventory") || input.contains("items") || input.contains("bag")) {
	    action = Action.INVENTORY;
	} else if (input.contains("where") || input.contains("location")) {
		action = Action.LOCATION;
	} else if (input.contains("quit") || input.contains("give up")) {
	    action = Action.QUIT;
	} else {
	    System.out.println("Sorry, I don't what \'" + input + "\' means.");
	    return null;
	}
	
	// parse subject from input (substring after action)
	subject = input.substring(action.toString().length()).trim();
	return new Command(action, subject);
    }
}
