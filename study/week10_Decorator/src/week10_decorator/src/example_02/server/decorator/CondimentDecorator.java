package example_02.server.decorator;

import example_02.server.beverage.Beverage;

/*
 * 모든 첨가물들이 상속받아야 하는 클래스
 */
public abstract class CondimentDecorator extends Beverage {
	@Override
	public abstract String getDescription();
}
