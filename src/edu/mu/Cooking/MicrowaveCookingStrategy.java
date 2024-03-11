package edu.mu.Cooking;
import edu.mu.AbstractPizza.*;


public class MicrowaveCookingStrategy implements ICookingStrategy {
    @Override
    public boolean cook(AbstractPizza pizza) {
        pizza.setCookingStrategy(this); //sets the cooking strat
        pizza.setTotalPrice(pizza.getTotalPrice() + 1.0); //updates price
        pizza.setCookingPrice(1.0);
        return true;
    }
}
