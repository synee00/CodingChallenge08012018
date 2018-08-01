package co.grandcircus.fileio;

public class Chara {
	private String name;
	private String classification;
	private int level;
	
	public Chara(String name, String classification, int level) {
		super();
		this.name = name;
		this.classification = classification;
		this.level = level;
	}

	public Chara() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	public String toString() {
		String line = String.format("%-10s %-12s %-10s", name, classification, level);
		return line;
	}

	

}
