package edu.mu.Cooking;
import edu.mu.AbstractPizza.*;

/**
 * Represents a cooking strategy using a brick oven to cook a pizza.
 * Implements the ICookingStrategy interface.
 */

public class BrickOvenCookingStrategy implements ICookingStrategy 
{
	
	/**
     * Default constructor for BrickOvenCookingStrategy.
     * This constructor does not take any parameters and is provided by default.
     */
    public BrickOvenCookingStrategy() {
        // Default constructor
    }
	/**
     * Cooks the given pizza using a brick oven cooking strategy.
     * Sets the cooking strategy of the pizza to brick oven.
     * Increases the total price of the pizza by 10.0 units.
     * Sets the cooking price of the pizza to 10.0 units.
     * @param pizza The pizza to be cooked.
     * @return true if the pizza is cooked successfully, false otherwise.
     */
    @Override
    public boolean cook(AbstractPizza pizza) {
        pizza.setCookingStrategy(this); //sets the cooking strat
        pizza.setTotalPrice(pizza.getTotalPrice() + 10.0); //updates price
        pizza.setCookingPrice(10.0);
        return true;
    }
}