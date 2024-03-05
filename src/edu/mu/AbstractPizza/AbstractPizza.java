package edu.mu.AbstractPizza;

import java.util.*;

public abstract class AbstractPizza 
{
	protected List<Toppings> toppingList;
	protected double priceWithoutToppings;
    protected double totalPrice;
    protected int pizzaOrderID;
    protected static int orderIDCounter = 1000; 
    protected ICookingStrategy cookingStrategy;
    protected double cookingPrice;
    
    public AbstractPizza() 
    {
        this.toppingList = new ArrayList<>();
        this.totalPrice = 0.0;
        this.pizzaOrderID = orderIDCounter++;
    }

    // Setter and getter methods for toppingList
    public void setToppingList(List<Toppings> toppingList) {
        this.toppingList = toppingList;
    }

    public List<Toppings> getToppingList() {
        return toppingList;
    }

    // Other setter and getter methods for other attributes
    public void setPriceWithoutToppings(double priceWithoutToppings) {
        this.priceWithoutToppings = priceWithoutToppings;
    }

    public double getPriceWithoutToppings() {
        return priceWithoutToppings;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getPizzaOrderID() {
        return pizzaOrderID;
    }

    public static int getOrderIDCounter() {
        return orderIDCounter;
    }

    public ICookingStrategy getCookingStrategy() {
        return cookingStrategy;
    }

    public void setCookingStrategy(ICookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
    }

    public double getCookingPrice() {
        return cookingPrice;
    }

    public void setCookingPrice(double cookingPrice) {
        this.cookingPrice = cookingPrice;
    }

    // Abstract method for calculating total price
    public abstract void calculateTotalPrice();
}
