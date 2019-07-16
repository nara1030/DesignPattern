package example_02.server.beverage;

public class Americano extends Beverage {
	public Americano() {
		super();
		description = "Americano";
	}

	@Override
	public int cost() {
		return 4000;
	}
}
