package TESTS;

public class MULTIDIMENSIONALARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] students = { new Person("anisha", "tuladhar", 37), new Person("nirajan", "tuladhar", 42),
				new Person("sahara", "tuladhar", 6), new Person("aarik", "tuladhar", 2) };

		// forEach loop

		for (Person student : students) {
			student.displayName();
		}

	}

}

class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}
