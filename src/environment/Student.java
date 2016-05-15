package environment;

public class Student extends RoomObject {

	private String[] dialogue;

	public Student(String n, String d) {
		super(n, d);
		dialogue = new String[3];
		dialogue[0] = "Man this party is bumpin!";
		dialogue[1] = "I am so attackable!!!";
		dialogue[2] = "ATTACK ME";
	}

	@Override
	public int talkTo() {
		int val = (int) Math.floor(Math.random() * 3);
		System.out.println(dialogue[val]);
		return 0;
	}

	@Override
	public int attack() {
		System.out.println(" Student - Hey man what are you doing? Wait stop!");
		System.out.println(" You - I have to do this I am sorry.");
		System.out.println(" Student - I am just an innocent partygoer aahhhhhh *muffeled screams*");
		System.out.println("\n The student is no longer present at the party.");
		return 1;
	}
}
