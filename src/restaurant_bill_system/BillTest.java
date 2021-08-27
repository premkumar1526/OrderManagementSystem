package restaurant_bill_system;

import java.util.List;

public class BillTest {
	
	//public static void printTheOrder

	public static void main(String[] args) {

		String[] nameOfTheFoods = {"Dosa", "Puri", "Idli", "coffee"};
		double[]costOfTheFoods = {40.5, 25.0, 20.0, 15.0};
	
		Bill bill = new Bill();
		
		
		bill.addOrderFromCustomer("Dosa", 1, nameOfTheFoods, costOfTheFoods);
		bill.addOrderFromCustomer("Puri", 2, nameOfTheFoods, costOfTheFoods);
		bill.addOrderFromCustomer("coffee",	5 , nameOfTheFoods, costOfTheFoods);
		List <String>order = bill.getOrder();
		
		System.out.println("The total price is "+bill.getTotalCost());
		
	}

}
