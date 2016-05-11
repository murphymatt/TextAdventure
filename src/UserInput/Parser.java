package UserInput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {

	List<String> commands;
	
	public Parser() {
		commands = new ArrayList<>();
		commands.add("wait");
		commands.add("go");
		commands.add("talk to");
		commands.add("pick up");
		commands.add("use");
		commands.add("attack");
		commands.add("look at");
	}
	public void getInput(){
		Scanner in = new Scanner(System.in);
		String input = in.nextLine().toLowerCase();

		String action;
		String auxillary;
		
		for (String command : commands) {
			if (input.contains(command)) {
				action = command;
			}
		}
	}
}
