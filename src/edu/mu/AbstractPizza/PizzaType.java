package edu.mu.AbstractPizza;

public enum PizzaType {
	HAWAIIAN,
	MARGHERITA,
	SUPREME,
	VEGETARIAN;

	private double toppingPrice;
	
	// Constructor
	private void PizzaTypes(double toppingPrice) 
	{
	    this.toppingPrice = toppingPrice;
	}
	
	// Getter method
	public double getToppingPrice() {
	    return toppingPrice;
	}
}