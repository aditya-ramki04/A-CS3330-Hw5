package edu.mu.AbstractPizza;

import java.util.ArrayList;
import java.util.List;

import edu.mu.PizzaOrder.PizzaOrder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaOrder order = new PizzaOrder();

        // Add pizzas to the cart
        order.addPizzaToCart(PizzaType.HAWAIIAN);
       // order.addPizzaToCart(PizzaType.VEGETARIAN);

        // Print pizza order cart
        order.printPizzaOrderCart(0);

        // Select cooking strategies for the pizzas in the cart
        order.selectCookingStrategyByPizzaOrderID(0, CookingStyleType.BRICK_OVEN);
        //order.selectCookingStrategyByPizzaOrderID(2, CookingStyleType.CONVENTIONAL_OVEN);

        // Print list of toppings for a specific pizza order ID
        order.printListOfToppingsByPizzaOrderID(0);
        
        try {
            // Checkout and calculate the total bill
            double totalBill = order.checkout();
            System.out.println("Total Bill: $" + totalBill);
        } catch (Exception e) {
            System.err.println("Error during checkout: " + e.getMessage());
        }
      
    
        // Add new topping to a pizza
        order.addNewToppingToPizza(0, Toppings.PEPPERONI);

        // Remove topping from a pizza
        order.removeToppingFromPizza(0, Toppings.CHEESE);

        
        order.printPizzaOrderCart(0);
        order.printListOfToppingsByPizzaOrderID(0);

        
        order.addNewToppingToPizza(0, Toppings.ITALIAN_SAUSAGE);
        
        // Print updated pizza order cart
        order.printPizzaOrderCart(0);
        order.printListOfToppingsByPizzaOrderID(0);


        try {
            // Checkout and calculate the total bill
            double totalBill = order.checkout();
            System.out.println("Total Bill: $" + totalBill);
        } catch (Exception e) {
            System.err.println("Error during checkout: " + e.getMessage());
        }
		
//		HawaiianPizza hawaiianPizza1 = new HawaiianPizza();
//        System.out.println("Margherita Pizza 1:");
//        System.out.println(hawaiianPizza1);

        // Creating a MargheritaPizza object using the copy constructor
//        MargheritaPizza hawaiianPizza2 = new Hawaiian();
//        System.out.println("\nMargherita Pizza 2 (Copy of Margherita Pizza 1):");
//        System.out.println(margheritaPizza2);
//        
//        // Testing updatePizzaPrice method
//        margheritaPizza2.updatePizzaPrice();
//        System.out.println("\nUpdated Margherita Pizza 2:");
//        System.out.println(margheritaPizza2);
	}

}
