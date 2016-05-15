package environment;

import items.Item;

public interface RoomInterface {

	public void describeRoom();

	public void waitTurn();

	public RoomInterface goTo(String direction);

	public void talkTo(String object);

	public Item pickUp(String item);

	public void attack(String object);

	public void lookAt(String object);

}
