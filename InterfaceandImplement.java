package TESTS;

interface Course {

	public void course1();

	public void course2();

	public void course3();

	public void course4();
}

class Literature implements Course {

	@Override
	public void course1() {
		System.out.println("Literature1");

	}

	@Override
	public void course2() {
		System.out.println("Literature2");

	}

	@Override
	public void course3() {
		System.out.println("Literature3");

	}

	@Override
	public void course4() {
		System.out.println("Literature4");

	}

}

class Socials implements Course {

	@Override
	public void course1() {
		System.out.println("SS1");

	}

	@Override
	public void course2() {
		System.out.println("SS2");

	}

	@Override
	public void course3() {
		System.out.println("SS3");

	}

	@Override
	public void course4() {
		System.out.println("SS4");

	}

}

public class InterfaceandImplement {

	public static void main(String[] args) {

		Course subject;
		subject = new Literature();
		subject.course2();

		subject = new Socials();
		subject.course4();

	}

}
