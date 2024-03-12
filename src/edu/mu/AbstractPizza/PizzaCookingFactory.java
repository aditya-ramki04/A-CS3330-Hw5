package edu.mu.AbstractPizza;

public class PizzaCookingFactory {

	public PizzaCookingFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstractPizza createPizza(PizzaType pizzaType) throws Exception {
		AbstractPizza pizza;
		
		if(pizzaType.HAWAIIAN.equals(pizzaType)) {
			pizza = new HawaiianPizza();
		}else if (pizzaType.MARGHERITA.equals(pizzaType)) {
            pizza = new MargheritaPizza();
        } else if (pizzaType.SUPREME.equals(pizzaType)) {
            pizza = new SupremePizza();
        } else if (pizzaType.VEGETARIAN.equals(pizzaType)) {
            pizza = new VegetarianPizza();
        }else {
            throw new Exception("Invalid pizza type: " + pizzaType);
        }
		return pizza;
	}
}
