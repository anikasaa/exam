package TESTS;

public class Overriding {

	public static void main(String[] args) {

		Rockland boston = new Rockland("MA", "boston");
		boston.loan();
		boston.save();
		boston.displayMessage();

	}

}

class WorldBank {
	String country;

	public WorldBank(String ct) {
		this.country = ct;
	}

	public void save() {
		System.out.println("i am save method for WorldBank");
	}

	public void loan() {
		System.out.println("i am loan method for WorldBank");
	}

	public void displayMessage() {
		System.out.println("Welcome to WorldBank");
	}
}

class Citizens extends WorldBank {
	String branchName;

	public Citizens(String ct, String bn) {
		super(ct);
		this.branchName = bn;

	}

	public void save() {
		System.out.println("i am save for Citizens");
	}

	public void loan() {
		System.out.println("i am loan for Citizens");
	}

}

class Rockland extends WorldBank {
	String branchName;

	public Rockland(String ct, String bn) {
		super(ct);
		this.branchName = bn;
	}

	public void save() {
		System.out.println("i am save for Rockland");

	}

	public void loan() {
		System.out.println("i am loan for Rockland");
	}

}