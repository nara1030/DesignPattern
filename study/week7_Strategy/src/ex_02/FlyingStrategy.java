package ex_02;

public class FlyingStrategy implements MovingStrategy {
	@Override
	public void move() {
		System.out.println("I can fly.");
	}
}
