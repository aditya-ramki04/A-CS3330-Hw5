package edu.mu.Cooking;
import edu.mu.AbstractPizza.*;

public class BrickOvenCookingStrategy implements ICookingStrategy {
    @Override
    public boolean cook(AbstractPizza pizza) {
        pizza.setCookingStrategy(this); //sets the cooking strat
        pizza.setTotalPrice(pizza.getTotalPrice() + 10.0); //updates price
        pizza.setCookingPrice(10.0);
        return true;
    }
}