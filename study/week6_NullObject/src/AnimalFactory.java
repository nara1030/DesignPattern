package week6_NullObject;

public class AnimalFactory {
	public static final String[] names = { "Tommy", "Lucy" };

	public static Animal getAnimal(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new Dog(name);
			}
		}
		return new NullAnimal();
	}
}
