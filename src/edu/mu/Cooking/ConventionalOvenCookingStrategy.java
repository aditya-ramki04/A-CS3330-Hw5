package edu.mu.Cooking;
import edu.mu.AbstractPizza.*;


public class ConventionalOvenCookingStrategy implements ICookingStrategy {
    @Override
    public boolean cook(AbstractPizza pizza) {
        pizza.setCookingStrategy(this); //sets the cooking strat
        pizza.setTotalPrice(pizza.getTotalPrice() + 8.0); //updates price
        pizza.setCookingPrice(8.0);
        return true;
    }
}
