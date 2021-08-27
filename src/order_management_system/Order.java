package order_management_system;

import java.util.Scanner;

public class Order {
	private Payment payment;
	private MenuCard menucard;
	private  Scanner scan = new Scanner(System.in);
	private double totalPrice = 0.0;
	private String again;
	private int quantity = 1;
	private int choice;
		
	public void getOrder() {

		print("choose any item : ");
		choice = scan.nextInt();

		switch (choice) {

		case 1:
			println("you choose Dosa");
			getNumberOfQuantity();
			totalPrice += (quantity * 25);

			getAnotherOrder();

			break;

		case 2:

			println("you choose Briyani");
			getNumberOfQuantity();
			totalPrice += (quantity * 150);

			getAnotherOrder();

			break;

		case 3:

			println("you choose Fried Rice");
			getNumberOfQuantity();
			totalPrice += (quantity * 65);

			getAnotherOrder();

			break;

		case 4:

			println("you choose Milk Shake");
			getNumberOfQuantity();
			totalPrice += (quantity * 80);

			getAnotherOrder();

			break;

		case 5:

			println("you choose shawarma");
			getNumberOfQuantity();
			totalPrice += (quantity * 50);

			getAnotherOrder();

			break;

		}
	}

	public void getNumberOfQuantity() {
		print("How many quantity would you like to buy : ");
		quantity = scan.nextInt();
	}

	public void getAnotherOrder() {

		print("\nyou want to buy again ? : ");
		print("\nPress Y for Yes and N for No : ");
	
		again = scan.next();
		if (again.equalsIgnoreCase("Y")) {
			menucard = new MenuCard();
			menucard.displayTheMenu();
			getOrder();
		}

		else
			payment = new Payment();
			payment.paymentVerification(totalPrice);
	}


	public static void println(String message) {
		System.out.println(message);
	}

	public static void print(String message) {
		System.out.print(message);
	}
}