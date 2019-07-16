package example_02.server.beverage;

/*
 * 판매하는 모든 음료들이 상속받아야 하는 클래스
 */
public abstract class Beverage {
	String description = "no title"; // Beverage name

	public abstract int cost();

	public String getDescription() {
		return description;
	}
}
