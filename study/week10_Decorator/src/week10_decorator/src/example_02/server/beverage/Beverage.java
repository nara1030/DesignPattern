package example_02.server.beverage;

/*
 * �Ǹ��ϴ� ��� ������� ��ӹ޾ƾ� �ϴ� Ŭ����
 */
public abstract class Beverage {
	String description = "no title"; // Beverage name

	public abstract int cost();

	public String getDescription() {
		return description;
	}
}
