package week6_NullObject;

public class NullAnimal implements Animal {
	@Override
	public void makeSound() {
		System.out.println("No Sound!!!");
	}

	@Override
	public boolean doNilSound() {
		return true;
	}
}
