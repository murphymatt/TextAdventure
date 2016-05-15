package items;

public class Hammer extends Item {

	public Hammer(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int use() {
		System.out.println("You use the hammer to try to break down every door in sight.");
		return 1;
	}

}
