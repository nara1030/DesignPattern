package example_02.server.decorator;

import example_02.server.beverage.Beverage;

public class Cream extends CondimentDecorator {
	Beverage beverage;

	public Cream(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Cream";
	}

	@Override
	public int cost() {
		return beverage.cost() + 500;
	}
}
