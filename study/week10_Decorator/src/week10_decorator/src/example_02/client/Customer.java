package example_02.client;

import example_02.server.beverage.Americano;
import example_02.server.beverage.Beverage;
import example_02.server.beverage.CaffeLatte;
import example_02.server.decorator.Cream;
import example_02.server.decorator.Shot;
import util.Printer;

/*
 * https://gdtbgl93.tistory.com/9
 */
public class Customer {
	public static void main(String[] args) {
		Beverage beverage = new Americano();
		beverage = new Shot(beverage); // add shot
		beverage = new Cream(beverage); // add cream

		Printer.print("Menu: " + beverage.getDescription());
		Printer.print("Price: " + beverage.cost());

		// ÇÑ ¹ø¿¡-
		Printer.print("Menu: " + new Cream(new Shot(new CaffeLatte())).getDescription());
		Printer.print("Price: " + new Cream(new Shot(new CaffeLatte())).cost());
	}
}
