import Environment.Room;

public class TextAdventure {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	greet();

    }

    public static void greet() {
	// welcome user
	System.out.println("Hello, welcome our party text adventure.");
	System.out.println("Get ready for the time of your life.");
    }

    public static Room[][] buildEnv() {
	Room[][] env = new Room[2][4];

	// build env
	env[0][0] = new Room("dance");
	env[0][1] = new Room("bakery");
	env[1][0] = new Room("game");
	env[1][1] = new Room("kitchen");
	env[2][0] = new Room("porch");
	env[2][1] = new Room("sixth");

	return env;
    }
}
