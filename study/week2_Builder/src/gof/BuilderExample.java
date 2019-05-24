package gof;

/*
 * - √‚√≥
 *   - https://ko.wikipedia.org/wiki/%EB%B9%8C%EB%8D%94_%ED%8C%A8%ED%84%B4
 */
/** A given type of pizza being constructed */
public class BuilderExample {
	public static void main(String[] args) {
		Cook cook = new Cook();
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

		cook.setPizzaBuilder(hawaiianPizzaBuilder);
		cook.constructPizza();

		Pizza pizza = cook.getPizza();
	}
}
