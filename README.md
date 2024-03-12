PROJECT OVERVIEW: 
The project invovles the development of an automated pizza ordering system, named FakeSpear 
Pizza Store, utilizing Java's Object-Orinted Programming principles and design patterns. The system comprises
an abstract base class, AbstractPizza, with subclasses representing distinct pizza varieties such as Margherita,
Vegetaria, Hawaiian, and Supreme. Enum classes define PizzaType, Toppings and CookingStyleType. Implementation
invovles creating copy constructors, overriding methods for calculating piza prices, and defining cooking strategies.
A PizzaOrder class manages orders, facilitating actions like adding/removing pizzas, selecting cooking strategies,
and generating bills. A PizzaCookingFactory creates pizzas with unique IDs. The Main class orchestrates system
operations, interacting with the PizzaOrder and PizzaCookingFactory classes to fulfill customer orders effectively.

WORK SPLIT:
Nitin M. Chava --> public AbstractPizza getPizzaByOrderID(int orderID) | public boolean addPizzaToCart(PizzaType pizzaType) | public boolean addNewToppingToPizza(int orderID, Toppings topping) | public boolean removeToppingFromPizza(int orderID, Toppings topping) | Implement a public class PizzaCookingFactory with a method public AbstractPizza createPizza(PizzaType pizzaType) | README.md
Matthew Robison --> PizzaType Enum | Cooking Style Enum | Sub Classes for Pizza | Hawaiian Pizza | Vegetarian Pizza | Protected double addTopingsToPrice(double priceWithoutToppings) | public double updatePizzaPrice() | public void printListOfToppingsByPizzaOrderID(int orderID)
Aditya Ramakrishnan --> Interface and Subclasses | Implement a constructor hat instantiates the pizzaCookingFactory and pizzaOrderList attributes | public boolean isThereAnyUncookedPizza() | public double checkout() throws Exception | public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType)
Abhi Pasupuleti --> Toppings Enum | Supreme Pizza | Margherita Pizza | protected double addTopingsToPrice(double priceWithoutToppings) | public double updatePizzaPrice() | public void printPizzaOrderCart(int orderID)

RUN PROGRAM:
1. In terminal "git clone https://github.com/aditya-ramki04/A-CS3330-Hw5.git"
2. Go into Eclipse and import the file: A-CS3330-Hw5
3. You can then click on the program and run it!





 



