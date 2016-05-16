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
    
    /**
     * getter method for name field
     * @return name
     */
    public String getName() {
	return name;
    }
    
    /**
     * getter method for object description
     * @return description
     */
    public String getDescription() {
	return description;
    }
    
    /**
     * abstract method implemented by different room objects
     * @return status, encoded as an int that enables progression for player at 1
     * 			regression at -1
     * 			no effect at 0
     */
    public abstract int talkTo();
    
    /**
     * abstract method implemented by different room objects
     * @return status, encoded as an int that enables progression for player at 1
     * 			regression at -1
     * 			no effect at 0
     */
    public abstract int attack();
}
