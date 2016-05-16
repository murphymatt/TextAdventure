package items;

public abstract class Item {

    // fields
    private String name;
    private String description;
    
    // constructor
    public Item(String name, String description) {
	this.name = name;
	this.description = description;
    }
    
    // methods
    // getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    /**
     * implemenations vary based on item object.
     * @return
     */
    public abstract int use();
}
