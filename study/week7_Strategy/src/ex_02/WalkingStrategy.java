package ex_02;

public class WalkingStrategy implements MovingStrategy {
	@Override
	public void move() {
		System.out.println("I can only walk.");
	}
}
