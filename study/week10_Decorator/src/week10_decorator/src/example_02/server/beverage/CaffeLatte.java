package example_02.server.beverage;

public class CaffeLatte extends Beverage {
	public CaffeLatte() {
		super();
		description = "CaffeLatte";
	}

	@Override
	public int cost() {
		return 5000;
	}
}
