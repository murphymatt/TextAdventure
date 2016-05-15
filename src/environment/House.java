package environment;

public class House {

    private Room[] rooms;
    
    public House() {
	rooms = new Room[6];
	rooms[0] = new Dance("Dance", "There's some loud music playing. It sucks.",
		-1, 2, 1, -1, null, null);
	rooms[1] = new Bakery("Bakery", "Theres some dank cush in here",
		-1, -1, -1, 0, null, null);
	rooms[2] = new Game("Game", "Theres some people playing die in the room here",
		0, -1, 3, -1, null, null);
	rooms[3] = new Kitchen("Kitchen", "Theres a keg by the counter and some people in the way",
		-1, 4, -1, 2, null, null);
	rooms[4] = new Porch("Porch", "There's some kids doing some pretty illegal things out here",
		3, 5, -1, -1, null, null);
	rooms[5] = new Sixth("Sixth", "Oh shit, you got hit. You dead.",
		-1, -1, -1, -1, null, null);
    }
    
    public Room getRoom(int index) {
	return rooms[index];
    }
    
}
