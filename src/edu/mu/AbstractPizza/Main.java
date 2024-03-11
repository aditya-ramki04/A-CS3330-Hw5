package edu.mu.AbstractPizza;

import edu.mu.PizzaOrder.PizzaOrder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaOrder order = new PizzaOrder();

        // Add pizzas to the cart
        order.addPizzaToCart(PizzaType.MARGHERITA);
        order.addPizzaToCart(PizzaType.VEGETARIAN);

        // Print pizza order cart
        order.printPizzaOrderCart(1);

        // Select cooking strategies for the pizzas in the cart
        order.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.BRICK_OVEN);
        order.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.CONVENTIONAL_OVEN);

        // Print list of toppings for a specific pizza order ID
        order.printListOfToppingsByPizzaOrderID(1);

        // Add new topping to a pizza
        order.addNewToppingToPizza(1, Toppings.PEPPERONI);

        // Remove topping from a pizza
        order.removeToppingFromPizza(2, Toppings.BELL_PEPPER);

        // Print updated pizza order cart
        order.printPizzaOrderCart(1);

        try {
            // Checkout and calculate the total bill
            double totalBill = order.checkout();
            System.out.println("Total Bill: $" + totalBill);
        } catch (Exception e) {
            System.err.println("Error during checkout: " + e.getMessage());
        }
	}

}
