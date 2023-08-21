package TESTS;

enum Size {

	SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Order {

	Size pizzaSize;

	public Order(Size pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public void orderConfirmation() {

		switch (pizzaSize) {

		case SMALL:
			System.out.println("you ordered a small pizza");
			break;

		case MEDIUM:
			System.out.println("you ordered a medium");
			break;

		case LARGE:
			System.out.println("you ordered a large pizza");
			break;

		case EXTRALARGE:
			System.out.println("you ordered an extralarge");
			break;
		}
	}
}

public class EnumwithSwitchCase {

	public static void main(String[] args) {
		Order O = new Order(Size.EXTRALARGE);
		O.orderConfirmation();
	}

}
