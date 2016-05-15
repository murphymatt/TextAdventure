package items;

public class Water extends Item {

	public Water(String name, String description) {
		super(name, description);
	}

	@Override
	public int use() {
		System.out.println("You take a sip from your trusty water bottle.");
		System.out.println("People give you funny looks.");
		return 0;
	}

}
