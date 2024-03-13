package edu.mu.AbstractPizza;

import java.util.List;

import edu.mu.Cooking.ICookingStrategy;

/**
 * Represents a Margherita pizza order.
 * Extends the AbstractPizza class and provides specific functionality
 * and attributes for a Margherita pizza.
 */
public class MargheritaPizza extends AbstractPizza {
	
	/**
     * Default constructor for MargheritaPizza.
     * Initializes the pizza with default toppings and price.
     */
	public MargheritaPizza() {
		super(null, 2.5, 0.0, getOrderIDCounter(), null,0.0);
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		orderIDCounter++;

		totalPrice = addTopingsToPrice(2.50);
		updatePizzaPrice();
	}
	
	/**
     * Copy constructor for MargheritaPizza.
     * Creates a new Margherita pizza order with the same attributes as another Margherita pizza order.
     * 
     * @param otherPizza The Margherita pizza order to copy attributes from.
     */
	public MargheritaPizza(MargheritaPizza otherPizza) {
        super(otherPizza); // Call the superclass copy constructor
        // Copy additional attributes specific to HawaiianPizza if any
    }
	
	/**
     * Constructor for MargheritaPizza with specified attributes.
     * 
     * @param toppingList The list of toppings on the pizza.
     * @param priceWithoutToppings The price of the pizza without toppings.
     * @param totalPrice The total price of the pizza.
     * @param pizzaOrderID The unique ID of the pizza order.
     * @param cookingStrategy The cooking strategy used to cook the pizza.
     * @param cookingPrice The price for cooking the pizza.
     */
	public MargheritaPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, priceWithoutToppings, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		
	}
	
	/**
     * Overrides the toString method to provide a string representation of the MargheritaPizza object.
     * 
     * @return A string representation of the MargheritaPizza object.
     */
	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingPrice=" + cookingPrice
				+ ", getToppingList()=" + getToppingList() + ", getPriceWithoutToppings()=" + getPriceWithoutToppings()
				+ ", getTotalPrice()=" + getTotalPrice() + ", getPizzaOrderID()=" + getPizzaOrderID()
				+ ", getCookingPrice()=" + getCookingPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
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

		for (Toppings t: toppingList)
		{
			totalPrice += t.getToppingPrice();
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
		
		for (Toppings t: toppingList)
		{
			totalPrice += t.getToppingPrice();
		}
		totalPrice = addTopingsToPrice(priceWithoutToppings);
		return totalPrice;
		
	}
}
