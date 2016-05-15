package environment;

import java.util.ArrayList;
import java.util.List;

import items.*;

/* creates environment for the game */
public class House {

    private Room[] rooms;
    
    public House() {
	rooms = new Room[6];
	
	// create separate lists for items and roomobjects before instantiating each room
	
	Person pm = new Person("person", "A CS professor, he appears uncomcfortable at this party.",0);
	
	// Dance
	List<Item> dItems = new ArrayList<>();
	dItems.add(new Hammer("hammer", "It's weighty and can probably break down doors."));
	List<RoomObject> dObjects = new ArrayList<>();
	rooms[0] = new Dance("Dance Room", "There's some loud music playing. It sucks. For some reason, there's a hammer lying on the couch.",
		-1, 2, 1, -1, dItems, dObjects);
	
	// Bakery
	List<Item> bItems = new ArrayList<>();
	List<RoomObject> bObjects = new ArrayList<>();
	bObjects.add(pm);
	rooms[1] = new Bakery("Bakery", "Theres some haze in here and a person standing in the corner.",
		-1, -1, -1, 0, bItems, bObjects);
	
	// Game
	List<Item> gItems = new ArrayList<>();
	gItems.add(new SoloCup("cup", "it's red and filled with liquid."));
	List<RoomObject> gObjects = new ArrayList<>();
	gObjects.add(new Student("student", "Hat backwards, cup in hand. A very attackable person"));
	rooms[2] = new Game("Game Room", "There's some people playing die in the room here."
			+ " On the table, there is a single solo cup. Students mingle around the table.",
		0, -1, 3, -1, gItems, gObjects);
	
	// Kitchen
	List<Item> kItems = new ArrayList<>();
	kItems.add(new Water("water", "a cup of water"));
	List<RoomObject> kObjects = new ArrayList<>();
	kObjects.add(new Keg("keg", "heavy and full of beer"));
	rooms[3] = new Kitchen("Kitchen", "There\'s a keg by the counter and some people in the way.",
		-1, 4, -1, 2, kItems, kObjects);
	
	// Porch
	List<Item> pItems = new ArrayList<>();
	List<RoomObject> pObjects = new ArrayList<>();
	pObjects.add(pm);
	rooms[4] = new Porch("Porch", "There's some kids doing some pretty shady things out here. "
			+ "At the banister is a familiar person you have seen earlier.",
		3, 5, -1, -1, pItems, pObjects);
	
	// Sixth
	List<Item> sItems = new ArrayList<>();
	List<RoomObject> sObjects = new ArrayList<>();
	rooms[5] = new Sixth("Sixth Ave", "Oh bummer, you got hit by security asleep at the wheel. You are really dead.",
		-1, -1, -1, -1, sItems, sObjects);
    }
    
    public Room getRoom(int index) {
	return rooms[index];
    }
    
}
