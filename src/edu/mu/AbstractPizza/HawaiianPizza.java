package edu.mu.AbstractPizza;

import java.util.*;

import edu.mu.Cooking.ICookingStrategy;

/**
 * Represents a Hawaiian pizza order.
 * Extends the AbstractPizza class and provides specific functionality
 * and attributes for a Hawaiian pizza.
 */
public class HawaiianPizza extends AbstractPizza {
	
	/**
     * Default constructor for HawaiianPizza.
     * Initializes the pizza with default toppings and price.
     */
	public HawaiianPizza() {
		super(null, 2.5, 0.0, getOrderIDCounter(), null,0.0);
		toppingList.add(Toppings.CANADIAN_BACON);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.PINEAPPLE);
		orderIDCounter = 1 + orderIDCounter;

		totalPrice = addTopingsToPrice(3.00);
		updatePizzaPrice();
	}
	

	/**
     * Copy constructor for HawaiianPizza.
     * Creates a new Hawaiian pizza order with the same attributes as another Hawaiian pizza order.
     * 
     * @param otherPizza The Hawaiian pizza order to copy attributes from.
     */
	
	public HawaiianPizza(HawaiianPizza otherPizza) {
        super(otherPizza); // Call the superclass copy constructor
        // Copy additional attributes specific to HawaiianPizza if any
    }
	
	/**
     * Constructor for HawaiianPizza with specified attributes.
     * 
     * @param toppingList The list of toppings on the pizza.
     * @param priceWithoutToppings The price of the pizza without toppings.
     * @param totalPrice The total price of the pizza.
     * @param pizzaOrderID The unique ID of the pizza order.
     * @param cookingStrategy The cooking strategy used to cook the pizza.
     * @param cookingPrice The price for cooking the pizza.
     */
	public HawaiianPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, priceWithoutToppings, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Calculates the total price of the pizza including toppings.
     * 
     * @param priceWithoutToppings The price of the pizza without toppings.
     * @return The updated total price of the pizza.
     */
	protected double addTopingsToPrice(double priceWithoutToppings)
	{
		double totalPrice = priceWithoutToppings;
		//this.priceWithoutToppings = priceWithoutToppings;
//		toppingList.add(Toppings.CANADIAN_BACON);
//		toppingList.add(Toppings.PINEAPPLE);
//		toppingList.add(Toppings.CHEESE);
		for(Toppings t:  toppingList)
		{
			totalPrice += t.getToppingPrice();
		//	System.out.println(t.getToppingPrice());
		}
		return totalPrice;
	}
	
	/**
     * Updates the total price of the pizza including toppings.
     * 
     * @return The updated total price of the pizza.
     */
	public double updatePizzaPrice()
	{
		totalPrice = priceWithoutToppings;
		for(Toppings t: toppingList)
		{
			totalPrice += t.getToppingPrice();
		}
		totalPrice = addTopingsToPrice(priceWithoutToppings);
		return totalPrice;
	}

	/**
     * Overrides the toString method to provide a string representation of the HawaiianPizza object.
     * 
     * @return A string representation of the HawaiianPizza object.
     */
	@Override
	public String toString() {
		return "HawaiianPizza [toppingList=" + Arrays.toString(toppingList.toArray()) + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingPrice=" + cookingPrice
				+ ", getToppingList()=" + getToppingList() + ", getPriceWithoutToppings()=" + getPriceWithoutToppings()
				+ ", getTotalPrice()=" + getTotalPrice() + ", getPizzaOrderID()=" + getPizzaOrderID()
				+ ", getCookingPrice()=" + getCookingPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


}
