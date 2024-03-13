package edu.mu.Cooking;
import edu.mu.AbstractPizza.*;
/**
 * Interface for the Cooking Strategy
 */
public interface ICookingStrategy 
{
	/**
	 * cook method
	 * @param pizza cook
	 * @return return
	 */
	public boolean cook(AbstractPizza pizza);
}
