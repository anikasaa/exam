package TESTS;

public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Database db1 = Database.getInsured();
		db1.getConnection();

	}

}

class Database {
	private static Database dbObject;

	private Database() {

	}

	public static Database getInsured() {
		if (dbObject == null) {
			dbObject = new Database();
		}
		return dbObject;
	}

	public void getConnection() {
		System.out.println("you are now connected");
	}
}
