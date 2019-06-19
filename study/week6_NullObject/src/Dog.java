package week6_NullObject;

public class Dog implements Animal {
	String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void makeSound() {
		System.out.println("woof!");
	}

	@Override
	public boolean doNilSound() {
		return false;
	}
}
