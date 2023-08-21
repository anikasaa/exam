package TESTS;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student Sahara = new Student();
		System.out.println(Sahara.firstName);
		System.out.println(Sahara.lastName);
		System.out.println(Sahara.age);

		Sahara.firstName = "Sahara";
		Sahara.lastName = "Tuladhar";
		Sahara.age = 6;

		System.out.println(Sahara.firstName);
		System.out.println(Sahara.lastName);
		System.out.println(Sahara.age);
		Sahara.displayName();

		Teacher S = new Teacher();
		System.out.println(S.salary);

		S.firstName = "Sahara S";
		S.lastName = "Tuladhar S";
		S.age = 25;
		S.salary = 2500;

		System.out.println(S.firstName);
		System.out.println(S.lastName);
		System.out.println(S.age);

		S.displayName();
		S.displaySalary();

	}

}

class Student {

	String firstName;
	String lastName;
	int age;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Teacher extends Student {
	int salary;

	public void displaySalary() {
		System.out.println(this.salary);
	}
}
