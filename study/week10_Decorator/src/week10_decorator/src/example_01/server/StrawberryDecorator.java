package example_01.server;

public class StrawberryDecorator extends Cake {
	private Cake cake;

	public StrawberryDecorator(Cake cake) {
		this.cake = cake;
	}

	@Override
	public String getCake() {
		return "Strawberry-" + cake.getCake() + "-Strawberry";
	}
}
