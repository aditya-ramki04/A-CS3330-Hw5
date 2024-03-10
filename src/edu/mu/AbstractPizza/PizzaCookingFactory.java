package edu.mu.AbstractPizza;

public class PizzaCookingFactory {

	public PizzaCookingFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstractPizza createPizza(PizzaType pizzaType) throws Exception {
		AbstractPizza pizza;
		
		if(pizzaType == PizzaType.HAWAIIAN) {
			pizza = new HawaiianPizza();
		}else if (pizzaType == PizzaType.MARGHERITA) {
            pizza = new MargheritaPizza();
        } else if (pizzaType == PizzaType.SUPREME) {
            pizza = new SupremePizza();
        } else if (pizzaType == PizzaType.VEGETARIAN) {
            pizza = new VegetarianPizza();
        }else {
            throw new Exception("Invalid pizza type: " + pizzaType);
        }
		return pizza;
	}
}
