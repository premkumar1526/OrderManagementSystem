package order_management_system;

public class MenuCard {

	public static void println(String message) {
		System.out.println(message);
	}

	public static void print(String message) {
		System.out.print(message);
	}

	public void displayTheMenu() {

		println("\nWelcome to Hotel, please choose any of the menu there...");
		println("\n1. Dosa - Rs.25.00       ");
		println("2. Briyani - Rs.150.00    ");
		println("3. Fried Rice - Rs. 65.00");
		println("4. Milk Shake - Rs. 80.00 ");
		println("5. shawarma - Rs. 50.00   ");

	}
}
