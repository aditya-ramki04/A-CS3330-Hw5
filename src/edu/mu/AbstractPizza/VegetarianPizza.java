package edu.mu.AbstractPizza;

import java.util.Arrays;
import java.util.List;

import edu.mu.Cooking.ICookingStrategy;

public class VegetarianPizza extends AbstractPizza{

	//nmc Added default constructor to fix PizzaCookingFactory "The constructor VegetarianPizza() is undefined" not sure if this is right will come back to later 
	//default constructor
	public VegetarianPizza() {
		super(null, 1.50, 0.0, getOrderIDCounter(), null, 0.0);
		toppingList.add(Toppings.TOMATO);
		toppingList.add(Toppings.CHEESE);
		toppingList.add(Toppings.BELL_PEPPER);
		toppingList.add(Toppings.BLACK_OLIVE);
		toppingList.add(Toppings.MUSHROOM);
		orderIDCounter = 1 + orderIDCounter;
		
	}
	public VegetarianPizza(List<Toppings> toppingList, double priceWithoutToppings, double totalPrice, int pizzaOrderID,
			ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, priceWithoutToppings, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VegetarianPizza [toppingList=" + Arrays.toString(toppingList.toArray()) + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingPrice=" + cookingPrice
				+ ", getToppingList()=" + getToppingList() + ", getPriceWithoutToppings()=" + getPriceWithoutToppings()
				+ ", getTotalPrice()=" + getTotalPrice() + ", getPizzaOrderID()=" + getPizzaOrderID()
				+ ", getCookingPrice()=" + getCookingPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
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
