package week6_NullObject;

/*
 * - 설명
 *   - NullAnimal은 Animal의 모든 메소드가 아무 일도 하지 않도록 구현
 *   - 아무 일이라는 것은 메소드, 아래 예에서 doNilSound()에 달려 있다.
 */
public class NullPatternDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal dog = AnimalFactory.getAnimal("Tommy");
		Animal cat = AnimalFactory.getAnimal("NULL");

		System.out.println("Animal's Sound");
		dog.makeSound();
		cat.makeSound();

		System.out.println("===========");

		if (dog.doNilSound() == false) {
			dog.makeSound();
		}

		if (cat.doNilSound() == false) {
			cat.makeSound();
		}
	}
}
