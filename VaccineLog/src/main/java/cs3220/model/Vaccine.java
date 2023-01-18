package cs3220.model;

public class Vaccine {
	// Data fields.
	
	static int idSeed = 1;
	private int id;

	private String name = " ";
	private int dosesRequired = 0;
	private String daysBetween = " ";
	private int dosesRecieved = 0; // add here
	private int dosesLeft = 0;

	// Constructor
	public Vaccine(int dosesRequired, String daysBetween, int dosesRecieved, int dosesLeft, String name) {
		this.id = idSeed++;
		this.dosesRequired = dosesRequired;
		this.daysBetween = daysBetween;
		this.dosesRecieved = dosesRecieved;
		this.dosesLeft = dosesLeft;
		this.name = name;

	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDosesRequired() {
		return dosesRequired;
	}

	public void setDosesRequired(int dosesRequired) {
		this.dosesRequired = dosesRequired;
	}

	public String getDaysBetween() {
		return daysBetween;
	}

	public void setDaysBetween(String daysBetween) {

		this.daysBetween = daysBetween;

	}

	public int getDosesRecieved() {
		return dosesRecieved;
	}

	public void setDosesRecieved(int dosesRecieved) {
		this.dosesRecieved = dosesRecieved;
	}

	public int getDosesLeft() {
		return dosesLeft;
	}

	public void setDosesLeft(int dosesLeft) {
		this.dosesLeft = dosesLeft;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Methods

}
