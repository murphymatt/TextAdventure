package environment;

public class Person extends RoomObject {

	private String[] dialogue;
	private int talkNum;
	
	public Person(String name, String description, int start) {
		super(name, description);
		talkNum = start;
		dialogue = new String[8];
		dialogue[0] = "Hey man, how's going? I'm Peter Michael!";
		dialogue[1] = "Have you finshed the assignment yet?";
		dialogue[2] = "I was at the gym earlier watching Hamza work out.";
		dialogue[3] = "I can bench more than him *flexes subtly*";
		dialogue[4] = "Uh, nevermind about all that stuff before. I am gonna leave the party, "
				+ "see you later. *opens door and leaves to the west*";
		dialogue[5] = "Hey, I remember you, so much nicer out here am I right?";
		dialogue[6] = "Be careful if you want to go to Main Hall across the street, security is everywhere.";
		dialogue[7] = "It's 2:35AM, but its 5 o'clock somewhere am I right?";
	}
	
	@Override
	public int talkTo() {
		System.out.println(dialogue[talkNum++]);
		if(talkNum == 8) { 
			talkNum = 7;
		}
		if (talkNum == 5) { return 1; }
		return 0;
	}

	@Override
	public int attack() {
		System.out.println("PM - No. Don't attack me.");
		return 0;
	}

}
