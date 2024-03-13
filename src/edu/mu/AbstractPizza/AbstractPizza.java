package edu.mu.AbstractPizza;

import java.util.*;

import edu.mu.Cooking.ICookingStrategy;

/**
 * Abstract class representing a pizza order.
 * Provides methods and attributes common to all types of pizzas.
 */

public abstract class AbstractPizza 
{
	protected List<Toppings> toppingList;
	protected double priceWithoutToppings;
    protected double totalPrice;
    protected int pizzaOrderID;
    protected static int orderIDCounter = 0; 
    protected ICookingStrategy cookingStrategy;
    protected double cookingPrice;
    
    /**
     * 
     * @param priceWithoutToppings
     */
    protected abstract double addTopingsToPrice(double priceWithoutToppings);
    /**
     * creates the methods
     * @return null
     */
    public abstract double updatePizzaPrice();
    
    /**
     * Constructor for AbstractPizza.
     * Initializes the topping list, price without toppings, total price,
     * pizza order ID, cooking strategy, and cooking price.
     * 
     * @param toppingList The list of toppings on the pizza.
     * @param priceWithoutToppings The price of the pizza without toppings.
     * @param totalPrice The total price of the pizza.
     * @param pizzaOrderID The unique ID of the pizza order.
     * @param cookingStrategy The cooking strategy used to cook the pizza.
     * @param cookingPrice The price for cooking the pizza.
     */
    public AbstractPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) 
    {
		this.toppingList = toppingList;
		this.priceWithoutToppings = priceWithoutToppings;
		this.totalPrice = totalPrice;
		this.pizzaOrderID = pizzaOrderID;
		this.cookingStrategy = cookingStrategy;
		this.cookingPrice = cookingPrice;
		this.toppingList = new ArrayList<>();
	}
    
    /**
     * Copy constructor for AbstractPizza.
     * Creates a new pizza order with the same attributes as another pizza order.
     * 
     * @param otherPizza The pizza order to copy attributes from.
     */
    public AbstractPizza(AbstractPizza otherPizza) {
        this.priceWithoutToppings = otherPizza.priceWithoutToppings;
        this.totalPrice = otherPizza.totalPrice;
        this.toppingList = new ArrayList<>(otherPizza.toppingList);
        this.pizzaOrderID = otherPizza.pizzaOrderID;
    }
    
    /**
     * Constructor for AbstractPizza with only price without toppings.
     * Initializes the price without toppings attribute.
     * 
     * @param priceWithoutToppings The price of the pizza without toppings.
     */
	public AbstractPizza(double priceWithoutToppings) {
		// TODO Auto-generated constructor stub\
		this.priceWithoutToppings = priceWithoutToppings;
	}

	/**
     * Sets the list of toppings on the pizza.
     * 
     * @param toppingList The list of toppings to set.
     */
	public void setToppingList(List<Toppings> toppingList) {
        this.toppingList = toppingList;
    }

	/**
     * Gets the list of toppings on the pizza.
     * 
     * @return The list of toppings on the pizza.
     */
    public List<Toppings> getToppingList() {
        return toppingList;
    }

    /**
     * Sets the price of the pizza without toppings.
     * 
     * @param priceWithoutToppings The price of the pizza without toppings.
     */
    public void setPriceWithoutToppings(double priceWithoutToppings) 
    {
        this.priceWithoutToppings = priceWithoutToppings;
    }
    
    /**
     * Gets the price of the pizza without toppings.
     * 
     * @return The price of the pizza without toppings.
     */
    public double getPriceWithoutToppings() {
        return priceWithoutToppings;
    }
    
    /**
     * Sets the total price of the pizza.
     * 
     * @param totalPrice The total price of the pizza.
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    /**
     * Gets the total price of the pizza.
     * 
     * @return The total price of the pizza.
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * Gets the unique ID of the pizza order.
     * 
     * @return The unique ID of the pizza order.
     */
    public int getPizzaOrderID() {
        return pizzaOrderID;
    }
    
    /**
     * Gets the cooking strategy used to cook the pizza.
     * 
     * @return The cooking strategy used to cook the pizza.
     */
    public static int getOrderIDCounter() {
        return orderIDCounter;
    }
    
    /**
     * Sets the cooking strategy used to cook the pizza.
     * 
     * @return cookingStrategy
     */
    public ICookingStrategy getCookingStrategy() {
        return cookingStrategy;
    }
    
    /**
     * Gets the price for cooking the pizza.
     * @param cookingStrategy for cooking the pizza.
     */
    public void setCookingStrategy(ICookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
    }
    
    /**
     * Sets the price for cooking the pizza.
     * 
     * @return cookingPrice
     */
    public double getCookingPrice() {
        return cookingPrice;
    }
    
    /**
     * Gets the price for cooking the pizza.
     * @param cookingPrice to set cookingPrice to cookingPrice
     */
    public void setCookingPrice(double cookingPrice) {
        this.cookingPrice = cookingPrice;
    }
}
