package edu.mu.PizzaOrder;
import java.util.*;
import edu.mu.AbstractPizza.*;
import edu.mu.Cooking.*;

/**
 * Represents a pizza order system that manages pizza orders, toppings, cooking strategies, and checkout operations.
 */
public class PizzaOrder 
{
	private PizzaCookingFactory pizzaFactory;
    private ICookingStrategy cookingStrategy = null;
    private List<AbstractPizza> pizzaOrderList;
    
    
    /**
     * Constructs a new PizzaOrder object with an empty pizza order list.
     */
    public PizzaOrder() {
        // Instantiate the pizzaFactory, cookingStrategy, and pizzaOrderList attributes
        this.pizzaFactory = new PizzaCookingFactory();
        this.pizzaOrderList = new ArrayList<>();
    }
	
    
    /**
     * Prints the list of toppings for a pizza order identified by the given order ID.
     * @param orderID The ID of the pizza order to retrieve toppings for.
     */
	public void printListOfToppingsByPizzaOrderID(int orderID)
	{
		AbstractPizza pizza = getPizzaByOrderID(orderID);

        if (pizza != null) 
        {
            System.out.println("Toppings for Pizza Order ID " + orderID + ":");
            List<Toppings> toppingsList = pizza.getToppingList();

            for (Toppings topping : toppingsList) 
            {
                System.out.println(topping);
            }
        } 
        else 
        {
            System.out.println("Pizza Order with ID " + orderID + " not found.");
        }
	}
	
	/**
     * Prints the details of all pizzas in a pizza order identified by the given order ID.
     * 
     * @param orderID The ID of the pizza order to print details for.
     */
	public void printPizzaOrderCart(int orderID)
	{
		System.out.println("All pizzas in Order " + orderID + ":");
		if(pizzaOrderList != null) 
		{
			for(AbstractPizza pizza : pizzaOrderList) 
			{
				if (pizza.getPizzaOrderID() == orderID) 
				{
	                System.out.println(pizza.toString());
				}
			}
				
		}
	}
	
	/**
     * Retrieves the pizza associated with the specified order ID.
     * 
     * @param orderID The ID of the pizza order to retrieve.
     * @return The pizza associated with the given order ID, or null if not found.
     */
	public AbstractPizza getPizzaByOrderID(int orderID)
	{
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}
	
	/**
     * Adds a new pizza of the specified type to the pizza order list.
     * 
     * @param pizzaType The type of pizza to add.
     * @return true if the pizza is added successfully, false otherwise.
     */
	public boolean addPizzaToCart(PizzaType pizzaType) 
	{
		if(pizzaType != null) {
			AbstractPizza pizza = pizzaFactory.createPizza(pizzaType);
			pizzaOrderList.add(pizza);
			return true;
		}
		return false;
	}


	/**
     * Adds a new topping to the pizza with the specified order ID.
     * 
     * @param orderID The ID of the pizza order.
     * @param topping The topping to add.
     * @return true if the topping is added successfully, false otherwise.
     */
	public boolean addNewToppingToPizza(int orderID, Toppings topping){
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		
		if (pizza != null) {
	        List<Toppings> toppingList = pizza.getToppingList();
	        
	        if (!toppingList.contains(topping)) 
	        {
	            toppingList.add(topping);
	            pizza.updatePizzaPrice();
	            
	 	        pizza.setToppingList(toppingList);
	            return true;
	        } 
	        else {
	            return false;
	        }
		}
		    return false;
	}
	
	/**
     * Removes the specified topping from the pizza with the given order ID.
     * 
     * @param orderID The ID of the pizza order.
     * @param topping The topping to remove.
     * @return true if the topping is removed successfully, false otherwise.
     */
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
	    AbstractPizza pizza = getPizzaByOrderID(orderID);

	    if (pizza != null) {
	        List<Toppings> toppingList = pizza.getToppingList();

	        for (Toppings currentTopping : toppingList) {
	            if (currentTopping.equals(topping)) {
	                toppingList.remove(currentTopping);
	                pizza.updatePizzaPrice();

	                return true; 
	            }
	        }
	    }
	    return false;
	}
	
	/**
     * Checks if there are any uncooked pizzas in the pizza order list.
     * 
     * @return true if there are uncooked pizzas, false otherwise.
     */
	public boolean isThereAnyUncookedPizza()
	{
		for (AbstractPizza pizza : pizzaOrderList) {
	        if (pizza.getCookingStrategy() == null) { //basically if theres no strat then the pizza isnt cooked yet
	            return true; 
	        }
	    }
	    return false; 
		
	}
	
	/**
     * Calculates the total price of all pizzas in the pizza order list and performs checkout.
     * 
     * @return The total price of the pizza order.
     * @throws Exception If there are uncooked pizzas in the order.
     */
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
	
	/**
     * Selects a cooking strategy for the pizza identified by the given order ID.
     * 
     * @param orderID The ID of the pizza order.
     * @param cookingStrategyType The type of cooking strategy to select.
     * @return true if the cooking strategy is selected successfully, false otherwise.
     */
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
		
		return (cookingStrategy.cook(pizza)); //cook function returns a bool value	
		}

}
