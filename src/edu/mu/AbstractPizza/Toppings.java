package edu.mu.AbstractPizza;

/**
 * Enumeration representing different toppings for pizzas.
 * Each topping has a corresponding price.
 */
public enum Toppings {
	/**
     * Tomato topping.
     */
	TOMATO(1.50),
	/**
     * Cheese topping.
     */
	CHEESE(2.00),
	/**
     * Pineapple topping.
     */
	PINEAPPLE(2.50),
	/**
     * Black olive topping.
     */
	BLACK_OLIVE(1.25),
	/**
     * Italian sausage topping.
     */
	ITALIAN_SAUSAGE(3.50),
	/**
     * Pepperoni topping.
     */
	PEPPERONI(3.00),
	/**
     * Bell pepper topping.
     */
	BELL_PEPPER(1.00),
	/**
     * Mushroom topping.
     */
	MUSHROOM(1.50),
	/**
     * Canadian bacon topping.
     */
	CANADIAN_BACON(4.00);
	
	private double toppingPrice;

	/**
     * Constructor for Toppings enum.
     * 
     * @param toppingPrice The price of the topping.
     */
	Toppings(double toppingPrice) 
	{
	        this.toppingPrice = toppingPrice;
	}
	
	/**
     * Getter method to retrieve the price of the topping.
     * 
     * @return The price of the topping.
     */
	public double getToppingPrice() 
	{
	    return toppingPrice;
	}
}
