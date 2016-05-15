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
    public String getName() { return name; }
    public String getDescription() { return description; }
    public abstract int use();
}
