package TESTS;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		additionA(5, 5);
		additionA(5, 5, 2);
		additionA(5, 5, 2, 3);

	}

	private static void additionA(int x, int y, int z, int a) {
		System.out.println(x + y + z + a);

	}

	private static void additionA(int x, int y, int z) {
		System.out.println(x + y + z);

	}

	private static void additionA(int x, int y) {
		System.out.println(x + y);

	}

}
