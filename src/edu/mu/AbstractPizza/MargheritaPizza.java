package edu.mu.AbstractPizza;

import java.util.List;

import edu.mu.Cooking.ICookingStrategy;

public class MargheritaPizza extends AbstractPizza {
	
	//nmc Added default constructor to fix PizzaCookingFactory "The constructor MargheritaPizza() is undefined" not sure if this is right will come back to later 
	//default constructor
	public MargheritaPizza() {
		super(null, 2.5, 0.0, getOrderIDCounter(), null,0.0);
		toppingList.add(Toppings.CANADIAN_BACON);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.PINEAPPLE);
		orderIDCounter = 1 + orderIDCounter;

		totalPrice = addTopingsToPrice(2.50);
		updatePizzaPrice();
	}

	public MargheritaPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, priceWithoutToppings, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		
	}

	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingPrice=" + cookingPrice
				+ ", getToppingList()=" + getToppingList() + ", getPriceWithoutToppings()=" + getPriceWithoutToppings()
				+ ", getTotalPrice()=" + getTotalPrice() + ", getPizzaOrderID()=" + getPizzaOrderID()
				+ ", getCookingPrice()=" + getCookingPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	protected double addTopingsToPrice(double priceWithoutToppings)
	{
		this.priceWithoutToppings = priceWithoutToppings;
		totalPrice = priceWithoutToppings;
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		
		for (Toppings t: toppingList)
		{
			totalPrice += t.getToppingPrice();
		}
		
		return totalPrice;
	}
	
	
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
