package userInput;

public class Command {
    
    // fields
    private Action action;
    private String subject;
    
    // default constructor
    public Command (Action action, String subject) {
	this.action = action;
	this.subject = subject;
    }
    
    public Action getAction() { return action; }
    public void setAction(Action action) { this.action = action; }
    public String getSubject() { return subject; }
}
