package edu.mu.AbstractPizza;

/**
 * Enumeration representing different types of pizzas.
 * Each pizza type has a corresponding topping price.
 */
public enum PizzaType {
	/**
     * Hawaiian pizza type.
     */
	HAWAIIAN,
	/**
     * Margherita pizza type.
     */
	MARGHERITA,
	/**
     * Supreme pizza type.
     */
	SUPREME,
	/**
     * Vegetarian pizza type.
     */
	VEGETARIAN;

	private double toppingPrice;
	
	/**
     * Constructor for PizzaType enum.
     * 
     * @param toppingPrice The price of toppings for the pizza type.
     */
	private void PizzaTypes(double toppingPrice) 
	{
	    this.toppingPrice = toppingPrice;
	}
	
	/**
     * Getter method to retrieve the topping price for the pizza type.
     * 
     * @return The price of toppings for the pizza type.
     */
	public double getToppingPrice() {
	    return toppingPrice;
	}
}