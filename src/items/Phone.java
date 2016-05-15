package items;

public class Phone extends Item {

	public Phone(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int use() {
		System.out.println("You call you mom to pick you up.");
		System.out.println("You leave the party and go home to get a good night's sleep.");
		return -1;
	}

}
