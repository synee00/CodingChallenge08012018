package co.grandcircus.fileio;

public class Player {
	
	// These are private. They cannot even be accessed by the child classes.
	private String name;
	private int jersey;
	
	public Player(String name, int jersey) {
		super();
		this.name = name;
		this.jersey = jersey;
	}
	
	public Player() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJersey() {
		return jersey;
	}
	public void setJersey(int jersey) {
		this.jersey = jersey;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", jersey=" + jersey + "]";
	}

}