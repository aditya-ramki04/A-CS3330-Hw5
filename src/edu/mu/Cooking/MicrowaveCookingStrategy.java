package edu.mu.Cooking;
import edu.mu.AbstractPizza.*;

/**
 * Represents a cooking strategy using a microwave to cook a pizza.
 * Implements the ICookingStrategy interface.
 */
public class MicrowaveCookingStrategy implements ICookingStrategy 
{
	/**
     * Default constructor for MicrowaveCookingStrategy.
     * This constructor does not take any parameters and is provided by default.
     */
    public MicrowaveCookingStrategy() {
        // Default constructor
    }
    
	/**
     * Cooks the given pizza using a microwave cooking strategy.
     * Sets the cooking strategy of the pizza to microwave.
     * Increases the total price of the pizza by 1.0 unit.
     * Sets the cooking price of the pizza to 1.0 unit.
     * @param pizza The pizza to be cooked.
     * @return true if the pizza is cooked successfully, false otherwise.
     */
    @Override
    public boolean cook(AbstractPizza pizza) {
        pizza.setCookingStrategy(this); //sets the cooking strategy
        pizza.setTotalPrice(pizza.getTotalPrice() + 1.0); //updates price
        pizza.setCookingPrice(1.0);
        return true;
    }
}
