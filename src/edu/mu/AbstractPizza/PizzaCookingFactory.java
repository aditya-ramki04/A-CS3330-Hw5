package edu.mu.AbstractPizza;


/**
 * Factory class for creating different types of pizzas.
 * This class provides methods to create instances of different pizza types.
 */
public class PizzaCookingFactory {

	
	/**
     * Default constructor for PizzaCookingFactory.
     */
	public PizzaCookingFactory() {
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Creates a pizza of the specified type.
     * 
     * @param pizzaType The type of pizza to create.
     * @return An instance of the specified pizza type, or null if the pizza type is unknown.
     */
	public AbstractPizza createPizza(PizzaType pizzaType) {
		AbstractPizza pizza = null;
		
		if(pizzaType.HAWAIIAN.equals(pizzaType)) {
			pizza = new HawaiianPizza();
		}else if (pizzaType.MARGHERITA.equals(pizzaType)) {
            pizza = new MargheritaPizza();
        } else if (pizzaType.SUPREME.equals(pizzaType)) {
            pizza = new SupremePizza();
        } else if (pizzaType.VEGETARIAN.equals(pizzaType)) {
            pizza = new VegetarianPizza();
        }
		
		return pizza;
	}
}
