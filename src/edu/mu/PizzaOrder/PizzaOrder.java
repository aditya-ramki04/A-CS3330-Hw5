package edu.mu.PizzaOrder;

import java.util.List;

import edu.mu.AbstractPizza.*;
import edu.mu.Cooking.*;



public class PizzaOrder 
{
	private PizzaCookingFactory pizzaFactory;
    private ICookingStrategy cookingStrategy;
    private List<AbstractPizza> pizzaOrderList;
	
	public void printListOfToppingsByPizzaOrderID(int orderID)
	{
		
	}
	
	public void printPizzaOrderCart(int orderID)
	{
		
	}
	
	//start nmc
	//iterates through the list of pizza orders and checks if the oderID
	//matches the given parameter and will return pizza if match
	public AbstractPizza getPizzaByOrderID(int orderID)
	{
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}
	
	public boolean addPizzaToCart(PizzaType pizzaType)
	{	
		return false;
	}
	
	public boolean addNewToppingToPizza(int orderID, Toppings topping)
	{
		return false;
		
	}
	
	public boolean removeToppingFromPizza(int orderID, Toppings topping)
	{
		return false;
		
	}
	//end nmc
	
	public boolean isThereAnyUncookedPizza()
	{
		return false;
		
	}
	
	public double checkout()
	{
		return 0;
		
	}
	
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType)
	{
		return false;
		
	}

}
