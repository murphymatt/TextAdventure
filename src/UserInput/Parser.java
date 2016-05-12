package UserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Environment.Room;

public class Parser {

    Room currentRoom;
    Scanner in;

    public Parser() {
	Scanner in = new Scanner(System.in);
    }

    public void readInput() {
	String input = in.nextLine().toLowerCase();

	// choose command based on inputted text
	if (input.contains("wait")) {
	    currentRoom.waitTurn();
	} else if (input.contains("go")) {
	    currentRoom.goTo(input.substring("go".length()).trim());
	} else if (input.contains("talk to")) {
	    currentRoom.talkTo(input.substring("talk to".length()).trim());
	} else if (input.contains("pick up")) {
	    currentRoom.pickUp(input.substring("pick up".length()).trim());
	} else if (input.contains("use")) {
	    currentRoom.pickUp(input.substring("use".length()).trim());
	} else if (input.contains("attack")) {
	    currentRoom.attack(input.substring("attack".length()).trim());
	} else if (input.contains("look at")) {
	    currentRoom.lookAt(input.substring("look at".length()).trim());
	} else {
	    System.out.println("You dont know how to " + input + ".");
	}
    }
}
