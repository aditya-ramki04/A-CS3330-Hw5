package edu.mu.AbstractPizza;

import java.util.Arrays;
import java.util.List;

import edu.mu.Cooking.ICookingStrategy;


/**
 * Represents a vegetarian pizza, which includes toppings like tomato, cheese, bell pepper, black olive, and mushroom.
 * Inherits from the AbstractPizza class.
 */
public class VegetarianPizza extends AbstractPizza{

	/**
     * Constructs a new VegetarianPizza object with default values for topping list, price, and order ID.
     * Toppings included: tomato, cheese, bell pepper, black olive, mushroom.
     */
	public VegetarianPizza() {
		super(null, 1.50, 0.0, getOrderIDCounter(), null, 0.0);
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.BELL_PEPPER);
		toppingList.add(Toppings.BLACK_OLIVE);
		toppingList.add(Toppings.MUSHROOM);
		orderIDCounter = 1 + orderIDCounter;
		
	}
	
	/**
     * Constructs a new VegetarianPizza object with the specified toppings, price, total price, pizza order ID,
     * cooking strategy, and cooking price.
     *
     * @param toppingList       The list of toppings for the pizza.
     * @param priceWithoutToppings The price of the pizza without toppings.
     * @param totalPrice        The total price of the pizza.
     * @param pizzaOrderID      The order ID of the pizza.
     * @param cookingStrategy   The cooking strategy used for cooking the pizza.
     * @param cookingPrice      The price of cooking the pizza.
     */
	public VegetarianPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, priceWithoutToppings, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Returns a string representation of the VegetarianPizza object.
	 *
	 * @return A string containing the details of the VegetarianPizza object, including its topping list, price without toppings,
	 * total price, pizza order ID, cooking price, and other relevant information.
	 */
	@Override
	public String toString() {
		return "VegetarianPizza [toppingList=" + Arrays.toString(toppingList.toArray()) + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingPrice=" + cookingPrice
				+ ", getToppingList()=" + getToppingList() + ", getPriceWithoutToppings()=" + getPriceWithoutToppings()
				+ ", getTotalPrice()=" + getTotalPrice() + ", getPizzaOrderID()=" + getPizzaOrderID()
				+ ", getCookingPrice()=" + getCookingPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	 /**
     * Adds the toppings' prices to the pizza's total price.
     *
     * @param priceWithoutToppings The price of the pizza without toppings.
     * @return The total price of the pizza with toppings.
     */
	protected double addTopingsToPrice(double priceWithoutToppings)
	{
		//this.priceWithoutToppings = priceWithoutToppings;
		totalPrice = priceWithoutToppings;
//		toppingList.add(Toppings.TOMATO);
//		toppingList.add(Toppings.CHEESE);
//		toppingList.add(Toppings.BELL_PEPPER);
//		toppingList.add(Toppings.BLACK_OLIVE);
//		toppingList.add(Toppings.MUSHROOM);
		
		for (Toppings t: toppingList)
		{
			totalPrice += t.getToppingPrice();
		}
		
		return totalPrice;
	}
	
	/**
     * Updates the total price of the pizza with the added toppings.
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
		
		return totalPrice;
		
	}

}
