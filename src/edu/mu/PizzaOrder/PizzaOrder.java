package edu.mu.PizzaOrder;
import java.util.ArrayList;
import java.util.List;
import edu.mu.AbstractPizza.*;
import edu.mu.Cooking.*;



public class PizzaOrder 
{
	private PizzaCookingFactory pizzaFactory;
    private ICookingStrategy cookingStrategy;
    private List<AbstractPizza> pizzaOrderList;
    
    public PizzaOrder() {
        // Instantiate the pizzaFactory, cookingStrategy, and pizzaOrderList attributes
        this.pizzaFactory = new PizzaCookingFactory();
        this.pizzaOrderList = new ArrayList<>();
    }
	
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
	
	
	//Aditya R
	public boolean isThereAnyUncookedPizza()
	{
		for (AbstractPizza pizza : pizzaOrderList) {
	        if (pizza.getCookingStrategy() == null) { //basically if theres no strat then the pizza isnt cooked yet
	            return true; 
	        }
	    }
	    return false; 
		
	}
	
	public double checkout() throws Exception
	{
		if (isThereAnyUncookedPizza()) {
	        throw new Exception("Cannot checkout: There are uncooked pizzas.");
	    }
		
		double total = 0.0;
	    for (AbstractPizza pizza : pizzaOrderList) {
	        total += pizza.getTotalPrice();
	    }

	    return total;
	}
	
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType)
	{
		//gets the specific pizzaorder
		AbstractPizza pizza  = null;
		for (AbstractPizza p : pizzaOrderList) {
	        if (p.getPizzaOrderID() == orderID) {
	            pizza = p;
	            break;
	        }
	    }
		
		if (pizza == null) {
	        return false;
	    }
		
		//gets cooking strategy
		ICookingStrategy cookingStrategy = null;
		
		switch (cookingStrategyType) {
        case MICROWAVE:
            cookingStrategy = new MicrowaveCookingStrategy();
            break;
        case CONVENTIONAL_OVEN:
            cookingStrategy = new ConventionalOvenCookingStrategy();
            break;
        case BRICK_OVEN:
            cookingStrategy = new BrickOvenCookingStrategy();
            break;
        default:
            return false; // Invalid cooking strategy type
		}
		
		return (cookingStrategy.cook(pizza)); //cook function returns a bool value so we goods
	}

}
