package example_01.server;

public class CreamDecorator extends Cake {
	private Cake cake;

	public CreamDecorator(Cake cake) {
		this.cake = cake;
	}

	@Override
	public String getCake() {
		return "Cream-" + cake.getCake() + "-Cream";
	}
}
