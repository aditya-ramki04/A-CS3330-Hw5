package edu.mu.AbstractPizza;

import java.util.List;

import edu.mu.Cooking.ICookingStrategy;

public class MargheritaPizza extends AbstractPizza {

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
