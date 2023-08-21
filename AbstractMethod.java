package TESTS;

public class AbstractMethod {

	public static void main(String[] args) {
		BOAA boston = new BOAA();
		boston.loan();
		boston.save();
		boston.displayCountry();
		boston.branchName();

		CitizensA bostonA = new CitizensA();
		bostonA.loan();
		bostonA.save();
		bostonA.displayCountry();
		bostonA.branchName();

	}

}

abstract class WorldBankA {

	abstract void loan();

	abstract void save();

	public void displayCountry() {
		System.out.println("i am from MA");
	}
}

class BOAA extends WorldBankA {

	@Override
	void loan() {
		System.out.println("i am loan from BOAA");

	}

	@Override
	void save() {
		System.out.println("i am save from BOAA");

	}

	public void branchName() {
		System.out.println("i am a boston branch");
	}

}

class CitizensA extends WorldBankA {

	@Override
	void loan() {
		System.out.println("i am loan from Citizens");

	}

	@Override
	void save() {
		System.out.println("i am save from Citizens");

	}

	public void branchName() {
		System.out.println("i am boston branch-citizens");
	}

}
