package environment;

public abstract class RoomObject {

    // fields
    private String name;
    private String description;

    // constructor
    public RoomObject(String name, String description) {
	this.name = name;
	this.description = description;
    }

    // methods
    public String getName() {
	return name;
    }

    public String getDescription() {
	return description;
    }
    
    public abstract int talkTo();
    
    public abstract int attack();
}
