package edu.mu.PizzaOrder;
import java.util.*;
import edu.mu.AbstractPizza.*;
import edu.mu.Cooking.*;


public class PizzaOrder 
{
	private PizzaCookingFactory pizzaFactory;
    private ICookingStrategy cookingStrategy = null;
    private List<AbstractPizza> pizzaOrderList;
    
    public PizzaOrder() {
        // Instantiate the pizzaFactory, cookingStrategy, and pizzaOrderList attributes
        this.pizzaFactory = new PizzaCookingFactory();
        this.pizzaOrderList = new ArrayList<>();
    }
	
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
	
	public void printPizzaOrderCart(int orderID)
	{
        System.out.println("Order ID: " + orderID + " Pizza Order:");
                
        for (int i = 0; i < pizzaOrderList.size(); i++) 
        {
            System.out.println((i + 1) + ". " + pizzaOrderList.get(i));
        }
	}
	
	//Start nmc
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
	
	//takes PizzaType as an input and uses pizzafactory to create pizza and adds to pizza cart
	//if it was created it will return true otherwise false
	//it can throw a PizzaCreationException as-well
	public boolean addPizzaToCart(PizzaType pizzaType) {
		if(pizzaType != null) {
			AbstractPizza pizza = pizzaFactory.createPizza(pizzaType);
			pizzaOrderList.add(pizza);
			return true;
		}
		return false;
		}



	//Adds the given topping to the pizza with the specified order ID.
	//If the topping doesn't already exist in the pizza's topping list,
	//it is added, and the pizza price is updated.
	//Returns true if the topping is added successfully; otherwise, returns false.
	//If the pizza with the given order ID is not found, it also returns false.
	public boolean addNewToppingToPizza(int orderID, Toppings topping){
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		
		if (pizza != null) {
	        List<Toppings> toppingList = pizza.getToppingList();

	        if (!toppingList.contains(topping)) {
	            toppingList.add(topping);
	            pizza.updatePizzaPrice();

	            return true;
	        } else {
	            return false;
	        }
		}
		    return false;
	}
	
	//Removes the specified topping from the pizza with the given order ID.
	//If the topping is successfully removed, updates the pizza price and returns true.
	//If the topping doesn't exist in the topping list or no pizza is found with the given order ID, returns false.
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
	//End nmc
	
	
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
