package example_01.client;

import example_01.server.Cake;
import example_01.server.CreamDecorator;
import example_01.server.StrawberryDecorator;
import util.Printer;

/*
 * https://limkydev.tistory.com/80
 */
public class Main {
	public static void main(String[] args) {
		Cake cake = new Cake();
		Printer.print(cake.getCake());

		CreamDecorator creamCake = new CreamDecorator(cake);
		Printer.print(creamCake.getCake());

		StrawberryDecorator strawberryCake = new StrawberryDecorator(creamCake);
		Printer.print(strawberryCake.getCake());
		
		// ÇÑ ¹ø¿¡-
		Printer.print(new StrawberryDecorator(new CreamDecorator(new Cake())).getCake());
	}
}
