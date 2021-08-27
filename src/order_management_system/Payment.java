package order_management_system;

import java.util.Scanner;

public class Payment{
	
	public static void print(String message) {
		
		System.out.print(message);
	}

	Scanner scan = new Scanner(System.in);
	
	public void paymentVerification(double totalPrice) {
		
		print("\nYour bill is " + totalPrice);

		while(true) {
			print("\nEnter a payment : ");
			Double pay = scan.nextDouble();
			if (pay < totalPrice) {
				print("Payment is not enough");
				continue;
			}
			else {
				totalPrice = pay - totalPrice;
				print("\nYour change is Rs." + totalPrice);
				print("\nThank you for buying");
			}
				break;
			
		}
	}


}
