package edu.mu.Cooking;
import edu.mu.AbstractPizza.*;

/**
 * Represents a cooking strategy using a conventional oven to cook a pizza.
 * Implements the ICookingStrategy interface.
 */
public class ConventionalOvenCookingStrategy implements ICookingStrategy 
{
	/**
     * Default constructor for ConventionalOvenCookingStrategy.
     * This constructor does not take any parameters and is provided by default.
     */
    public ConventionalOvenCookingStrategy() {
        // Default constructor
    }
	/**
     * Cooks the given pizza using a conventional oven cooking strategy.
     * Sets the cooking strategy of the pizza to conventional oven.
     * Increases the total price of the pizza by 8.0 units.
     * Sets the cooking price of the pizza to 8.0 units.
     * @param pizza The pizza to be cooked.
     * @return true if the pizza is cooked successfully, false otherwise.
     */
	
    @Override
    public boolean cook(AbstractPizza pizza) {
        pizza.setCookingStrategy(this); //sets the cooking strategy
        pizza.setTotalPrice(pizza.getTotalPrice() + 8.0); //updates price
        pizza.setCookingPrice(8.0);
        return true;
    }
}
