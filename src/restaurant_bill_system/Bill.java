package restaurant_bill_system;

import java.util.ArrayList;

import java.util.List;

public class Bill {

	private ArrayList <String> orderedFood;
	private ArrayList <Integer> orderedQuantity;
	private double totalCost;
	
	public Bill() {

		orderedFood = new ArrayList<String>();
		orderedQuantity = new ArrayList<Integer>();
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public void setTotalCost() {
		this.totalCost = totalCost;
	}
	
	public void addOrderFromCustomer(String food, int quantity, String[] nameOfTheFoods, double[] costOfTheFoods) {
		
		orderedFood.add(food);
		orderedQuantity.add(quantity); //AB
		for(int i = 0; i < nameOfTheFoods.length; i++) {
			
			if(food.equalsIgnoreCase(nameOfTheFoods[i]))
				totalCost += quantity*costOfTheFoods[i];
		}
		
	}
	
	public List<String> getOrder() {
		
		/*for (int i = 0; i < orderedFood.size(); i++) {
			
			System.out.println(orderedFood.get(i)+" "+orderedQuantity.get(i));
*/			
			return orderedFood;
		}
	}
