package example_02.server.decorator;

import example_02.server.beverage.Beverage;

public class Shot extends CondimentDecorator {
	Beverage beverage;

	public Shot(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Shot";
	}

	@Override
	public int cost() {
		return beverage.cost() + 400;
	}
}
