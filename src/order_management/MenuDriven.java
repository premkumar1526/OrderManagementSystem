package order_management;

import java.util.Scanner;

public class MenuDriven {

	private double dosaPrice, briyaniPrice, friedricePrice, milkshakePrice, shwarmaPrice;
	private int Totalquantity = 0;
	private double TotalPrice;
	private int quantity = 0;
	private int dosaQuantity, briyaniQuantity, friedriceQuantity, milkshakeQuantity, shwarmaQuantity;

	private String item1 = "\n1. Dosa - Rs.25.00       ";
	private String item2 = "2. Briyani - Rs.150.00    ";
	private String item3 = "3. Fried Rice - Rs. 65.00";
	private String item4 = "4. Milk Shake - Rs. 80.00 ";
	private String item5 = "5. shawarma - Rs. 50.00   ";
	private static Scanner scan = new Scanner(System.in);

	public static void println(String message) {
		System.out.println(message);
	}

	public static void print(String message) {
		System.out.print(message);
	}

	public void displayTheMenuDriven() {

		while (true) {

			println("\nWelcome to Hotel, please choose any of the menu there...");
			println(item1);
			println(item2);
			println(item3);
			println(item4);
			println(item5);

			print("\nChoose any item : ");
			int choice = scan.nextInt();

			if (choice > 0 && choice <= 5) {
				print("\nHow many quantity ");
				quantity = scan.nextInt();
			}

			switch (choice) {

			case 1:
				dosaPrice = 25.00 * quantity;
				dosaQuantity = quantity;
				break;
			case 2:
				briyaniPrice = 150.00 * quantity;
				briyaniQuantity = quantity;

				break;
			case 3:
				friedricePrice = 65.00 * quantity;
				friedriceQuantity = quantity;

				break;
			case 4:
				milkshakePrice = 80.00 * quantity;
				milkshakeQuantity = quantity;

				break;
			case 5:
				shwarmaPrice = 50.00 * quantity;
				shwarmaQuantity = quantity;

				break;
			default:
				println("\nplease enter valid choice");
				continue;
			}

			print("\nWould you like to order again ? (y/n) : ");

			int ch = scan.next().charAt(0);
			if (ch == 'n') {
				println("Final Cart :");
				print("\n\nItem\t\t\t\tQuantitiy\tTotal");
				print("\n" + item1 + "\t" + dosaQuantity + "\t" + dosaPrice);
				print("\n" + item2 + "\t" + briyaniQuantity + "\t" + briyaniPrice);
				print("\n" + item3 + "\t" + friedriceQuantity + "\t" + friedricePrice);
				print("\n" + item4 + "\t" + milkshakeQuantity + "\t" + milkshakePrice);
				print("\n" + item5 + "\t" + shwarmaQuantity + "\t" + shwarmaPrice);

				Totalquantity = dosaQuantity + briyaniQuantity + friedriceQuantity + milkshakeQuantity
						+ shwarmaQuantity;
				TotalPrice = dosaPrice + briyaniPrice + friedricePrice + milkshakePrice + shwarmaPrice;
				println("\nTotal purchase Items : " + Totalquantity);
				println("\nTotal purchase : " + TotalPrice);
				println("\nThank you for buying !!!");
				break;
			}
		}
	}
}
