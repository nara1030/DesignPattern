package example_02.server.decorator;

import example_02.server.beverage.Beverage;

/*
 * ��� ÷�������� ��ӹ޾ƾ� �ϴ� Ŭ����
 */
public abstract class CondimentDecorator extends Beverage {
	@Override
	public abstract String getDescription();
}
